package com.example.demo.contrroller;
import com.example.demo.entity.Stuentity;
import com.example.demo.service.StudentService;
import 


@RestController

public class StudentController {
    @Autowired
    StudentService studentService;
    @postMapping("/postdata")
    public Student postdata(@RequestBody Student student){
        return studentService.saveStudent(student);
    }
}