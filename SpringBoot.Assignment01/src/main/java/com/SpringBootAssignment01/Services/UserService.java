package com.SpringBootAssignment01.Services;

import java.util.List;

import com.SpringBootAssignment01.Entity.User;
import com.SpringBootAssignment01.Web.Dto.UserRegDto;

public interface UserService {
  
	List<UserRegDto> getAllUser();
	UserRegDto getById(UserRegDto userDto,Long id);
	UserRegDto createUser(UserRegDto userDto);
	UserRegDto updateUser(UserRegDto userDto, Long id);
	void deleteUser(Long id);
	
}
