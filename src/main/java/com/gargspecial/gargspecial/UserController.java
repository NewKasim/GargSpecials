// package com.gargspecial.gargspecial;
// import org.springframework.stereotype.Controller;
// import org.springframework.ui.Model;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.ModelAttribute;
// import org.springframework.web.bind.annotation.PostMapping;

// import com.gargspecial.gargspecial.Model.User;

// @Controller
// public class UserController {

//     @GetMapping("/create")
//     public String Getcreate(Model model) {
//         model.addAttribute("user", new User());
//         return "create";
//     }
//     @PostMapping("/create")
//     public String create(@ModelAttribute User user){
//         System.out.println(user.getName());
//         return "/create";
//     }



// }
