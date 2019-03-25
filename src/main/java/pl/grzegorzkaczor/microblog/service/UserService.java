package pl.grzegorzkaczor.microblog.service;

import org.springframework.stereotype.Service;
import pl.grzegorzkaczor.microblog.model.user.User;
import pl.grzegorzkaczor.microblog.model.user.UserDTO;
import pl.grzegorzkaczor.microblog.repository.UserRepository;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

//    public void registerUser(UserDTO userDTO){
//        User user = new User();
//        user.setUniqueName(userDTO.getUniqueName());
//        user.setLogin(userDTO.getLogin());
//        user.setPassword(userDTO.getPassword());
//        userRepository.save(user);
//    }

}
