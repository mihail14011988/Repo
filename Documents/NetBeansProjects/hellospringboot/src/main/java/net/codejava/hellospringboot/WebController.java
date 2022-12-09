/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.codejava.hellospringboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author MEGATRON2
 */
@Controller
public class WebController {
    @RequestMapping("/hello")
    public String hello(Model model){
        System.out.println("Olllaaalllla");
        model.addAttribute("message","welcome StringBoot Netbeans");
        System.out.println("Привет");
    return "hello";
    }
}
