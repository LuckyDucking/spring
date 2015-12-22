package web;

import dao.User;
import mybatis.LoginMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import service.MapperService;

import javax.jws.soap.SOAPBinding;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * Created by huangyazhou on 2015/12/17.
 */
@Controller
@RequestMapping(value = "/admin")
public class LoginController {
    @Autowired
    private MapperService mapperservice;

    @RequestMapping(value = "/login.html")
    public String loginPage()
    {
        return "login";
    }
    @RequestMapping(value = "/loginCheck.html")
    public ModelAndView loginCheck(HttpServletRequest request,LoginCommand loginCommand)
    {
        User user=new User();
        user.setUser_name(loginCommand.getUserName());
        user.setPassword(loginCommand.getPassword());
        System.out.println(user.toString());
        User isValidUser=mapperservice.hasMatchUser(user);
        if(isValidUser.getUser_id()==0)
        {
            return new ModelAndView("login","error","用户名或者密码错误");
        }else
        {
            User userResult=mapperservice.findUserByName(loginCommand.getUserName());
            userResult.setLast_ip(request.getLocalAddr());
            userResult.setLast_vist(new Date());
            System.out.println(userResult.toString());
            mapperservice.loginSuccess(userResult);
            request.getSession().setAttribute("user",user);
            return new ModelAndView("main");
        }
    }
}
