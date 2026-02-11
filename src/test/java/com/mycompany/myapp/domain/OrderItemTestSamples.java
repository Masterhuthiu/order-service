package com.mycompany.myapp.domain;

import java.util.Random;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

public class OrderItemTestSamples {

    private static final Random random = new Random();
    private static final AtomicInteger intCount = new AtomicInteger(random.nextInt() + (2 * Short.MAX_VALUE));

    public static OrderItem getOrderItemSample1() {
        return new OrderItem().id("id1").movieId("movieId1").movieTitle("movieTitle1").quantity(1);
    }

    public static OrderItem getOrderItemSample2() {
        return new OrderItem().id("id2").movieId("movieId2").movieTitle("movieTitle2").quantity(2);
    }

    public static OrderItem getOrderItemRandomSampleGenerator() {
        return new OrderItem()
            .id(UUID.randomUUID().toString())
            .movieId(UUID.randomUUID().toString())
            .movieTitle(UUID.randomUUID().toString())
            .quantity(intCount.incrementAndGet());
    }
}
