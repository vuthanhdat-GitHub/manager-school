package com.dangvandat.service;

import com.dangvandat.builder.StudentBuilder;
import com.dangvandat.dto.StudentDTO;
import com.dangvandat.dto.input.StudentInsertInput;
import com.dangvandat.util.response.PageList;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface StudentService {
    StudentDTO save(StudentDTO input);
    PageList<StudentDTO> findAllStudent(Pageable pageable);
    PageList<StudentDTO> findAllStudent(StudentBuilder studentBuilder , Pageable pageable);
    List<StudentDTO> findAll();
    StudentDTO update(Long id, StudentDTO update);
    void delete(List<Long> ids);
}
