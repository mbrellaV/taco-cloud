package com.mbrella.tacocloud.repositories;

import com.mbrella.tacocloud.Order;
import com.mbrella.tacocloud.user.User;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.List;

public interface OrderRepository
        extends CrudRepository<Order, Long> {
    List<Order> findByDeliveryZip(String deliveryZip);
    List<Order> readOrdersByDeliveryZipAndPlacedAtBetween(
            String deliveryZip, Date startDate, Date endDate);
    List<Order> findByUserOrderByPlacedAtDesc(
            User user, Pageable pageable);
//    List<Order> findByDeliveryToAndDeliveryCityAllIgnoresCase(
//            String deliveryTo, String deliveryCity);
//    List<Order> findByDeliveryCityOrderByDeliveryTo(String city);
}