package com.xkcoding.orm.jdbctemplate.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * <p>
 * 主键注解
 * </p>
 *
 * @package: com.xkcoding.orm.jdbctemplate.annotation
 * @description: 主键注解
 * @author: wangzw
 * @date: Created in 2018/10/15 11:23 AM
 * @copyright: Copyright (c) 2018
 * @version: V1.0
 * @modified: wangzw
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
public @interface Pk {
	/**
	 * 自增
	 *
	 * @return 自增主键
	 */
	boolean auto() default true;
}