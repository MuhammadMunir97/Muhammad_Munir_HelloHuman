package com.muhammad.human;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("")
    public String name(@RequestParam(value="first_name", required = false) String firstName, @RequestParam(value="last_name", required = false) String lastName){
        firstName = ((firstName == null)  ? "Human" : firstName);
        String name = firstName + " " + ((lastName == null)  ? "" : lastName);
        return "<h1> Hello " + name + "</h1>" + "<br><br><br><br>" + "Welcome to SpringBoot!";
    }
}
