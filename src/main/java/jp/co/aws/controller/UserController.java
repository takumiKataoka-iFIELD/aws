package jp.co.aws.controller;

import jp.co.aws.entity.UserEntity;
import jp.co.aws.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/signup")
    String index(Model model) {
        return "user/index";
    }

    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    String form(@RequestParam("userId") Long userId,
                @RequestParam("userName")String userName,
                @RequestParam("password")String password){
        UserEntity user = new UserEntity();
        user.setUserId(userId);
        user.setUserName(userName);
        user.setPassword(password);
        userService.insert(user);
    return "redirect:/";
    }
}
