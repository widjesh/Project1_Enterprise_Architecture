package edu.cs.mum.springsecurityjwt.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.time.LocalDate;

@Entity
public class Student {
    @Id
    private Integer id;
    private String firstname;
    private String lastname;
    private String gpa;
    @Transient
    private Integer age;
    private LocalDate date;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Student() {
    }

    public Student(Integer id, String firstname, String lastname, String gpa, Integer age, LocalDate date) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.gpa = gpa;
        this.age = age;
        this.date = date;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getGpa() {
        return gpa;
    }

    public void setGpa(String gpa) {
        this.gpa = gpa;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
        try{
            this.date = LocalDate.now().minusYears(age);
        }catch(Exception err){
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", gpa='" + gpa + '\'' +
                ", age=" + age +
                '}';
    }
}
