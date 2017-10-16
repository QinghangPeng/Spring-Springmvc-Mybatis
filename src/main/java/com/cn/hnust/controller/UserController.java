package com.cn.hnust.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cn.hnust.entity.Sysuser;
import com.cn.hnust.service.SysuserService;

/**
 * <p>Title: </p>
 *
 * <p>Description: </p>
 *
 * <p>Company: openSource</p>
 *
 * @author 作者 penghao
 * 
 * @since：2017年10月16日 下午4:02:58
 * 
 */
@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private SysuserService syService;
	
	@RequestMapping("/showUser")
	public String toIndex(HttpServletRequest request,Model model){
		int userId = Integer.parseInt(request.getParameter("userId"));
		List<Sysuser> list = syService.getSysUser();
		model.addAttribute("list",list);
		return "showUser";
	}
}
