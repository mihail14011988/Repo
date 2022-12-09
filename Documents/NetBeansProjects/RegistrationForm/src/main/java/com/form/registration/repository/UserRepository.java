/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.form.registration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.form.registration.model.*;


public interface UserRepository extends JpaRepository<User, Long>{
   User findByEmail(String name); 
}
