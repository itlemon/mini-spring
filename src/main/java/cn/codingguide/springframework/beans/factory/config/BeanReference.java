package cn.codingguide.springframework.beans.factory.config;

/**
 * @author itlemon <lemon_jiang@aliyun.com>
 * Created on 2022-11-18
 */
public class BeanReference {

    private final String beanName;

    public BeanReference(String beanName) {
        this.beanName = beanName;
    }

    public String getBeanName() {
        return beanName;
    }
}
