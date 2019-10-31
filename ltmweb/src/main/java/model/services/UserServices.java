package model.services;

import model.entities.User;

public interface UserServices {
    public boolean checkLogin(User user);

    public User getAddress(User user);
}
