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
        return student;
    }
}
