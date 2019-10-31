package model.dao.daoimpl;

import jdbc.ConnectionProvider;
import jdbc.ConnectionProviderImpl;
import model.dao.UserDao;
import model.entities.User;

import java.sql.*;

public class UserDaoImpl implements UserDao {
    private  ConnectionProvider connectionProvider;
    private Connection connection;
    private PreparedStatement preparedStatement;
    private ResultSet resultSet;
    public UserDaoImpl(){
         connectionProvider = new ConnectionProviderImpl();
         connection = connectionProvider.getConnection();
    }

    @Override
    public boolean checkLogin(User user) {
       String sql = "select * from user where username = ? and password = ?";
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, user.getUsername());
            preparedStatement.setString(2, user.getPassword());
            resultSet = preparedStatement.executeQuery();
            if(!resultSet.next()){
                return false;
            }

        } catch (SQLException e) {
        }
        return true;
    }

}
