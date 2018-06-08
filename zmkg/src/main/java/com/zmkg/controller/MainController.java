package com.zmkg.controller;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zmkg.bean.JinMei;
import com.zmkg.entity.Jinmei;
import com.zmkg.entity.Yuanmei;
import com.zmkg.service.JinmeiService;
import com.zmkg.service.YuanmeiService;

@Controller
public class MainController {

	@Autowired
	private YuanmeiService yuanmeiService;
	@Autowired
	private JinmeiService jinmeiService;

	@RequestMapping("home")
	public String home() {
		return "index";
	}

	@RequestMapping("pm")
	public String pm(HttpServletRequest req) {
		List<Yuanmei> yuanmeiList = yuanmeiService.findAllUse();
		List<Jinmei> jinmeiList = jinmeiService.listAll();
		req.setAttribute("yuanmeiList", yuanmeiList);
		req.setAttribute("jinmeiList", jinmeiList);
		return "pm/index";
	}

	/**
	 * 批量隐藏，单个隐藏 ids
	 * 
	 * @return
	 */
	@RequestMapping("noShow")
	public String noShow(HttpServletRequest req, Yuanmei yuanmei) {
		Yuanmei yuanmeiDo = yuanmeiService.getOneById(yuanmei.getId());
		req.setAttribute("yuanmeiDo", yuanmeiDo);
		return "admin/add";
	}

	@RequestMapping("edit")
	public String edit(HttpServletRequest req, Yuanmei yuanmei) {
		Yuanmei yuanmeiDo = yuanmeiService.getOneById(yuanmei.getId());
		req.setAttribute("yuanmeiDo", yuanmeiDo);
		return "admin/add";
	}

	@RequestMapping("jisuan")
	public String jisuan(HttpServletRequest req, Integer zuiDaChanShu, Jinmei jinmei1, Jinmei jinmei2,Integer[] ids) {
		System.out.println(zuiDaChanShu);
		System.out.println(jinmei1);
		System.out.println(jinmei2);
		System.out.println(Arrays.toString(ids));
		if (ids == null || jinmei1 == null || jinmei2 == null || zuiDaChanShu == null) {
			req.setAttribute("errorMsg", "请填写全部参数");
			List<Yuanmei> yuanmeiList = yuanmeiService.listAll();
			List<Jinmei> jinmeiList = jinmeiService.listAll();
			req.setAttribute("yuanmeiList", yuanmeiList);
			req.setAttribute("jinmeiList", jinmeiList);
			return "pm/index";
		}
		String[] filedNames = getFiledName(jinmei1);
		for (String filedName : filedNames) {
			Object value = getFieldValueByName(filedName, jinmei1);
			if (value == null) {
				req.setAttribute("errorMsg", "请填写最大值全部参数");
				List<Yuanmei> yuanmeiList = yuanmeiService.listAll();
				List<Jinmei> jinmeiList = jinmeiService.listAll();
				req.setAttribute("yuanmeiList", yuanmeiList);
				req.setAttribute("jinmeiList", jinmeiList);
				return "admin/test";
			}
		}
		filedNames = getFiledName(jinmei2);
		for (String filedName : filedNames) {
			Object value = getFieldValueByName(filedName, jinmei2);
			if (value == null) {
				req.setAttribute("errorMsg", "请填写最小值全部参数");
				List<Yuanmei> yuanmeiList = yuanmeiService.listAll();
				List<Jinmei> jinmeiList = jinmeiService.listAll();
				req.setAttribute("yuanmeiList", yuanmeiList);
				req.setAttribute("jinmeiList", jinmeiList);
				return "admin/test";
			}
		}
		List<JinMei> jinMeiList = yuanmeiService.jisuan(ids, jinmei1, jinmei2, zuiDaChanShu);
		req.setAttribute("jinMeiList", jinMeiList);
		return "success";
	}

	private static String[] getFiledName(Object o) {
		Field[] fields = o.getClass().getDeclaredFields();
		String[] fieldNames = new String[fields.length];
		for (int i = 0; i < fields.length; i++) {
			System.out.println(fields[i].getType());
			fieldNames[i] = fields[i].getName();
		}
		return fieldNames;
	}

	private static Object getFieldValueByName(String fieldName, Object o) {
		try {
			String firstLetter = fieldName.substring(0, 1).toUpperCase();
			String getter = "get" + firstLetter + fieldName.substring(1);
			Method method = o.getClass().getMethod(getter, new Class[] {});
			Object value = method.invoke(o, new Object[] {});
			return value;
		} catch (Exception e) {
			return null;
		}
	}

	@RequestMapping("goAdd")
	public String goAdd() {
		return "admin/add";
	}

	@RequestMapping("add")
	public String add(Yuanmei yuanmei) {
		if (yuanmei.getId() == null) {
			yuanmeiService.add(yuanmei);
		} else {
			yuanmeiService.update(yuanmei);
		}
		return "redirect:/admin/pm";
	}

}
