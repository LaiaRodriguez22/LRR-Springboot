package com.example.demo.student;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table
public class Student {
      @Id
      @SequenceGenerator(
              name= "student_seq",
              sequenceName = "student_seq",
              allocationSize = 1
      )
      @GeneratedValue(
              strategy = GenerationType.SEQUENCE,
              generator = "student_seq"
      )
      private Long id;
      private String name;
      private String email;
      private Integer age;
      private LocalDate birth;

      public Student() {
      }

      public Student(Long id, String name, String email, Integer age, LocalDate birth) {
            this.id = id;
            this.name = name;
            this.email = email;
            this.age = age;
            this.birth = birth;
      }

      public Student(String name, String email, Integer age, LocalDate birth) {
            this.name = name;
            this.email = email;
            this.age = age;
            this.birth = birth;
      }

      public Long getId() {
            return id;
      }

      public void setId(Long id) {
            this.id = id;
      }

      public String getName() {
            return name;
      }

      public void setName(String name) {
            this.name = name;
      }

      public String getEmail() {
            return email;
      }

      public void setEmail(String email) {
            this.email = email;
      }

      public Integer getAge() {
            return age;
      }

      public void setAge(Integer age) {
            this.age = age;
      }

      public LocalDate getBirth() {
            return birth;
      }

      public void setBirth(LocalDate birth) {
            this.birth = birth;
      }

      @Override
      public String toString() {
            return "Student{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", email='" + email + '\'' +
                    ", age=" + age +
                    ", birth=" + birth +
                    '}';
      }
}
