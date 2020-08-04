package com.aryan.stock.stockexchange.dao;

import com.aryan.stock.stockexchange.entity.StockExchangeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockExchangeRepository extends JpaRepository<StockExchangeEntity, Long> {
}
