package com.wqy.springboot.controllers;

import com.wqy.springboot.entities.Person;
import com.wqy.starterhello.services.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class thymeleafController {

    // AutoConfigure试验
    @Autowired
    HelloService helloService;

    @RequestMapping("/thymeleaf")
    public String tf(Model model) {
        Person single = new Person(helloService.sayHello(), 11);
        List<Person> people = new ArrayList<Person>();
        Person p1 = new Person("xx", 11);
        Person p2 = new Person("yy", 22);
        Person p3 = new Person("zz", 33);
        people.add(p1);
        people.add(p2);
        people.add(p3);
        model.addAttribute("singlePerson", single);
        model.addAttribute("people", people);
        return "thymeleaf";
    }
}
