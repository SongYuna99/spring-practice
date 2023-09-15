package com.poscodx.hellospring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

// @RequestMapping 클래스 단독 매핑
// Spring mvb 4.x 버전에서만 지원
// @Controller
@RequestMapping("/guestbook/*")
public class GuestbookController {
	@ResponseBody
	@RequestMapping
	public String list() {
		return "GuestbookController.list()";
	}

	@RequestMapping
	public String delete() {
		return "GuestbookController.delete()";
	}
}
