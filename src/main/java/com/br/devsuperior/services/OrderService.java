package com.br.devsuperior.services;

import com.br.devsuperior.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private ShippingService shippingService;

    public Double total(Order order){
        Double valueDiscont = calculeDiscont(order);
        Double valueShipping = shippingService.shipment(order);
        return ((order.getBasic() - valueDiscont) + valueShipping);
    }

    private Double calculeDiscont(Order order) {
        return order.getBasic() * (order.getDiscont() / 100);
    }
}
