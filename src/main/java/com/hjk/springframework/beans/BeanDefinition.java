package com.hjk.springframework.beans;

/**
 * 定义bean实例化信息
 * @author hjk
 */
public class BeanDefinition {
    private Object object;

    public BeanDefinition(Object object) {
        this.object = object;
    }

    public Object getBean() {
        return object;
    }
}
