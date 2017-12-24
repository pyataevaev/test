package com.test.web;

import com.test.domain.Item;
import com.test.repository.ItemRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Created by Ekaterina Pyataeva on 17.09.2017.
 */

@Controller
public class IndexController {

    private static final Logger LOGGER = LoggerFactory.getLogger(IndexController.class);

    @Autowired
    private ItemRepository itemRepository;

    @RequestMapping("/")
    public String getIndexPage() {
        LOGGER.debug("Getting home page");
        Item item = itemRepository.findOne("2");
        LOGGER.info("item with id=2: " + item.getItemValue());
        return "index";
    }

}
