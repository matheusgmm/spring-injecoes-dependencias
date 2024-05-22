package com.muccio.aula.services;

import com.muccio.aula.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class DiscountService {

    public Double discount(Order order) {
        return (order.getBasic() * order.getDiscount()) / 100;
    }
}
