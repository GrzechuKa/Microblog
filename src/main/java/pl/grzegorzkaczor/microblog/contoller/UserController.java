package pl.grzegorzkaczor.microblog.contoller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.grzegorzkaczor.microblog.service.UserService;

@RestController
public class UserController {


    @PostMapping("/login")
    public void login(){
    }
}
