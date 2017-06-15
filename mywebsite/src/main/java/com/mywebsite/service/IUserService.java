package com.mywebsite.service;

import java.util.List;

import com.mywebsite.dto.User;

public interface IUserService {

	public User getUserById(int userId);

	public void insertUser(User user);

	public void addUser(User user);

	public List<User> getAllUser();
}