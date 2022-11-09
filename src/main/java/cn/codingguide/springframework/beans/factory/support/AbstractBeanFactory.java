package cn.codingguide.springframework.beans.factory.support;

import java.util.Objects;

import cn.codingguide.springframework.beans.BeansException;
import cn.codingguide.springframework.beans.factory.BeanFactory;
import cn.codingguide.springframework.beans.factory.config.BeanDefinition;
import cn.codingguide.springframework.beans.factory.config.DefaultSingletonBeanRegistry;

/**
 * @author itlemon <lemon_jiang@aliyun.com>
 * Created on 2022-11-09
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {

    @Override
    public Object getBean(String name) throws BeansException {
        // 首先从容器中获取，获取不到再创建
        Object bean = getSingleton(name);
        if (!Objects.isNull(bean)) {
            return bean;
        }

        BeanDefinition beanDefinition = getBeanDefinition(name);
        return createBean(name, beanDefinition);
    }

    /**
     * 获取BeanDefinition对象
     *
     * @param beanName beanName
     * @return BeanDefinition对象
     * @throws BeansException 失败抛出异常
     */
    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    /**
     * 创建Bean对象
     *
     * @param beanName beanName
     * @param beanDefinition beanDefinition
     * @return Bean对象
     * @throws BeansException 失败抛出异常
     */
    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException;
}
