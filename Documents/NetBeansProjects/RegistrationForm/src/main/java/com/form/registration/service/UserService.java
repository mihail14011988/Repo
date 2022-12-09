/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.form.registration.service;

import com.form.registration.model.User;
import com.form.registration.web.dto.UserRegistrDto;
import org.springframework.security.core.userdetails.UserDetailsService;




public interface UserService extends UserDetailsService{
    User save(UserRegistrDto usd);
}
