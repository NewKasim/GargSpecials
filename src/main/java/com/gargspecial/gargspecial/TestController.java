package com.gargspecial.gargspecial;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.gargspecial.gargspecial.Model.User;

@Controller
public class TestController {

    @GetMapping("/create")
    public String getCreate(Model model) {
        model.addAttribute("user", new User());
        return "create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute User user, Model model) {
        System.out.println(user.getName());
        model.addAttribute("user", user);
        return "greeting";
    }
}
