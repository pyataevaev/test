package com.test.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Created by Ekaterina Pyataeva on 17.09.2017.
 */

@Controller
public class IndexController {

    private static final Logger LOGGER = LoggerFactory.getLogger(IndexController.class);

    @RequestMapping("/")
    public String getIndexPage() {
        LOGGER.debug("Getting home page");
        return "index";
    }

}
