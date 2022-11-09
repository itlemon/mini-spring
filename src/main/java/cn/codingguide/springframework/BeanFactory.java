package cn.codingguide.springframework;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Bean工厂
 *
 * @author itlemon <lemon_jiang@aliyun.com>
 * Created on 2022-11-09
 */
public class BeanFactory {

    private final Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();

    public Object getBean(String name) {
        return beanDefinitionMap.get(name).getBean();
    }

    public void registerBeanDefinition(String name, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(name, beanDefinition);
    }

}
