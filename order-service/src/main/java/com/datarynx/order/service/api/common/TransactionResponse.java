package com.datarynx.order.service.api.common;


import com.datarynx.order.service.api.entity.Order;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*DTO for TransactionResponse*/

 @Data
@AllArgsConstructor
@NoArgsConstructor
public class TransactionResponse {
    private Order order;
    private double amount;
    private String transactionId;
    private String message;
}
