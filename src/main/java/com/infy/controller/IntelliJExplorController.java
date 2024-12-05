package com.infy.controller;

import com.infy.entity.Student;
import com.infy.service.IntelliJExploreServ;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@AllArgsConstructor
public class IntelliJExplorController {

    private final IntelliJExploreServ service;

    @GetMapping("login")
    public ResponseEntity<?> login(@RequestBody Student student) {
        return new ResponseEntity<>(service.verifyAndProvideJWT(student), HttpStatus.OK);
    }

    @RequestMapping(value = "/students", method = RequestMethod.GET)
    public ResponseEntity<List<Student>> getStudents(){

        return new ResponseEntity<>(service.getStudents(), HttpStatus.OK);
    }
}
