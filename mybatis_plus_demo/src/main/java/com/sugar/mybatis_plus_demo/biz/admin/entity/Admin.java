package com.sugar.mybatis_plus_demo.biz.admin.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "user")
public class Admin {
    @TableId
    private Long id;
    @TableField(value = "name",exist = true)
    private String name;
    private Integer age;
    private String email;

}
