package com.marakana.contacts.repositories;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.marakana.contacts.entities.Address;

public class AddressRepository {

	private  DataSource ds;
	
	public AddressRepository(){
		Context context;
		try {
			context = new InitialContext();
	
		try {
			ds = (DataSource) context.lookup("java:comp/env/jdbc/trainingdb");
		} finally{
			context.close();
		}
		}
		
		 catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void init(){
		
	}
	
	public void create(Address address){
		
		
	}
	
	public void delete(Address address){
		
	}
	
	public Address find(long id){
		
		return null;
	}
	
}
