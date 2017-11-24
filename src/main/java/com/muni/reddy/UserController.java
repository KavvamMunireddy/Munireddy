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
	private UserService service;
	@RequestMapping(path="/create/user",method=RequestMethod.POST)
	public ResponseEntity<String> createUser(@RequestBody User user){
		String string=null;
		if(user!=null){
			 string=	service.createUser(user);
			if(string!=null){
				return new ResponseEntity<>(string,HttpStatus.OK);
			}
			return new ResponseEntity<>(string,HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(string,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	@RequestMapping(path="/update/user/{userId}",method=RequestMethod.PUT)
	public ResponseEntity<String> updateUser(@PathVariable("userId") String userId){
		String string=null;
		if(!StringUtils.isEmpty(userId)){
			 string=	service.updateUser(userId);
			if(string!=null){
				return new ResponseEntity<>(string,HttpStatus.OK);
			}
			return new ResponseEntity<>(string,HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(string,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	@RequestMapping(path="/delete/user/{userId}",method=RequestMethod.DELETE)
	public ResponseEntity<String> deleteUser(@PathVariable("userId") String userId){
		String string=null;
		if(!StringUtils.isEmpty(userId)){
			 string=	service.deleteUser(string);
			if(!StringUtils.isEmpty(string)){
				return new ResponseEntity<>(string,HttpStatus.OK);
			}
			return new ResponseEntity<>(string,HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(string,HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
