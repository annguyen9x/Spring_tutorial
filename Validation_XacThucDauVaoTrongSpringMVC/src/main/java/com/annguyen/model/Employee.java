package com.annguyen.model;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class Employee {
	@NotEmpty
	private String name;  
    @Pattern(regexp="^[a-zA-Z0-9]{3}",message="length must be 3")  
    private String pass;  
      
    public String getName() {  
        return name;  
    }  
    public void setName(String name) {  
        this.name = name;  
    }  
    public String getPass() {  
        return pass;  
    }  
    public void setPass(String pass) {  
        this.pass = pass;  
    }  
	
}
