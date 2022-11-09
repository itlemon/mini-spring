package cn.codingguide.springframework.beans.factory.config;

/**
 * 单例对象注册接口
 *
 * @author itlemon <lemon_jiang@aliyun.com>
 * Created on 2022-11-09
 */
public interface SingletonBeanRegistry {

    /**
     * 获取单例对象
     *
     * @param beanName beanName
     * @return 单例对象
     */
    Object getSingleton(String beanName);

    /**
     * 注册单例对象
     *
     * @param beanName beanName
     * @param singletonObject 单例对象
     */
    void registerSingleton(String beanName, Object singletonObject);

}
