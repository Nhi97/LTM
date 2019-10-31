package model.services.servicesimpl;

import model.dao.UserDao;
import model.dao.daoimpl.UserDaoImpl;
import model.entities.User;
import model.services.UserServices;

public class UserServicesImpl implements UserServices {
    private String ADDRESS = "193 Nguyễn Lương Bằng";
    private UserDao userDao;

    public UserServicesImpl() {
        userDao = new UserDaoImpl();
    }

    @Override
    public boolean checkLogin(User user) {
        return userDao.checkLogin(user);
    }

    @Override
    public User getAddress(User user) {
        if (userDao.checkLogin(user)) {
            user.setAddress(ADDRESS);
            return user;
        } else {
            return null;
        }
    }

}
