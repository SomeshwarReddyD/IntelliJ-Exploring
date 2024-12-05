package com.infy.service.impl;

import com.infy.entity.Student;
import com.infy.repository.IntelliJExploreRepository;
import com.infy.service.IntelliJExploreServ;
import lombok.AllArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class IntelliJExploreServiceImpl implements IntelliJExploreServ {

    private final IntelliJExploreRepository repository;

    private final AuthenticationManager authenticationManager;

    private final JWTServiceImpl jwtService;

    @Override
    public List<Student> getStudents() {
        return repository.findAll();
    }

    @Override
    public String verifyAndProvideJWT(Student student) {

        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(student.getUsername(), student.getPassword());

        Authentication authenticatedUserObject = authenticationManager.authenticate(authenticationToken);

        if (authenticatedUserObject.isAuthenticated()) {
            return jwtService.generateJWTToken(student.getUsername());
        }
        return "fail";
    }


}
