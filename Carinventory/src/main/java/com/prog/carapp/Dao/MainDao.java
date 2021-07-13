package com.prog.carapp.Dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.prog.carapp.Model.Bean;

import java.util.List;

import org.springframework.*;

public class MainDao implements Mainloosecoupledao {
	
	private JdbcTemplate jdbcTemplate;
	/* private List<Bean> list; */// optional
	
///////////////////////////////////////////////////Add Insert Method///////////////////////////////////////
	public int insert(Bean b){
	   String insertquery = "insert into cardetail(carName,carmodel,year,price) values(?,?,?,?)";
	   //int showresult = this.jdbcTemplate.update(insertquery,b.getId(), b.getCarName(), b.getCarmodel(), b.getYear(),b.getYear());
	   int showresult = this.jdbcTemplate.update(insertquery, b.getCarName(), b.getCarmodel(), b.getYear(),b.getPrice());
	   return showresult; 
	}
	
	
	public int update(Bean bn) {
		// TODO Auto-generated method stub
		 String updatequery = "update cardetail set carName = ?,carmodel= ?,year =?,price =? where id = ?";
		 int finalupdate = this.jdbcTemplate.update(updatequery,bn.getCarName(),bn.getCarmodel(),bn.getYear(),bn.getPrice(),bn.getId());
		return finalupdate;
	}
	
	
	public int delete(int id) {
		// TODO Auto-generated method stub
		String updatequery = "delete from cardetail where id = ?";
		int finaldelete = this.jdbcTemplate.update(updatequery,id);
		return finaldelete;
	}
	

	public Bean getdata(int id) {
		// TODO Auto-generated method stub
		String searchquery = "select * from cardetail where id=?";
		RowMapper<Bean> rowMapper = new Rowmapperdao();
		Bean queryForObject = this.jdbcTemplate.queryForObject(searchquery,rowMapper,id);
		return queryForObject;
	}

	
	
	public List<Bean> getalldata() {
		// TODO Auto-generated method stub
		String alldata =" select * from cardetail";
		List<Bean> listalldata = this.jdbcTemplate.query(alldata , new Rowmapperdao());
		return listalldata;
	}

	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}


	
	

	

	


	


	
	


	
}
