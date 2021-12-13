package com.dangvandat.repository;

import com.dangvandat.entity.ClasszEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClasszRepository extends JpaRepository<ClasszEntity, Long> {
}
