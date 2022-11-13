package cn.codingguide.springframework.beans.factory.support;

import java.lang.reflect.Constructor;
import java.util.Objects;

import cn.codingguide.springframework.beans.BeansException;
import cn.codingguide.springframework.beans.factory.config.BeanDefinition;

/**
 * @author itlemon <lemon_jiang@aliyun.com>
 * Created on 2022-11-09
 */
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory {

    /**
     * 默认的实例化Bean对象的策略
     */
    private InstantiationStrategy instantiationStrategy = new CglibSubclassingInstantiationStrategy();

    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition, Object[] args) throws BeansException {
        // 创建bean，实例化
        Object bean;
        try {
            bean = createBeanInstance(beanDefinition, beanName, args);
        } catch (Exception e) {
            throw new BeansException("Instantiation of bean failed", e);
        }

        registerSingleton(beanName, bean);
        return bean;
    }

    protected Object createBeanInstance(BeanDefinition beanDefinition, String beanName, Object[] args) {
        Constructor<?> constructorToUse = null;
        Class<?> beanClass = beanDefinition.getBeanClass();
        Constructor<?>[] declaredConstructors = beanClass.getDeclaredConstructors();
        for (Constructor<?> constructor : declaredConstructors) {
            // 这里仅仅只做类型长度匹配，实际应用中还会去做类型匹配等
            if (!Objects.isNull(args) && constructor.getParameterCount() == args.length) {
                constructorToUse = constructor;
                break;
            }
        }
        return getInstantiationStrategy().instantiate(beanDefinition, beanName, constructorToUse, args);
    }

    public InstantiationStrategy getInstantiationStrategy() {
        return instantiationStrategy;
    }

    public void setInstantiationStrategy(
            InstantiationStrategy instantiationStrategy) {
        this.instantiationStrategy = instantiationStrategy;
    }
}
