package web.controller;

import org.springframework.stereotype.Controller;
import web.service.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class UsersController {

   private final UserServiceImp userServiceImp;
    @Autowired
    public UsersController(UserServiceImp userServiceImp) {
        this.userServiceImp = userServiceImp;
    }

    @GetMapping(value = "/users")
        public String showUsers(ModelMap model) {

            model.addAttribute("usertable", userServiceImp.showUsers());
            return "users";
        }
  }


