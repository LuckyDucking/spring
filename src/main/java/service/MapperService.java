package service;

import dao.Login;
import dao.User;
import mybatis.LoginMapper;
import mybatis.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by huangyazhou on 2015/12/16.
 */
@Service
public class MapperService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private LoginMapper loginMapper;

    public  boolean hasMatchUser(User user)
    {
        int matchCount=userMapper.getMatchCount(user);
        System.out.println("MatchCount="+matchCount+user.toString());
        return matchCount>0;
    }

    public User findUserByName(String userName)
    {
        User user=userMapper.selectUserByName(userName);
         return user;
    }
    public Login loginSuccess(User user)
    {
        Login login=new Login();
        login.setUserId(user.getUser_id());
        login.setIp(user.getLast_ip());
        login.setLoginDatatime(user.getLast_vist());
        return login;
     }

}
