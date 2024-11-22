package com.infy.controller;

import com.infy.entity.Student;
import com.infy.service.IntelliJExploreServ;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/student")
@AllArgsConstructor
public class IntelliJExplorController {

    private final IntelliJExploreServ service;

    @GetMapping("/students")
    public ResponseEntity<List<Student>> getStudents(){

        return new ResponseEntity<>(service.getStudents(), HttpStatus.OK);
    }
}
