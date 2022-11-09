package cn.codingguide.springframework.test;

import org.junit.Test;

import cn.codingguide.springframework.beans.factory.config.BeanDefinition;
import cn.codingguide.springframework.beans.factory.support.DefaultListableBeanFactory;
import cn.codingguide.springframework.test.bean.UserService;

/**
 * @author itlemon <lemon_jiang@aliyun.com>
 * Created on 2022-11-09
 */
public class BeanFactoryTest {

    @Test
    public void testBeanFactory() {
        // 1.初始化 BeanFactory 接口
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // 2.注册 Bean 对象
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 3.获取 Bean 对象
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
        System.out.println(userService);

        UserService userService1 = (UserService) beanFactory.getBean("userService");
        userService1.queryUserInfo();
        System.out.println(userService1);
    }

}
