package com.tg.basicjava.principle.lsp;

/**
 *  ������
 *
 */
public class Rectangle extends BaseType{

	@Override
	public void zoom(double height, double width) {
		setHeight(getHeight()+height);
		setWidth(getWidth()+width);
	}
	
	/*public double height;
	public double width;
	
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
	}*/
	

}
