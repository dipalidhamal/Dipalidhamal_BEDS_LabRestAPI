package com.greatlearning.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.greatlearning.dto.UserRegistrationDto;
import com.greatlearning.model.User;



public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
