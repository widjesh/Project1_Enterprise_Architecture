package edu.cs.mum.springsecurityjwt.repository;

import edu.cs.mum.springsecurityjwt.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {
    
}
