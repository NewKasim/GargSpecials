package com.gargspecial.gargspecial;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.gargspecial.gargspecial.Model.User;
import com.gargspecial.gargspecial.Model.UserService;

@Controller
public class FormController {

      private final UserService userService;

    public FormController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/login")
public String processLogin(
        @RequestParam String email,
        @RequestParam String password,
        Model model
) {
    // Check credentials using UserService
    if (userService.checkCredentials(email, password)) {
        User user = new User();
        user.setName("User");  // Set the user name as needed
        model.addAttribute("user", user);  // Add user to the model
        return "greeting";  // Redirect to the greeting page
    } else {
        model.addAttribute("error", "Invalid credentials");
        return "login";  // Redirect back to the login page with an error message
    }
}



    // @PostMapping("/login")
    // public String processLogin(
    //         @RequestParam String email,
    //         @RequestParam String password,
    //         Model model
    // ) {
    //     // Simulate a simple authentication check
    //     if ("user@example.com".equals(email) && "password123".equals(password)) {
    //         model.addAttribute("username", "User");  // Add username to the model
    //         return "greeting";  // Redirect to a greeting page
    //     } else {
    //         model.addAttribute("error", "Invalid credentials");
    //         return "login";  // Redirect back to the login page with an error message
    //     }
    // }

    @GetMapping("/createAccount")
    public String createAccount() {
        return "createAccount";
    }


   
     @PostMapping("/createAccount")
    public String createAccount(
            @RequestParam String email,
            @RequestParam String password,
            Model model
    ) {
        // Save the user account information using the UserService
        userService.createUser(email, password);

        // Redirect to the login page after creating the account
        return "redirect:/login";
    }




    @GetMapping("/forgotPassword")
    public String forgotPassword() {
        return "forgotPassword";
    }
}
