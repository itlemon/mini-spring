package cn.codingguide.springframework.beans.factory.support;

import java.lang.reflect.Constructor;
import java.util.Objects;

import cn.codingguide.springframework.beans.BeansException;
import cn.codingguide.springframework.beans.factory.config.BeanDefinition;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.NoOp;

/**
 * 使用Cglib来构建Bean对象，底层利用ASM字节码技术实现
 *
 * @author itlemon <lemon_jiang@aliyun.com>
 * Created on 2022-11-12
 */
public class CglibSubclassingInstantiationStrategy implements InstantiationStrategy {

    @Override
    public Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor<?> constructor, Object[] args)
            throws BeansException {
        // 创建cglib增强类
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(beanDefinition.getBeanClass());
        enhancer.setCallback(new NoOp() {
            @Override
            public int hashCode() {
                return super.hashCode();
            }
        });

        if (Objects.isNull(constructor)) {
            // 说明是无参构造
            return enhancer.create();
        } else {
            // 说明是有参构造
            return enhancer.create(constructor.getParameterTypes(), args);
        }
    }

}
