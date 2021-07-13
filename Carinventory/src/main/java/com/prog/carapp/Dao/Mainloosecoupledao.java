package com.prog.carapp.Dao;

import java.util.List;

import com.prog.carapp.Model.Bean;

public interface Mainloosecoupledao {
  public int insert(Bean bn);
  public int update(Bean bn);
  public int delete(int id); 
  public Bean getdata(int id);
  public List<Bean> getalldata();
   
}
