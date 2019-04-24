package com.xkcoding.upload.service;

import com.qiniu.common.QiniuException;
import com.qiniu.http.Response;

import java.io.File;

/**
 * <p>
 * 七牛云上传Service
 * </p>
 *
 * @package: com.xkcoding.upload.service
 * @description: 七牛云上传Service
 * @author: wangzw
 * @date: Created in 2018/11/6 17:21
 * @copyright: Copyright (c) 2018
 * @version: V1.0
 * @modified: wangzw
 */
public interface IQiNiuService {
	/**
	 * 七牛云上传文件
	 *
	 * @param file 文件
	 * @return 七牛上传Response
	 * @throws QiniuException 七牛异常
	 */
	Response uploadFile(File file) throws QiniuException;
}
