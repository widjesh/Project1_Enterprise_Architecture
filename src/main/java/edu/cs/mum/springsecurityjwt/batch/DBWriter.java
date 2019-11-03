package edu.cs.mum.springsecurityjwt.batch;

import edu.cs.mum.springsecurityjwt.Model.Student;
import edu.cs.mum.springsecurityjwt.repository.StudentRepository;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DBWriter implements ItemWriter<Student> {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void write(List<? extends Student> students) throws Exception {
        studentRepository.saveAll(students);
        System.out.println("Saved...");
    }
}
