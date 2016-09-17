package cz.donatio.service;

import cz.donatio.domain.Item;
import cz.donatio.domain.Request;
import cz.donatio.domain.User;

import java.util.List;

/**
 * Created by Rudolf on 30/06/16.
 */
public interface IService {

    Item createItem();

    Item editItem();

    Item getItem(Long id);

    Request requestItem(Long userId, Long itemId);

    Request getRequest(Long id);

    User getUser(Long id);

    List<Request> findUsersRequests(Long userId);
}
