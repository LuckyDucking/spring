package service;

import dao.Login;
import dao.User;
import mybatis.LoginMapper;
import mybatis.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by huangyazhou on 2015/12/16.
 */
@Service
public   class MapperService  {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private LoginMapper loginMapper;

    public   User hasMatchUser(User user)
    {
        User matchCount=userMapper.UserMatch(user);
         return    matchCount ;
    }

    public   User findUserByName(String userName)
    {
        User user=userMapper.selectUserByName(userName);
         return user;
    }
    public void loginSuccess(User user)
    {
        Login login=new Login();
        login.setUser_id(user.getUser_id());
        login.setIp(user.getLast_ip());
        login.setLogin_datetime(user.getLast_vist());
        loginMapper.insertLogin(login);
      }

}
