package com.example.demo.controller;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.form.Form;

@Controller
public class RequestParamController {
	
	/** 입력 화면을 표시 */
	@GetMapping("show")
	public String showView() {
		//반환값으로 뷰 이름 돌려줌
		return "entry";
	}
	
//	/** 확인 화면을 표시 */
//	@PostMapping("confirm")
//	public String confirmView(
//			Model model, 
//			@RequestParam String name, @RequestParam String age, 
//			@DateTimeFormat(iso = DateTimeFormat.ISO.DATE) @RequestParam String birth
//	) {
//		//model 저장
//		model.addAttribute("name", name);
//		model.addAttribute("age", age);
//		model.addAttribute("birth", birth);
//		
//		//반환값으로 뷰 이름 돌려줌
//		return "confirm";
//	}
	
	/**  확인 화면을 표시 : Form 클래스용*/
	@PostMapping("confirm")
	public String confirmView(Form f) {
		//반환값으로 뷰 이름을 돌려줌
		return "confirm2";
	}

}
