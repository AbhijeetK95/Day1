package com.prog.carapp.Carinventory;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.scheduling.config.FixedRateTask;

import com.prog.carapp.Dao.Mainloosecoupledao;
import com.prog.carapp.Model.Bean;
/**
 * Hello world!
 *
 */
public class App 
{  
    public static void main( String[] args )
    {
        System.out.println( "Program Started!!!!!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("com/prog/carapp/Carinventory/Config.xml");
        Mainloosecoupledao firstdata = context.getBean("firstdata",Mainloosecoupledao.class);
        
  ///////////////////////////add data to table start ////////////////////////////
        
    Scanner sc = new Scanner(System.in);
     System.out.println("Enter the Value to be Continue ....Select 1 for INSERT DATA...OR Select 2 For SHOW DATA");
             int intvalue = sc.nextInt();
             if(intvalue == 1) {
                 Bean bn =new Bean();
          	     bn.setCarName("maruti");
                 bn.setCarmodel("suzuki");
                 bn.setYear(2008);
                 bn.setPrice(29999);
                 int finalresult = firstdata.insert(bn);
          	   System.out.println("Data added"+finalresult);
          	   System.out.println("Inserted Data "+bn);
          	 
               System.out.println("Enter the Value to be Continue ....Select 1 for INSERT DATA...OR Select 2 For SHOW DATA");
               intvalue = sc.nextInt();
               
          	 }else if(intvalue == 2) {
              List<Bean> getalldata = firstdata.getalldata();
           	  for(Bean alldata : getalldata ) {
           	  System.out.println("All data ==>>"+alldata);
           	  }
            }else {
            	System.out.println("Something Went Wrong Please select Correct Value...!!!");
            }
             
      
       /*Bean bn =new Bean();
	   bn.setCarName("maruti");
       bn.setCarmodel("suzuki");
       bn.setYear(2008);
       bn.setPrice(29999);
       int finalresult = firstdata.insert(bn);
	   System.out.println("Data added"+finalresult);
	   System.out.println("Inserted Data "+bn);*/
	 
        
 /// //////////////add data to table start end/////////////////////////////
	
///////////////////for update start/////////////////////////////////////////////
    /*    
	Bean bn =new Bean();
    bn.setId(3);
    bn.setCarName("Toyota");
    bn.setCarmodel("honda");
    bn.setYear(2007);
    bn.setPrice(28999);
    int finalresultu = firstdata.update(bn);
	System.out.println("Data update"+finalresultu);
	*/
	
 /////////////////////////   for update end ///////////////////////////////
	
	
///////////////////////////////for delete start//////////////////////
	/*
	 * int deleteresult = firstdata.delete(3);
	 * System.out.println("Data delete"+deleteresult);
	 */
////////////////////////////for delete end///////////////////////////
	
///////////////////////////////Show Data start//////////////////////
	   
	 /* Bean getdata = firstdata.getdata(6);
	  System.out.println("Show Data"+getdata);*/
	   
	   
	   
///////////////////////////////Show Data start//////////////////////
	   
	   
///////////////////////////////Show  all  Data start//////////////////////
	  
	  
	  
///////////////////////////////Show  all  Data start//////////////////////
	

	
	
        
		/*
		 * JdbcTemplate temp = context.getBean("jdbcTemplate",JdbcTemplate.class);
		 * String urlsavequery
		 * ="insert into cardetail(carName,carmodel,year,price) values(?,?,?,?)"; int
		 * showdata = temp.update(urlsavequery,"Toyota","Prius",2006,27999);
		 * System.out.println("Add car entry"+showdata);
		 */
		
    }
}
