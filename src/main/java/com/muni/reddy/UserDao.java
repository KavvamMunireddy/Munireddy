package com.muni.reddy;

public interface UserDao {

	public String createUser(User user);

	public User updateUser(String userId);

	public String deleteUser(String userId);

}
