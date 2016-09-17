package cz.donatio.dao;

import cz.donatio.domain.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Rudolf on 30/06/16.
 */
public interface UserRepository extends CrudRepository<User, Long> {
}
