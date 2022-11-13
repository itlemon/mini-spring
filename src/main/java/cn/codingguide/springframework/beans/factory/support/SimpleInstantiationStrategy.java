package cn.codingguide.springframework.beans.factory.support;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;

import cn.codingguide.springframework.beans.BeansException;
import cn.codingguide.springframework.beans.factory.config.BeanDefinition;

/**
 * 使用JDK自带的工具实例化对象
 *
 * @author itlemon <lemon_jiang@aliyun.com>
 * Created on 2022-11-12
 */
public class SimpleInstantiationStrategy implements InstantiationStrategy {

    @Override
    public Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor<?> constructor, Object[] args)
            throws BeansException {
        // 获取Class
        Class<?> beanClass = beanDefinition.getBeanClass();

        try {
            if (Objects.isNull(constructor)) {
                // 说明是无参构造方法
                return beanClass.getDeclaredConstructor().newInstance();
            } else {
                // 说明是有参构造方法
                return beanClass.getDeclaredConstructor(constructor.getParameterTypes()).newInstance(args);
            }
        } catch (InvocationTargetException | InstantiationException | IllegalAccessException |
                 NoSuchMethodException e) {
            throw new BeansException("Failed to instantiate [" + beanClass.getName() + "]", e);
        }
    }
}
