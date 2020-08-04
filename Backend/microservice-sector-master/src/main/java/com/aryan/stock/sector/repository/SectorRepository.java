package com.aryan.stock.sector.repository;

import com.aryan.stock.sector.entity.SectorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SectorRepository extends JpaRepository<SectorEntity, Long> {
}
