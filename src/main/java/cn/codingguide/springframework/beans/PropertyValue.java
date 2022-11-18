package cn.codingguide.springframework.beans;

/**
 * Bean对象属性封装
 *
 * @author itlemon <lemon_jiang@aliyun.com>
 * Created on 2022-11-18
 */
public class PropertyValue {

    private final String name;

    private final Object value;

    public PropertyValue(String name, Object value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Object getValue() {
        return value;
    }
}
