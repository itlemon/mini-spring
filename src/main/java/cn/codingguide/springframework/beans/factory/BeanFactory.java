package cn.codingguide.springframework.beans.factory;

import cn.codingguide.springframework.beans.BeansException;

/**
 * Bean工厂
 *
 * @author itlemon <lemon_jiang@aliyun.com>
 * Created on 2022-11-09
 */
public interface BeanFactory {

    /**
     * 获取Bean的实例对象
     *
     * @param name beanName
     * @return 实例化的Bean对象
     * @throws BeansException Capable
     */
    Object getBean(String name) throws BeansException;

    /**
     * 获取带有入参的Bean实例对象
     *
     * @param name beanName
     * @param args 入参参数
     * @return 实例化的Bean对象
     * @throws BeansException Capable
     */
    Object getBean(String name, Object... args) throws BeansException;

}
