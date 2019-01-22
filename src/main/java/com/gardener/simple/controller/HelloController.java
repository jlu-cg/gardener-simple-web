package com.gardener.simple.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 测试访问接口
 * @author gardener
 *
 */
@Controller
public class HelloController {

	@ResponseBody
	@RequestMapping(path="/hello", method= {RequestMethod.GET})
	public String hello() {
		return "hello world";
	}
}
