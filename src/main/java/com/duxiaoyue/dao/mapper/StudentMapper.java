package com.duxiaoyue.dao.mapper;

import com.duxiaoyue.entity.Student;

/**
 * @author 一笑奈何
 * @create 2019-04-10 19:33
 * @desc
 **/

public interface StudentMapper {
    public void insertStudent(Student student);
    public Student findById(Integer id);
}
