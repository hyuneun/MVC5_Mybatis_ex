package kr.co.model;

import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import pack.mybatis.SqlMapConfig;

public class SawonModel {
	
	public static SawonModel model = new SawonModel();
	public static SawonModel instance(){
		return model;
	}
	
	private SqlSessionFactory factory = SqlMapConfig.getSqlSession();
	
	public ArrayList<SawonDto> getDataAll(){
		ArrayList<SawonDto> list = new ArrayList<>();
		
		try {
			SqlSession session = factory.openSession();
			list = (ArrayList)session.selectList("sawonUp");
			
		} catch (Exception e) {
			System.out.println("getdataAll err : " + e);
		}
		return list;
	}
	
	public ArrayList<SawonDto> getDataAlld(){
		ArrayList<SawonDto> list = new ArrayList<>();
		
		try {
			SqlSession session = factory.openSession();
			list = (ArrayList)session.selectList("sawonDown");
			
		} catch (Exception e) {
			System.out.println("getdataAll err : " + e);
		}
		return list;
	}
}
