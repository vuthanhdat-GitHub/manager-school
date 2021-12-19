package com.dangvandat.service.impl;

import com.dangvandat.builder.StudentBuilder;
import com.dangvandat.converter.Converter;
import com.dangvandat.dto.StudentDTO;
import com.dangvandat.dto.input.StudentInsertInput;
import com.dangvandat.entity.StudentEntity;
import com.dangvandat.repository.StudentRepository;
import com.dangvandat.service.StudentService;
import com.dangvandat.util.CommonUtils;
import com.dangvandat.util.error.CustomException;
import com.dangvandat.util.response.PageList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    @Transactional
    public StudentDTO save(StudentDTO input){
        StudentEntity entity = Converter.toModel(input, StudentEntity.class);
        entity = studentRepository.save(entity);
        return Converter.toModel(entity, StudentDTO.class);
    }

    @Override
    public PageList<StudentDTO> findAllStudent(StudentBuilder studentBuilder , Pageable pageable) {
        PageList<StudentDTO> result = new PageList<>();
        List<StudentDTO> studentDTOS = Converter.toList(studentRepository.findAll(), StudentDTO.class);
        result.getList(studentDTOS);
        Long count = studentRepository.count();
        result.setTotal(count);
        result.setCurrentPage(pageable.getPageNumber() + 1);
        result.setPageSize(pageable.getPageSize());
        result.setSuccess(true);
        result.getTotalPage((int) Math.ceil((double) Integer.parseInt(count.toString()) / pageable.getPageSize()));
        return result;
    }

    @Override
    @Transactional
    public StudentDTO update(Long id, StudentDTO update) {
        update.setId(id);
        StudentEntity entity = studentRepository.findOne(update.getId());
        if(Objects.isNull(entity)){
            throw new CustomException("STUDENT NOT FOUNT" , CommonUtils.putError("StudentDTO" , ""));
        }
        StudentEntity studentEntity = Converter.toModel(update, StudentEntity.class);
        studentEntity = studentRepository.save(studentEntity);
        return Converter.toModel(studentEntity, StudentDTO.class);
    }

    @Override
    @Transactional
    public void delete(List<Long> ids) {
        for(Long id: ids){
            StudentEntity studentEntity = studentRepository.findOne(id);
            if(Objects.isNull(studentEntity)){
                throw new CustomException("STUDENT IS NULL", CommonUtils.putError("studentId", "ERR_0034"));
            }
            studentRepository.save(studentEntity);
        }
    }

    @Override
    public PageList<StudentDTO> findAllStudent(Pageable pageable) {
        return null;
    }

    @Override
    public List<StudentDTO> findAll() {
        return null;
    }
}
