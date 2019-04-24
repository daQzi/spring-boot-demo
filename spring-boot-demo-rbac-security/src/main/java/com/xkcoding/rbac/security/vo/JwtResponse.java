package com.xkcoding.rbac.security.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <p>
 * JWT 响应返回
 * </p>
 *
 * @package: com.xkcoding.rbac.security.vo
 * @description: JWT 响应返回
 * @author: wangzw
 * @date: Created in 2018-12-10 16:01
 * @copyright: Copyright (c) 2018
 * @version: V1.0
 * @modified: wangzw
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class JwtResponse {
    /**
     * token 字段
     */
    private String token;
    /**
     * token类型
     */
    private String tokenType = "Bearer";

    public JwtResponse(String token) {
        this.token = token;
    }
}
