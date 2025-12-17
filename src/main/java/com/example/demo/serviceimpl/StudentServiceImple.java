package com.example.demo.serviceimpl;
import com.example.demo.service.StudentService;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Stuentity;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class StudentServiceImple implements StudentService{
    // private final StudentRepository studentRepository;
    // public StudentServiceImple(StudentRepository studentRepository){
    //     this.studentRepository=studentRepository;
    // }
    @Autowired
    public Stuentity saveStudent(Stuentity student){
        return studentRepository.save(student);
    }
}