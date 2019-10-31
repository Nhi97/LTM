package model.dao;

import model.entities.User;

public interface UserDao {
    public boolean checkLogin(User user);
}
