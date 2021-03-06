package com.xkcoding.multi.datasource.mybatis.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * <p>
 * User实体类
 * </p>
 *
 * @package: com.xkcoding.multi.datasource.mybatis.model
 * @description: User实体类
 * @author: wangzw
 * @date: Created in 2019-01-21 14:19
 * @copyright: Copyright (c) 2019
 * @version: V1.0
 * @modified: wangzw
 */
@Data
@TableName("multi_user")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User implements Serializable {
    private static final long serialVersionUID = -1923859222295750467L;

    /**
     * 主键
     */
    @TableId(type = IdType.ID_WORKER)
    private Long id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 年龄
     */
    private Integer age;
}
