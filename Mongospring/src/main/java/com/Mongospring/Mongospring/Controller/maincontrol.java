package com.Mongospring.Mongospring.Controller;

import com.Mongospring.Mongospring.Model.student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class maincontrol {


    @Autowired
    stdrepo stdrepo;
    @PostMapping("/addstudent")
    public void addstudent(@RequestBody student student){
        stdrepo.save(student);


    }
}
