package in.strike.curdSpringBootDemo.controller;

import in.strike.curdSpringBootDemo.entity.Student;
import in.strike.curdSpringBootDemo.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    private StudentService studentService;
    public StudentController(StudentService studentService){
        this.studentService=studentService;
    }

    @PostMapping("/create")
    public ResponseEntity<Student> createStudent (@RequestBody Student student){
        System.out.println("Inside student controller");
     Student createdStudent= studentService.createStudent(student);
        System.out.println("Exit student Controller");
     return ResponseEntity.status(HttpStatus.CREATED).body(createdStudent);
    }
    //read student
    //update student
    //delete student

}
