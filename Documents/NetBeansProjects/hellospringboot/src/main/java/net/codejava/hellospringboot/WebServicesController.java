/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.codejava.hellospringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebServicesController {
  @GetMapping("/rest")
    public String restTake(){
        System.out.println("Restingg....");
    return "Rest is ONLY succesly";
    }
}
