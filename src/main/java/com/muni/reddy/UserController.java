package com.muni.reddy;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {
	@Autowired 
	private UserService userService;
	@RequestMapping(path="/create/user",method=RequestMethod.GET)
	public ResponseEntity<String> createUser(@RequestBody User user){
		String string=null;
		if(user!=null){
			 string=	userService.createUser(user);
			if(string!=null){
				return new ResponseEntity<>(string,HttpStatus.OK);
			}
			return new ResponseEntity<>(string,HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(string,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	@RequestMapping(path="/update/user/{userId}",method=RequestMethod.PUT)
	public ResponseEntity<User> updateUser(@PathVariable("userId") String userId){
		User user=null;
		if(!StringUtils.isEmpty(userId)){
			 user=	userService.updateUser(userId);
			if(user!=null){
				return new ResponseEntity<>(user,HttpStatus.OK);
			}
			return new ResponseEntity<>(user,HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(user,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	@RequestMapping(path="/delete/user/{userId}",method=RequestMethod.DELETE)
	public ResponseEntity<String> deleteUser(@PathVariable("userId") String userId){
		String string=null;
		if(!StringUtils.isEmpty(userId)){
			 string=	userService.deleteUser(string);
			if(!StringUtils.isEmpty(string)){
				return new ResponseEntity<>(string,HttpStatus.OK);
			}
			return new ResponseEntity<>(string,HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(string,HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
