package com.yf.controller;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * Springboot文件上传
 * 
 * @author yangf
 *
 */
@RestController // 如果添加这个注解，所有返回值都会做json转换
public class FileUploadController {
	
	/**
	 * 处理文件上传
	 * @throws IOException 
	 * @throws IllegalStateException 
	 */
	@RequestMapping("fileUploadController")
	public Map<String, Object> fileUpload(MultipartFile fileName) throws IllegalStateException, IOException {
		System.out.println(fileName.getOriginalFilename());
		fileName.transferTo(new File("E:/" + fileName.getOriginalFilename()));
		Map<String, Object> map = new HashMap<>();
		map.put("msg", "ok");
		return map;
	}
}
