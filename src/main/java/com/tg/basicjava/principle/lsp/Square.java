package com.tg.basicjava.principle.lsp;

/**
 * ������
 *
 */
/*public class Square extends Rectangle{

}*/
public class Square extends BaseType{

	@Override
	public void zoom(double height, double width) {
		double len = (height + width)/2;
		setHeight(getHeight()+len);
		setWidth(getWidth()+len);
	}

}
