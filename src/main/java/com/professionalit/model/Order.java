package com.professionalit.model;


import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.professionalit.event.OrderType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Order {

    private String orderId;

    private String accountNumber;

    private String symbol;

    private OrderType side;

    private int quantity;

    private BigDecimal price;

    private LocalDateTime createdAt;
}
