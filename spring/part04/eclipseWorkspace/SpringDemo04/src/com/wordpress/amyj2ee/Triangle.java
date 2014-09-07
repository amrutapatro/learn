package com.wordpress.amyj2ee; 

public class Triangle {
	
	String type;
	

	Triangle(String type) {
		this.type = type;	
	}
	
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	
//	public void setType(String type) {
//		this.type = type;
//	}

	public void draw(){
		System.out.println("Triangle Drawn type is "+type);
	}

}
