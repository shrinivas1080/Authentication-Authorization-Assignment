package com.SpringBootAssignment01.Services;


import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringBootAssignment01.Entity.User;
import com.SpringBootAssignment01.Reository.UserRepository;
import com.SpringBootAssignment01.Web.Dto.UserRegDto;
@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepo;

	@Override
	public List<UserRegDto> getAllUser() {
	return null;
	}

	@Override
	public UserRegDto getById(UserRegDto userDto, Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserRegDto createUser(UserRegDto userDto) {
		User user = this.DtoToUser(userDto);
		User saveUser = this.userRepo.save(user);
		return this.UserToDto(saveUser);
	}

	@Override
	public UserRegDto updateUser(UserRegDto userDto, Long id) {
		
		return null;
	}
	@Override
	public void deleteUser(Long id) {
		// TODO Auto-generated method stub
		
	}
	
    public User DtoToUser(UserRegDto userDto) {
		User user = new User();
		user.setId(userDto.getId());
		user.setFirstName(userDto.getFirstName());
		user.setLastName(userDto.getLastName());
		user.setEmail(userDto.getEmail());
		user.setPassword(userDto.getPassword());
		
		return user;
    }

     public UserRegDto UserToDto(User user) {
    	 UserRegDto userDto = new UserRegDto();
    	 userDto.setId(user.getId());
    	 userDto.setFirstName(user.getFirstName());
    	 userDto.setLastName(user.getLastName());
    	 userDto.setEmail(user.getEmail());
    	 userDto.setPassword(user.getPassword());
    	 return userDto;
     }
	    
	}

