package pl.grzegorzkaczor.microblog.contoller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
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


    @PostMapping("/register")
    public void crate(@RequestBody UserDTO userDTO){
        userService.create(userDTO);
    }
}
