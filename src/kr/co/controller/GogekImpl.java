package kr.co.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import kr.co.model.GogekDTo;
import kr.co.model.GogekModel;

public class GogekImpl implements CommandInter{
	public static GogekImpl impl = new GogekImpl();
	
	public static GogekImpl instance(){
		return impl;
	}
	
	@Override
	public String showData(HttpServletRequest request, HttpServletResponse response,String order) throws Exception {
		GogekModel model = GogekModel.instance();
		ArrayList<GogekDTo> list = null;
		if(order.equals("up")){
			list = model.getDataAll();
		}
		else if(order.equals("down")){
			list = model.getDataAlld();
		}
		
		request.setAttribute("data", list);
		
		return "gogek";
	}
}
