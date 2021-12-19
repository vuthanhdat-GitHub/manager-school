package com.dangvandat.repository.custom;

import com.dangvandat.builder.StudentBuilder;
import com.dangvandat.dto.output.StudentOutput;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface StudentRepositoryCustom {
    List<StudentOutput> findAllStudent(StudentBuilder studentBuilder, Pageable pageable);
}
