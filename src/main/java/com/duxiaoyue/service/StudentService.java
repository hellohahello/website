package com.duxiaoyue.service;

import com.duxiaoyue.entity.Student;

/**
 * @author 一笑奈何
 * @create 2019-04-10 20:16
 * @desc
 * @Version 1.0
 **/
public interface StudentService {
   void insertUser(Student student);
   Student findById(Integer id);
}
