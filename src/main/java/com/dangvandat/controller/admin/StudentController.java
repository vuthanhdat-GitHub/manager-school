package com.dangvandat.controller.admin;

import com.dangvandat.converter.Converter;
import com.dangvandat.dto.StudentDTO;
import com.dangvandat.service.StudentService;
import com.dangvandat.util.FormUtil;
import com.dangvandat.util.response.PageList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/admin/student", method = RequestMethod.GET)
    public ModelAndView listPageStudent(@RequestParam Map<String, String> model){
        ModelAndView modelAndView = new ModelAndView("admin/student/list");
        Pageable pageable = FormUtil.toPageable(model);
        PageList<StudentDTO> result = new PageList<>();
        if(model.get("id") != "" && model.get("id") != null){
            List<StudentDTO> studentDTO = new ArrayList<>();
            studentDTO.add(studentService.findOne(Long.parseLong(model.get("id"))));
            result.setList(studentDTO);
        }else {
            result = studentService.findAllStudent(pageable);
        }
        modelAndView.addObject("list", result);
        return modelAndView;
    }

    @RequestMapping(value = "/admin/student/edit", method = RequestMethod.GET)
    public ModelAndView studentUpdate(@RequestParam Map<String, String> model){
        ModelAndView modelAndView = new ModelAndView("admin/student/edit");
        StudentDTO studentDTO = new StudentDTO();
        if(model.get("id") != null){
            Long id = Long.parseLong(model.get("id"));
            studentDTO = studentService.findOne(id);
        }
        modelAndView.addObject("studentDTO", studentDTO);
        return modelAndView;
    }
}
