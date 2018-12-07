package com.alankin.common;

import javax.annotation.PostConstruct;

/**
 * @author: Administrator
 * @Description: TODO
 * @date 创建时间：2018/12/7　16:45
 */
public class TestBean {
    @PostConstruct
    public void post() {
        System.out.println(">>>>>>>>>>>>>>>TestBean<<<<<<<<<<<<<<<<<");
    }
}
