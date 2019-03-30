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

    public void create(UserDTO userDTO) {
        User user = new User();
        user.setUsername(userDTO.getUsername());
        user.setPassword(userDTO.getPassword());
        user.setUniqueName(userDTO.getUniqueName());
        user.setRole(User.Role.USER);
        userRepository.save(user);
    }
}
