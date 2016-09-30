package kr.co.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.model.SawonDto;
import kr.co.model.SawonModel;

public class SawonImpl implements CommandInter{
	public static SawonImpl impl = new SawonImpl();	
	public static SawonImpl instance(){
		return impl;
	}
	
	@Override
	public String showData(HttpServletRequest request, HttpServletResponse response,String order) throws Exception {
		SawonModel model = SawonModel.instance();
		ArrayList<SawonDto> list = null;
		if(order.equals("up")){
			list = model.getDataAll();
			
		}
		if(order.equals("down")){
			list = model.getDataAlld();
		}
		request.setAttribute("data", list);
		
		
		
		return "sawon";
	}
}
