package com.test.repository;

import com.test.domain.Item;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Ekaterina Pyataeva
 */
@Repository
public interface ItemRepository extends CrudRepository<Item, String> {
}
