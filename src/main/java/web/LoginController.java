package web;

import dao.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import service.MapperService;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * Created by huangyazhou on 2015/12/17.
 */
@Controller
@RequestMapping(value = "/admin")
public class LoginController {
    @Autowired
    private MapperService Mapperservice;

    @RequestMapping(value = "/login.html")
    public String loginPage()
    {
        return "login";
    }
//    @RequestMapping(value = "/loginCheck.html")
//    public ModelAndView loginCheck(HttpServletRequest request,LoginCommand loginCommand)
//    {
//        boolean isValidUser=MapperService.hasMatchUser(loginCommand.getUserName(),loginCommand.getPassword());
//        if(!isValidUser)
//        {
//            return new ModelAndView("login","error","用户名或者密码错误");
//        }else
//        {
//            User user=MapperService.findUserByName(loginCommand.getUserName());
//            user.setLastIp(request.getLocalAddr());
//            user.setLastVist(new Date());
//
//        }
//
//    }
}
