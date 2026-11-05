package com.spring.spring_demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.spring.spring_demo.Student;


@RestController
public class sampleRestController {
    
    private Student myStudent;   
    private Student anotherStudent;
    
    public sampleRestController(@Qualifier("elementaryStudent") Student student){
        myStudent = student;        
    }

    /*
    @GetMapping("/check")
    public String checkScope(){
        return "myStudent == anotherStudent? " + (myStudent == anotherStudent);
    }*/  

    /*
    @Autowired
    public void setStudent(@Qualifier("universityStudent") Student student) {
        myStudent = student;
    }*/

    @GetMapping("/assignment")
    public String getDailyAssignment() {
        return myStudent.getDailyAssignment();
    }
}
