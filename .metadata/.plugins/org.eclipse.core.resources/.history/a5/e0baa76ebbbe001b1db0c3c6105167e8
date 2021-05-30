package com.example.controller;

import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Vo.StudentVo;

@RestController
@RequestMapping(path = "/home/student/")
public class StudentCotroller {

	private List<StudentVo> allStudent;

	@PostConstruct
	public List<StudentVo> allStudent() {
		return allStudent = Arrays.asList(new StudentVo(1, "Zafar", "new Delhi"),
				new StudentVo(2, "Ateef", "new Delhi"), new StudentVo(3, "Rasika", "new Delhi"));
	}

	@GetMapping(path = "get/all")
	public List<StudentVo> getallStudent() {
		return allStudent;
	}

	@GetMapping(path = "get/{studentId}")
	public StudentVo getStudent(@PathVariable("studentId") int studentId) {
		return allStudent.stream().filter(studentVo -> studentVo.getId() == studentId).findFirst().orElseThrow();
	}
}
