package service;

import dao.UserDAO;
import entity.User;
import org.apache.commons.lang.ObjectUtils;

public class UserService {
    //this class is used to do every operation about user objects
    private UserDAO userDAO;

    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public String login(String username,String password)
    {
        //search the username and test the password
        String result;
        User NowUser=userDAO.getUserByName(username);
        if(NowUser== null)
        {
            result="Username does not exist";
        }
        else
        {
            if(NowUser.getPassWord().equals(password))
            {
                result="login successful";
            }
            else
            {
                result="wrong password";
            }
        }
        return result;
    }

    public String registered(String  username,String password,String password_2)
    {

        String result;
        if(!password.equals(password_2))
        {
            result="Inconsistent password";
            return result;
        }
        if(userDAO.getUserByName(username)!=null)
        {
            result="Username already exists";
            return result;
        }
        User user=new User();
        user.setUserName(username);
        user.setPassWord(password);
        userDAO.add(user);
        result="registered successfully";
        return result;



    }

}
