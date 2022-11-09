package cn.codingguide.springframework.test;

import org.junit.Test;

import cn.codingguide.springframework.BeanDefinition;
import cn.codingguide.springframework.BeanFactory;
import cn.codingguide.springframework.test.bean.UserService;

/**
 * @author itlemon <lemon_jiang@aliyun.com>
 * Created on 2022-11-09
 */
public class BeanFactoryTest {

    @Test
    public void testBeanFactory() {
        // 1.初始化BeanFactory
        BeanFactory beanFactory = new BeanFactory();

        // 2.注册Bean对象
        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 3.获取Bean对象
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
    }

}
