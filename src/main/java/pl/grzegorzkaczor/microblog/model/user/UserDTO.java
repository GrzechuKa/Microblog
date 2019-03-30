package pl.grzegorzkaczor.microblog.model.user;

import lombok.Data;

@Data
public class UserDTO {

    private Long id;
    private String username;
    private String password;
    private String uniqueName;


}
