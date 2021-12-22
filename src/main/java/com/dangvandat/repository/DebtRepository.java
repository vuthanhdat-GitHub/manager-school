package com.dangvandat.repository;

import com.dangvandat.entity.DebtEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DebtRepository extends JpaRepository<DebtEntity, Long> {
}
