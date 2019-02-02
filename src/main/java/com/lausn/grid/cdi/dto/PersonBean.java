package com.lausn.grid.cdi.dto;

/**
 * Data provider bean scoped for each user session.
 */
public class PersonBean {

   private Integer id;
   private String name;
   
   public void setId(Integer id){
	   this.id=id;
   }
   
   public Integer getId(){
	   return this.id;
   }
   
   public void setName(String name){
	   this.name=name;
   }
   
   public String getName(){
	   return this.name;
   }
	
}
