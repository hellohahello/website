package  com.duxiaoyue.entity;

import lombok.Data;

import java.io.Serializable;
@Data
public class Student implements Serializable {
    private Integer id;
    private String name;
    private Integer age;


    public Student() {
    }

    public Student(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}