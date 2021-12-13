package com.dangvandat.repository;

import com.dangvandat.entity.DebtEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DebtRopository extends JpaRepository<DebtEntity, Long> {
}
