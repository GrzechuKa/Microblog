package pl.grzegorzkaczor.microblog.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.grzegorzkaczor.microblog.model.user.UserDTO;
import pl.grzegorzkaczor.microblog.service.UserService;

@RestController
public class UserController {


    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/login")
    public void login(){
    }

//    @PostMapping("/registration")
//    public void registerUser (@RequestBody UserDTO userDTO){
//        userService.registerUser(userDTO);
//    }
//    @GetMapping
//    public String



}
