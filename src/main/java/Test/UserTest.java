package Test;

import dao.Login;
import dao.User;
import mybatis.UserMapper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.MapperService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by huangyazhou on 2015/12/15.
 */
public class UserTest {
    public static void main(String[] args)
    {
        User user=new User();
        user.setUser_name("admin2");
        user.setPassword("password2");
        ApplicationContext act=new ClassPathXmlApplicationContext("spring-config.xml");
        MapperService MapperService=(MapperService)act.getBean("MapperService");
        User userResult=MapperService.findUserByName(user.getUser_name());
        System.out.println("User:"+userResult.toString());



        if (MapperService.hasMatchUser(user))
        {
            user.setUser_id();
            Login login=MapperService.loginSuccess(user);
            System.out.println(login.toString());
        }
//        List<User> userResult=new ArrayList<User>();
//        List<User> userInsert=new ArrayList<User>();
//        HashMap<String,Object>userParam=new HashMap<String, Object>();
//
////        for (int i=30;i<40;i++)
////        {
////            User user=new User();
////            user.setUser_id(i);
////            user.setUser_name("admin"+i);
////            user.setPassword("password"+i);
////            userInsert.add(user);
////         }
////        userMapper.insertUser(userInsert);
//        userParam.put("user_id",1);
//        userResult=MapperService.selectUser(userParam);
//        for (User u: userResult)
//        {
//            System.out.println(u.toString());
//        }

    }
}
