package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Controller
public class StudentController {

    @RequestMapping("/welcome")
    public String homePage(Model model){

        model.addAttribute("name","Baturay");
        model.addAttribute("job","Developer");

        String subject = "Spring Boot";
        model.addAttribute("subject",subject);

        int studentID = new Random().nextInt();
        model.addAttribute("id",studentID);

        List<Integer> numbers = new ArrayList<>(Arrays.asList(4, 5, 6, 7));
        model.addAttribute("numbers",numbers);

        LocalDate dt = LocalDate.now();
        model.addAttribute("date",dt);

        return "student/welcome";
    }
}
