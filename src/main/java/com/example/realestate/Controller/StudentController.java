package com.example.realestate.Controller;

import com.example.realestate.Bean.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("students")
public class StudentController {
    @GetMapping()
    public ResponseEntity<Student> getStudent(){
        Student student=new Student(31436752,"Bonface","Maina","mainabonface4@gmail.com")
                ;
        Student student1=new Student(31436752,"Pauline","Wambugu","pauline4@gmail.com");
   return new ResponseEntity<>(student,HttpStatus.OK);
    }
    @GetMapping()
    public ResponseEntity<List<Student> >getStudents() {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1223, "manases", "boododood",
                "eyeyeey"));
        students.add(new Student(344, "dedeeee", "ddeeeeee", "ffff"));

        return ResponseEntity.ok(students);
    }
    @GetMapping("pathvariable/{id}/{firstName}/{lastName}/{emailAddress}")
    public ResponseEntity<Student>studentAddPathVariable(@PathVariable("id") long idnumber,
                                          @PathVariable("firstName") String firstName,
                                          @PathVariable("lastName") String lastName,
                                          @PathVariable("emailAddress") String emailAddress){
        Student students=new Student(idnumber,firstName,lastName,emailAddress);
        return ResponseEntity.ok(students);

    }
    @PostMapping("create")
    //@ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Student> addStudents(@RequestBody Student student){
        System.out.println(student.getId());
        System.out.println(student.getFirstName());
        System.out.println(student.getLastName());
        System.out.println(student.getEmailAddress());
        return new ResponseEntity<>(student,HttpStatus.CREATED);
    }
    @PutMapping("{id}/update")


    public ResponseEntity<Student> updateStudent(@RequestBody Student student,@PathVariable("id") int studentId){
        System.out.println(student.getFirstName());
        System.out.println(student.getLastName());
        System.out.println(student.getEmailAddress());
        return ResponseEntity.ok(student);
    };
    @DeleteMapping("{id}/delete")
    public ResponseEntity<String> deleteStudent(@PathVariable("id") int studentId){


        return ResponseEntity.ok("Student deleted successfully");

    }



}
