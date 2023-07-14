package com.soung.clients.notification;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class NotificationRequest {
    private Integer toCustomerId;
    private String toCustomerName;
    private String message;
}
