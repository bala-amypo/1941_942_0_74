package com.example.demo.contrroller;
import org.springframework.bean.factor
import com.example.demo.entity.Stuentity;
import com.example.demo.service.StudentService;
import org.springframework.web.bind.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;


@RestController

public class StudentController {
    @Autowired
    StudentService studentService;
    @postMapping("/postdata")
    public Student postdata(@RequestBody Student student){
        return studentService.saveStudent(student);
    }
}