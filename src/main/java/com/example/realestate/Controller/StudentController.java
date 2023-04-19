package com.example.realestate.Controller;

import com.example.realestate.Bean.Student;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController

public class StudentController {
    @GetMapping("Student")
    public Student getStudent(){
        Student student=new Student(31436752,"Bonface","Maina","mainabonface4@gmail.com")
                ;
        Student student1=new Student(31436752,"Pauline","Wambugu","pauline4@gmail.com");
   return student1;
    }
    @GetMapping("students")
    public List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1223, "manases", "boododood",
                "eyeyeey"));
        students.add(new Student(344, "dedeeee", "ddeeeeee", "ffff"));

        return students;
    }
    @GetMapping("pathvariable/{id}/{firstName}/{lastName}/{emailAddress}")
    public Student studentAddPathVariable(@PathVariable("id") long idnumber,
                                          @PathVariable("firstName") String firstName,
                                          @PathVariable("lastName") String lastName,
                                          @PathVariable("emailAddress") String emailAddress){
        Student students=new Student(idnumber,firstName,lastName,emailAddress);
        return students;

    }
    @PostMapping("studentpost")
    @ResponseStatus(HttpStatus.CREATED)
    public Student addStudents(@RequestBody Student student){
        System.out.println(student.getId());
        System.out.println(student.getFirstName());
        System.out.println(student.getLastName());
        System.out.println(student.getEmailAddress());
        return student;
    }



}
