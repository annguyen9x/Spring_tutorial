package com.annguyen.dao;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.annguyen.model.Employ;

public class EmployDao {
	JdbcTemplate template;

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	//insert Employ
	public int save(Employ employ) {
		String sql = "Insert Into Employ Values("+ employ.getId()+", '"+ employ.getName()
		+"',"+employ.getSalary()+", '" + employ.getDesignation()+"')";
		
		return template.update(sql);
	}
	
	//update Employ
	public int update(Employ employ) {
		String sql = "Update Employ Set name = '"+ employ.getName()+"', salary="+employ.getSalary()
		+", designation='"+employ.getDesignation()+"', Where id="+employ.getId()+"";
		
		return template.update(sql);
	}
	
	//delete Employ
	public int delete(int id) {
		String sql = "Delete From Employ Where id="+ id+"";
		
		return template.update(sql);
	}
	
	//Get a Employ
	public Employ getEmployById(int id) {
		String sql = "Select * From Employ Where id=" +id +"";
		
		return template.queryForObject(sql, Employ.class);
	}
	
	//Get all Employ
	public List<Employ> getAllEmploy(){
		return template.query("select * from Employ" ,new RowMapper<Employ>(){    
	        public Employ mapRow(ResultSet rs, int row) throws SQLException {    
	        	Employ e = new Employ();    
	            e.setId(rs.getInt(1));    
	            e.setName(rs.getString(2));    
	            e.setSalary(rs.getFloat(3));    
	            e.setDesignation(rs.getString(4));    
	            return e;    
	        }    
	    });    
	}
	
}
