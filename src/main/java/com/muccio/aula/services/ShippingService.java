package com.muccio.aula.services;

import com.muccio.aula.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public Double shipment(Order order) {
        if (order.getBasic() <= 20.00) {
            return 20.00;
        } else {
            return order.getBasic() >= 100.00 && order.getBasic() <= 200.00 ? 12.00 : 0.00;
        }
    }
}
