package edu.cs.mum.springsecurityjwt.batch;

import edu.cs.mum.springsecurityjwt.Model.Student;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class Processor implements ItemProcessor<Student, Student> {

    @Override
    public Student process(Student student) throws Exception {
        System.out.println("Data Saved for Users " + student);
        Integer age = student.getAge();
        Integer date = 2019-age;
        student.setAge(date);
        return student;
    }
}
