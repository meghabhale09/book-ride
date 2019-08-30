package comIt.bookride.bookride.model.user;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserProfile, Long> {
}
