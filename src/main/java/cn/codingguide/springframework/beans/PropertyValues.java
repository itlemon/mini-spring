package cn.codingguide.springframework.beans;

import java.util.ArrayList;
import java.util.List;

/**
 * @author itlemon <lemon_jiang@aliyun.com>
 * Created on 2022-11-18
 */
public class PropertyValues {

    private final List<PropertyValue> propertyValueList = new ArrayList<>();

    public void addPropertyValue(PropertyValue propertyValue) {
        this.propertyValueList.add(propertyValue);
    }

    public PropertyValue[] getPropertyValues() {
        return this.propertyValueList.toArray(new PropertyValue[0]);
    }

    public PropertyValue getPropertyValue(String propertyName) {
        for (PropertyValue propertyValue : this.propertyValueList) {
            if (propertyValue.getName().equals(propertyName)) {
                return propertyValue;
            }
        }

        // 没有找到属性，则返回null
        return null;
    }

}
