package com.muccio.aula.services;

import com.muccio.aula.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderService {


    private ShippingService shippingService;
    private DiscountService discountService;

    public OrderService(ShippingService shippingService, DiscountService discountService) {
        this.shippingService = shippingService;
        this.discountService = discountService;
    }

    public Double total(Order order) {
        return order.getBasic() - discountService.discount(order) + shippingService.shipment(order);
    }
}
