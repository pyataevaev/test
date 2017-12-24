package com.test.service;

import com.test.domain.Item;

/**
 * Created by Ekaterina Pyataeva
 */
public interface ItemService {
    Item getItemById(String id);
    Item save(Item item);
    void delete(Item item);
}
