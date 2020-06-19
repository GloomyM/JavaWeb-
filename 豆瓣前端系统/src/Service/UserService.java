package Service;

import Bean.Admin;
import Dao.UserDao;

public class UserService {

    static UserDao us = new UserDao();
    public Boolean Login(Admin admin){
        return us.login(admin);
    }

    public void Reg(Admin admin){
        us.reg(admin);
        return;
    }
}
