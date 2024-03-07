package com.hjk.springframework.beans;

import com.hjk.springframework.service.UserService;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;


public class BeanFactoryTest extends TestCase {
    @Test
    public void testGetBean() {
        BeanFactory beanFactory = new BeanFactory();
        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        UserService userService = (UserService)beanFactory.getBean("userService");
        userService.queryUserList();
    }
}