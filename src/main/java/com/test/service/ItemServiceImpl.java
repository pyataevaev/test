package com.test.service;

import com.test.domain.Item;
import com.test.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Ekaterina Pyataeva
 */
@Service
@Transactional
public class ItemServiceImpl implements ItemService {
    @Autowired
    private ItemRepository itemRepository;

    @Override
    public Item getItemById(String id) {
        return itemRepository.findOne(id);
    }

    @Override
    public Item save(Item item) {
        return itemRepository.save(item);
    }

    @Override
    public void delete(Item item) {
        itemRepository.delete(item);
    }
}
