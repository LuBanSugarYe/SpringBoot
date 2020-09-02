package com.sugar.demo.entity;

/**
 * @author SugarYe
 * @date 2020年06月30日 21:17
 */
public class Greeting {
    //id主键标识
    private final long id;
    //内容
    private final String content;

    //构造函数
    public Greeting(long id,String content){
        this.id = id;
        this.content = content;
    }

    //getter属性方法
    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

}
