package com.example.demo.controller;

import com.example.demo.repository.student;
import com.example.demo.student.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by oussa on 29/11/2017.
 */

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentRepository studentRespository ;

    @GetMapping(value = "/all")
    public List<student> findAll() {
        return studentRespository.findAll();
    }

    @GetMapping(value = "/name/{name}")
    public ArrayList<student> findByName(@PathVariable final String name){
        return studentRespository.findByName(name);
    }
    @GetMapping(value = "/class/{classe}")
    public ArrayList<student> findByClasse(@PathVariable final String classe){
        return  studentRespository.findByClasse(classe);
    }
    @GetMapping(value = "/niveau/{niveau}")
    public ArrayList<student> findByNiveau(@PathVariable final String niveau){
        return  studentRespository.findByNiveau(niveau);
    }

    @PutMapping(value="/update")
    public student update (@RequestBody final student Student)
    {studentRespository.save(Student) ;
        return Student;
    }

    @PostMapping(value = "/load")
    public student load(@RequestBody final student Student) {
        System.out.println("load");
        studentRespository.save(Student);
        return Student ;
    }

}
