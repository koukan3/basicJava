package com.tg.basicjava.principle.lsp;

public abstract class BaseType {
	
	
	private double height;
	private double width;
	
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	
	
	public abstract void zoom(double height,double width);

	
}
