package com.springMvc.pll;

import com.alibaba.fastjson.JSON;
import com.springMvc.pll.entity.User;
import com.springMvc.pll.service.UserService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by pc-lenovo on 2016/6/26.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:applicationContext-mvc.xml")
public class TestUserService {
    private static final Logger LOGGER = Logger
            .getLogger(TestUserService.class);

    @Autowired
    private UserService userService;
    @Test
    public void testQueryById1() {
        User user = userService.selectById(1);
        LOGGER.info(JSON.toJSON(user));
    }

}
