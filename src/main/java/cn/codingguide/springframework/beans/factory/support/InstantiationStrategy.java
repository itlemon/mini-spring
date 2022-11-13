package cn.codingguide.springframework.beans.factory.support;

import java.lang.reflect.Constructor;

import cn.codingguide.springframework.beans.BeansException;
import cn.codingguide.springframework.beans.factory.config.BeanDefinition;

/**
 * 实例化Bean对象的策略，不同的实例话策略需要实现这个接口
 *
 * @author itlemon <lemon_jiang@aliyun.com>
 * Created on 2022-11-12
 */
public interface InstantiationStrategy {

    /**
     * 实例化Bean对象
     *
     * @param beanDefinition beanDefinition
     * @param beanName beanName
     * @param constructor 构造器
     * @param args 构造器入参
     * @return 实例化的Bean对象
     * @throws BeansException 实例化失败后抛出异常
     */
    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor<?> constructor, Object[] args)
            throws BeansException;

}
