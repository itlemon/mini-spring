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
     * @throws BeansException 不能获取Bean对象，则抛出异常
     */
    Object getBean(String name) throws BeansException;

}
