package cn.codingguide.springframework;

/**
 * 模仿Spring中的BeanDefinition，用于存储任何类型的对象
 *
 * @author itlemon <lemon_jiang@aliyun.com>
 * Created on 2022-11-09
 */
public class BeanDefinition {

    private final Object bean;

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }

    public Object getBean() {
        return bean;
    }

}
