package com.student.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.demo.Model.StudentModel;

@Service
public class StudentService {
@Autowired
 StudentRepository dev;
public List<StudentModel>getdetails()
{
	return dev.findAll();
}


}
