package cn.codingguide.springframework.beans.factory.support;

import cn.codingguide.springframework.beans.factory.config.BeanDefinition;

/**
 * @author itlemon <lemon_jiang@aliyun.com>
 * Created on 2022-11-09
 */
public interface BeanDefinitionRegistry {

    /**
     * 向容器中注册BeanDefinition
     *
     * @param beanName beanName
     * @param beanDefinition beanDefinition
     */
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);

}
