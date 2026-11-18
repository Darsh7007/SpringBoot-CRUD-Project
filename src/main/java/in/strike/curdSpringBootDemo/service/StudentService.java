package in.strike.curdSpringBootDemo.service;

import in.strike.curdSpringBootDemo.entity.Student;
import in.strike.curdSpringBootDemo.repository.StudentRepository;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private StudentRepository studentRepository;
    public StudentService(StudentRepository studentRepository){
        this.studentRepository=studentRepository;
    }
    public Student createStudent(Student studentReq){
        System.out.println("Inside student service");
      Student studentResp= studentRepository.saveStudent(studentReq);
        System.out.println("Exit student service");
      return studentResp;
    }
}
