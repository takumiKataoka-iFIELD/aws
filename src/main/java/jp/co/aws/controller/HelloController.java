package jp.co.aws.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("/")
    String index(Model model) {
        model.addAttribute("message","Springの復習");
        return "index";
    }
}
