package cz.donatio.dao;

import cz.donatio.domain.Item;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Rudolf on 28/06/16.
 */
public interface ItemRepository extends CrudRepository<Item, Long> {
}
