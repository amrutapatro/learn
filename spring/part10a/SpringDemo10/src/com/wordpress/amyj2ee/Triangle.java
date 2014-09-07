package com.wordpress.amyj2ee; 

import java.util.List;

public class Triangle {
	
	private Point pointA;
//	private Point pointB;
//	private Point pointC;
	
	public Triangle(Point pointA){
		this.pointA=pointA;
	}
	
	
	public void draw(){
		System.out.println("Point A = ( "+ this.getPointA().getX()+ ","+this.getPointA().getY()+")");
//		System.out.println("Point B = ( "+ this.getPointB().getX()+ ","+this.getPointB().getY()+")");
//		System.out.println("Point C = ( "+ this.getPointC().getX()+ ","+this.getPointC().getY()+")");
	}
	/**
	 * @return the pointA
	 */
	public Point getPointA() {
		return pointA;
	}
	/**
	 * @param pointA the pointA to set
	 */
//	public void setPointA(Point pointA) {
//		this.pointA = pointA;
//	}
	/**
	 * @return the pointB
	 */
//	public Point getPointB() {
//		return pointB;
//	}
	/**
	 * @param pointB the pointB to set
	 */
//	public void setPointB(Point pointB) {
//		this.pointB = pointB;
//	}
	/**
	 * @return the pointC
	 */
//	public Point getPointC() {
//		return pointC;
//	}
	/**
	 * @param pointC the pointC to set
	 */
//	public void setPointC(Point pointC) {
//		this.pointC = pointC;
//	}

}
