package in.strike.curdSpringBootDemo.repository;

import in.strike.curdSpringBootDemo.entity.Student;
import org.springframework.stereotype.Component;

@Component
public class StudentRepository {
    public Student saveStudent(Student student){
        System.out.println("Inside student Repository");
        System.out.println("Exit student Repository");
        Student s1= new Student();
        s1.setName("Darshan");
        s1.setEmail("Darshan123");
        s1.setAge(22);
        s1.setRollNo(39);
      return s1;
    }
}
