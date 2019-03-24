package pl.grzegorzkaczor.microblog.model.user;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Data
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotNull
    private String uniqueName;
    @NotNull
    private String login;
    @NotNull
    private String password;


//    private Enum descriptiveAccountName;

    private LocalDate registrationDate;

//    private String avatar;

//    @Enumerated(EnumType.STRING)
//    private StatusAccount statusAccount;
//
//    @Enumerated(EnumType.STRING)
//    private TypeAccount typeAccount;





}
