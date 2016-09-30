package kr.co.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import pack.mybatis.SqlMapConfig;

public class GogekModel {

	
	public static GogekModel model = new GogekModel();
	public static GogekModel instance(){
		return model;
	}
	
	private SqlSessionFactory factory = SqlMapConfig.getSqlSession();
	
	public ArrayList<GogekDTo> getDataAll(){
		ArrayList<GogekDTo> list = new ArrayList<>();
		
		try {
			SqlSession session = factory.openSession();
			list = (ArrayList)session.selectList("gogekUp");
		} catch (Exception e) {
			System.out.println("getdataAll err : " + e);
		}
		return list;
	}
	
	public ArrayList<GogekDTo> getDataAlld(){
		ArrayList<GogekDTo> list = new ArrayList<>();
		
		try {
			SqlSession session = factory.openSession();
			list = (ArrayList)session.selectList("gogekDown");
		} catch (Exception e) {
			System.out.println("getdataAll err : " + e);
		}
		return list;
	}
}
