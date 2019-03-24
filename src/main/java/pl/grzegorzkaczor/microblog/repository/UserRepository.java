package pl.grzegorzkaczor.microblog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.grzegorzkaczor.microblog.model.user.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
