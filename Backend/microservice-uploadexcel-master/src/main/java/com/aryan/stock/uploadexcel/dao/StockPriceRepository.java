package com.aryan.stock.uploadexcel.dao;

import com.aryan.stock.uploadexcel.entity.StockPriceEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockPriceRepository extends JpaRepository<StockPriceEntity, Long> {
}
