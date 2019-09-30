package com.tg.basicjava.clazz.variable;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;

public class UseSiteVariance {
	/**
	 * 在Java里，泛型类型都是invariant(不可变，即不支持协变或逆变)，
	 * 比如 List<String> 并不是 List<Object> 的子类型。
	 * 不过Java支持使用(use-site variance)，也就是在声明变量时
	 */
	@Test
	public void test1() {
		List<String> aList = new ArrayList<String>();
		List<? extends Object> covariantList = aList;
		List<? super String> contravariantList = aList;
		//covariantList.add("d"); //wrong
		covariantList.add(null);
		Object a = covariantList.get(0);

		contravariantList.add("d"); //OK
		//String b =  contravariantList.get(1); //wrong
		String b = (String) contravariantList.get(1); //OK
		Object c = contravariantList.get(2);
	}
	/**
	 * 使用extends关键字确定参数化类型的上界
	 * 在这里参数化类型是Date，也有可能是Date的子类，所以add方法受限制
	 */
	@Test
	public void upperBound(List<? extends Date> list, Date date) {
		Date now = list.get(0);
		System.out.println("now==>" + now);
		//list.add(date); //这句话无法编译，实际调用时传入的list可能是java.util.Date的某个子类的参数化类型
		list.add(null);//这句可以编译，因为null没有类型信息
	}
	/**
	 * 使用super关键字确定参数化类型的下界
	 * 在这里，参数化类型有可能是Timestamp，有可能是其父类（包括Object）
	 */
	@Test
	public void lowerBound(List<? super Timestamp> list) {
		Timestamp now = new Timestamp(System.currentTimeMillis());
		list.add(now);
		//Timestamp time = list.get(0); //不能编译。方法返回的对象类型可能是Date甚至是Object，不能安全的向下转换到Timestamp，也就因此无法编译了
	}
}
