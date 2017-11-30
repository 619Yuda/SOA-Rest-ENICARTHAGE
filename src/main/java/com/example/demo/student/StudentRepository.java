package com.example.demo.student;

import com.example.demo.repository.student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by oussa on 29/11/2017.
 */
public interface StudentRepository extends JpaRepository<student,Long> {
    ArrayList<student> findByName(String name );
    ArrayList<student> findByNiveau(String niveau );
    ArrayList<student> findByClasse(String classe );
    student findById(String  id );

}
