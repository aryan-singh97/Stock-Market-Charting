package com.aryan.stock.company.dao;

import com.aryan.stock.company.entity.IPODetailEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IPORepository extends JpaRepository<IPODetailEntity, Long> {
    List<IPODetailEntity> findAllByOrderByOpenDate();
}
