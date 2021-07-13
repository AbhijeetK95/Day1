package com.prog.carapp.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.prog.carapp.Model.Bean;

public class Rowmapperdao implements RowMapper<Bean> {

	@Override
	public Bean mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		
		Bean bn = new Bean();
		bn.setId(rs.getInt(1));
		bn.setCarName(rs.getString(2));
		bn.setCarmodel(rs.getString(3));
		bn.setPrice(rs.getInt(4));
		bn.setYear(rs.getInt(5));
		
		return bn;
	}

}
