package cz.donatio.resource.impl;


import cz.donatio.api.ItemDTO;
import cz.donatio.service.IService;
import org.dozer.Mapper;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * Created by Rudolf on 29/05/16.
 */
@RestController
@RequestMapping("/resources/")
public class ItemResource {

    private Logger logger = org.slf4j.LoggerFactory.getLogger(ItemResource.class);
    @Autowired
    private IService service;
    @Autowired
    private Mapper mapper;

    @RequestMapping(path = "/{userId}/items", method = RequestMethod.GET)
    public List<ItemDTO> getAllItems(@PathVariable Long userId) {
        return null;
    }

    @RequestMapping(path = "/{userId}/items", method = RequestMethod.POST)
    public ItemDTO create(@PathVariable Long userId, @RequestParam ItemDTO itemDTO) {
        return null;
    }

    @RequestMapping(path = "/{userId}/items/{itemId}", method = RequestMethod.DELETE)
    public Long deleteItem(@PathVariable Long userId, @PathVariable Long itemId) {
        return null;
    }

    @RequestMapping(path = "/{userId}/items/{itemId}", method = RequestMethod.GET)
    public ItemDTO getItem(@PathVariable Long userId, @PathVariable Long itemId) {
        return mapper.map(service.getItem(itemId), ItemDTO.class);
    }

    @RequestMapping(path = "/{userId}/items/{itemId}", method = RequestMethod.PUT)
    public Long updateItem(@PathVariable Long userId, @PathVariable Long itemId) {
        return null;
    }


}
