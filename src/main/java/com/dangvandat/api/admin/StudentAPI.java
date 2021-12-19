package com.dangvandat.api.admin;

import com.dangvandat.constants.AppConstant;
import com.dangvandat.dto.StudentDTO;
import com.dangvandat.service.StudentService;
import com.dangvandat.util.FormUtil;
import com.dangvandat.util.response.PageList;
import com.dangvandat.util.response.ResponseEntityBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/admin/student")
public class StudentAPI {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "", method = RequestMethod.POST)
    public ResponseEntity<?> save(@RequestBody StudentDTO input) {
        input = studentService.save(input);
        return ResponseEntityBuilder.getBuilder()
                .setDetails(input)
                .setMessage(AppConstant.message.student.SAVE_SUCCESS)
                .build();
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ResponseEntity<?> findAllStudent(@RequestParam Map<String, String> model) {
        Pageable pageable = FormUtil.toPageable(model);
        PageList<StudentDTO> result = studentService.findAllStudent(pageable);
        return ResponseEntityBuilder.getBuilder()
                .setMessage(AppConstant.message.student.FIND_SUCCESS)
                .setDetails(result)
                .build();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public ResponseEntity<?> update(@PathVariable("id") Long id,
                                    @RequestBody StudentDTO update) {
        update = studentService.update(id, update);
        return ResponseEntityBuilder.getBuilder()
                .setDetails(update)
                .setMessage(AppConstant.message.student.UPDATE_SUCCESS)
                .build();
    }

    @RequestMapping(value = "", method = RequestMethod.DELETE)
    public ResponseEntity<?> delete(@RequestParam("ids") List<Long> ids) {
        studentService.delete(ids);
        return ResponseEntityBuilder.getBuilder()
                .setMessage(AppConstant.message.student.DELETE_SUCCESS)
                .build();
    }

}
