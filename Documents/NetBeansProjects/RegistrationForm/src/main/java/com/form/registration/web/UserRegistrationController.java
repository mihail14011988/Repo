
package com.form.registration.web;

import com.form.registration.model.User;
import com.form.registration.service.UserService;
import com.form.registration.web.dto.UserRegistrDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/registration")
public class UserRegistrationController {
    
    private UserService service;

    public UserRegistrationController(UserService service) {
        super();
        this.service = service;
    }
    /*Model param */
    @ModelAttribute("user")
    public UserRegistrDto userDto(){
    return new UserRegistrDto();
    }
    
    @GetMapping
    public String registrationForm(/*Model model*/){
  //  model.addAttribute("user", new UserRegistrDto());
    return "registration";
    }
    @PostMapping
    public String registrAccount(@ModelAttribute("user") UserRegistrDto userDto){
        service.save(userDto);
    return "redirect:/registration?success";
    }
}
