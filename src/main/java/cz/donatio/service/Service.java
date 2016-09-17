package cz.donatio.service;

import cz.donatio.dao.ItemRepository;
import cz.donatio.dao.RequestRepository;
import cz.donatio.dao.UserRepository;
import cz.donatio.domain.Item;
import cz.donatio.domain.Request;
import cz.donatio.domain.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Rudolf on 30/06/16.
 */
@org.springframework.stereotype.Service
public class Service implements IService {

    @Autowired
    private ItemRepository itemRepository;

    @Autowired
    private RequestRepository requestRepository;

    @Autowired
    private UserRepository userRepository;

    @Override
    public Item createItem() {
        return null;
    }

    @Override
    public Item editItem() {
        return null;
    }

    @Override
    public Item getItem(Long id) {
        return itemRepository.findOne(id);
    }

    @Override
    public Request requestItem(Long userId, Long itemId) {
        User user = userRepository.findOne(userId);
        Item item = itemRepository.findOne(itemId);
        Request request = new Request(user, item);
        return requestRepository.save(request);
    }

    @Override
    public Request getRequest(Long id) {
        return requestRepository.findOne(id);
    }

    @Override
    public User getUser(Long id) {
        return userRepository.findOne(id);
    }

    @Override
    public List<Request> findUsersRequests(Long userId) {
        return null;
    }
}
