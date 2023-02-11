package com.driver;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class OrderRepository {
    Map<String,Order> orderMap=new HashMap<>();
    Map<String,DeliveryPartner> deliveryPartnerMap=new HashMap<>();

    public void addOrder(Order order){
        String id=order.getId();
        orderMap.put(id,order);
    }
    public void addPartner(String partnerId){
        DeliveryPartner deliveryPartner=new DeliveryPartner(partnerId);
        deliveryPartnerMap.put(partnerId,deliveryPartner);
    }
    public Order getOrderById(String OrderId){
//        if(!orderMap.containsKey(OrderId)){
//            return null;
//        }
        return orderMap.get(OrderId);
    }

    public DeliveryPartner getPartnerById(String partnetId){
        return deliveryPartnerMap.get(partnetId);
    }
}
