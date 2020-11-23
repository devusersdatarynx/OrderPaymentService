package com.datarynx.order.service.api.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*Payment DTO class*/

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {

    private int paymentId;
    private String paymentStatus;
    private String transactionId;
    private int orderId;
    private double amount;
}
