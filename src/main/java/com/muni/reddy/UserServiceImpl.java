package com.muni.reddy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;

	@Override
	public String createUser(User user) {
		return userDao.createUser(user);
	}

	@Override
	public String deleteUser(String userId) {
		return userDao.deleteUser(userId);
	}

	@Override
	public User updateUser(String userId) {
		return userDao.updateUser(userId);
	}

}
