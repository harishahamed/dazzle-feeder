package com.resume.feeder.springmvc.dao;

import java.util.ArrayList;
import java.util.List;

import com.resume.feeder.springmvc.model.User;

public class RegistrationDAOImpl implements RegistrationDAO {

    //TODO datasource to be configured-we will decide which DB we can use

    public List<User> findAllUsers() {
        List<User> users = new ArrayList<User>();
        return users;
    }

    public User findUserById(Long id) {
        System.out.println("Fetching User with id " + id);
        User user = new User();
        return user;
    }

    public void createUser(User user) {
        System.out.println("Creating User " + user.getUsername());

    }

    public User updateUser(Long id, User user) {
        System.out.println("Updating User " + id);

        //find user by id - if user null return not found or update
        User currentUser = new User();
        if (currentUser == null) {
            System.out.println("User with id " + id + " not found");
            return new User();
        }

        currentUser.setUsername(user.getUsername());
        currentUser.setMobileNumber(user.getMobileNumber());
        currentUser.setEmail(user.getEmail());
        //update currentUser in DB
        return currentUser;
    }

    public Boolean deleteUser(Long id) {
        System.out.println("Fetching & Deleting User with id " + id);
        boolean isDeleted = false;
        return isDeleted;
    }

    public Boolean deleteAllUsers() {
        boolean isDeleted = false;
        return isDeleted;
    }

}