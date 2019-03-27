package pl.grzegorzkaczor.microblog.contoller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
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
