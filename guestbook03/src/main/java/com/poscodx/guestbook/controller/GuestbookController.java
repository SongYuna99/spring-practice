package com.poscodx.guestbook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.poscodx.guestbook.repository.GuestBookRepository;
import com.poscodx.guestbook.vo.GuestBookVo;

@Controller
public class GuestbookController {
	@Autowired
	private GuestBookRepository guestbookRepository;

	@RequestMapping(value = "/")
	public String main(Model model) {
		List<GuestBookVo> list = guestbookRepository.selectAll();
		model.addAttribute("list", list);

		return "main";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String main(GuestBookVo vo) {
		guestbookRepository.insert(vo);

		return "redirect:/";
	}

	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String deleteform(Model model, String no) {
		model.addAttribute("no", no);

		return "deleteform";
	}

	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public String delete(String no, String password) {
		int userNo = Integer.parseInt(no);

		if (guestbookRepository.checkPassword(userNo, password)) {
			guestbookRepository.delete(userNo);
			return "redirect:/";
		} else {
			return "redirect:/delete?no=" + no;
		}
	}

}
