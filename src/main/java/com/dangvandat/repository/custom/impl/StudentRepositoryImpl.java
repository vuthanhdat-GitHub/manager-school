package com.dangvandat.repository.custom.impl;

import com.dangvandat.builder.StudentBuilder;
import com.dangvandat.dto.output.StudentOutput;
import com.dangvandat.entity.StudentEntity;
import com.dangvandat.repository.custom.StudentRepositoryCustom;
import com.dangvandat.util.BuildMapUtils;
import com.dangvandat.util.repository.RepositoryCustomUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class StudentRepositoryImpl extends RepositoryCustomUtils<StudentEntity> implements StudentRepositoryCustom {

    @Autowired
    private BuildMapUtils buildMapUtils;

    @Override
    public List<StudentOutput> findAllStudent(StudentBuilder studentBuilder, Pageable pageable) {
        Map<String, Object> parameter = buildMapUtils.buildMapSearch(studentBuilder);
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT ");
        sql.append("    s.name , ");
        sql.append("    s.id_classz , ");
        sql.append("    s.birthday , ");
        sql.append("    s.gender , ");
        sql.append("    s.number_phone , ");
        sql.append("    s.id_code , ");
        sql.append("    FROM students s ");
        sql.append("WHERE 1=1 ");
        return this.getResultList(sql.toString() , parameter ,  "findAllStudent" , pageable);
    }
}
