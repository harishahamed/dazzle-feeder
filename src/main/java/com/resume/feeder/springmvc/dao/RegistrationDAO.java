package com.resume.feeder.springmvc.dao;

import java.util.List;

import com.resume.feeder.springmvc.model.User;

public interface RegistrationDAO {

    public List<User> findAllUsers();

    public User findUserById(Long id);

    public void createUser(User user);

    public User updateUser(Long id, User user);

    public Boolean deleteUser(Long id);

    public Boolean deleteAllUsers();

}