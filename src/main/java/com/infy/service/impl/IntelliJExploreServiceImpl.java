package com.infy.service.impl;

import com.infy.entity.Student;
import com.infy.repository.IntelliJExploreRepository;
import com.infy.service.IntelliJExploreServ;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class IntelliJExploreServiceImpl implements IntelliJExploreServ {

    private final IntelliJExploreRepository repository;

    @Override
    public List<Student> getStudents() {

        return repository.findAll();

    }


}
