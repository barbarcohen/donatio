package cz.donatio.dao;

import cz.donatio.domain.Request;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Rudolf on 30/06/16.
 */
public interface RequestRepository extends CrudRepository<Request, Long> {
}
