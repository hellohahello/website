package com.duxiaoyue.service.impl;

import com.duxiaoyue.dao.mapper.StudentMapper;
import com.duxiaoyue.entity.Student;
import com.duxiaoyue.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 一笑奈何
 * @create 2019-04-10 20:16
 * @desc
 **/
@Service("studentService")
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;
    @Override
    public void insertUser(Student student) {
studentMapper.insertStudent(student);
    }

    @Override
    public Student findById(Integer id) {
        Student student = studentMapper.findById(id);
        return student;
    }
}
