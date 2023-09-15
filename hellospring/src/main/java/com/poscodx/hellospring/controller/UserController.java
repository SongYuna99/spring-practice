package com.poscodx.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

// @RequestMapping 클래스 + 메서드 매핑

@RequestMapping("/user")
@Controller
public class UserController {

	@RequestMapping(value = "/joinform", method = RequestMethod.GET)
	public String joinform() {
		return "/WEB-INF/views/joinform.jsp";
	}

	@RequestMapping(value = "/join", method = RequestMethod.POST)
	public String join(UserVo vo) {
		System.out.println("UserController.join() : UserDao.insert(" + vo + ")");
		return "redirect:/";
	}

	@ResponseBody
	@RequestMapping("/update")
	public String update(@RequestParam() String name) {
		// 만일 name이라는 이름의 URL 파라미터가 없으면 400 bad request 에러가 난다.
		return "UserController.update(" + name + ")";
	}

	@ResponseBody
	@RequestMapping("/update2")
	public String update2(@RequestParam(value = "n", required = false, defaultValue = "") String name) {
		return "UserController.update(" + name + ")";
	}

	@ResponseBody
	@RequestMapping("/list")
	public String list(@RequestParam(value = "p", required = false, defaultValue = "1") int pageNO) {
		return "UserController.update(" + pageNO + ")";
	}
}
