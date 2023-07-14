package com.soung.clients.fraud;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
public @Data class FraudCheckResponse {
         private Boolean isFraudster;
}
