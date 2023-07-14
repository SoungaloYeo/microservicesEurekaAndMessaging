package com.soung.fraud;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FraudCheckHistoryRepository
        extends JpaRepository<FraudCheckHistory, Integer> {
}
