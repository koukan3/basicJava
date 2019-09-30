package com.tg.basicjava.principle.lsp;

import com.tg.basicjava.principle.lsp.BaseType;
import com.tg.basicjava.principle.lsp.Rectangle;
import com.tg.basicjava.principle.lsp.Square;
import org.junit.Test;

/**
 * LSP(Liskov substitution principle)里氏替换原则：
 * 1.Subtypes must be substitutable for their base types"，子类必须能够替换成它们的基类。
 *         所以，一个子类型不得具有比基类型（base type）更多的限制
 * 2. 应当尽量从抽象类继承，而不从具体类继承。
 */
public class TestLSP {

	/*
	 * 当 Square extends Rectangle时，调用此方法，当height！=width时，
	 * 就得不到正方形，此方法就不适用于Square，因此不符合LSP。
	 * 结论：应当尽量从抽象类继承，而不从具体类继承。
	 */
	public void zoom(Rectangle rec, double height, double width) {
		double originHeight = rec.getHeight();
		double originWidth = rec.getWidth();
		rec.setHeight(originHeight+height);
		rec.setWidth(originWidth+width);
	}

	//符合LSP，因为对于zoom方法，Rectangle和Square都有符合自己的实现，都可以替代BaseType。
	public void newZoom(BaseType bt,double height,double width) {
		bt.zoom(height, width);
	}

	@Test
	public void testZoom() {
		BaseType bt_Rec = new Rectangle();
		BaseType bt_Square = new Square();
		newZoom(bt_Rec,3,5);
		newZoom(bt_Square,3,5);
		System.out.println("rectangle height: "+bt_Rec.getHeight()+" ,rectangle width: "+bt_Rec.getWidth());
		System.out.println("Square height: "+bt_Square.getHeight()+" ,Square width: "+bt_Square.getWidth());
	}
}