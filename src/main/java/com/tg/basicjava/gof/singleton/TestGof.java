package com.tg.basicjava.gof.singleton;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import org.junit.Test;

public class TestGof {
	
	@Test
	public void test3(){
		Singleton1_3 s1 = Singleton1_3.getInstance();
		Singleton1_3 s2 = Singleton1_3.getInstance();
		System.out.println("正常访问情况下："+s1);
		System.out.println("正常访问情况下："+s2);
		
		try {
			String path = "e:"+File.separator+"singleton.txt";
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));
			oos.writeObject(s1);
			oos.close();
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));
			Singleton1_3 s3 = (Singleton1_3) ois.readObject();
			//前提是该类实现了序列化接口。  // 反序列化破解：在类中使用 readResolve()方法。
			System.out.println("【破解单例】通过反序列化得到多个实例化对象: "+s3);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	public void test2(){
		Singleton1_2_1 s1 = Singleton1_2_1.getInstance();
		Singleton1_2_1 s2 = Singleton1_2_1.getInstance();
		System.out.println("正常访问情况下："+s1);
		System.out.println("正常访问情况下："+s2);
		
		try {
			Class<Singleton1_2_1> clazz = (Class<Singleton1_2_1>) Class
					                       .forName("com.myjava.gof23.singleton.Singleton1_2_1");
			Constructor<Singleton1_2_1> con = clazz.getDeclaredConstructor(null);
			con.setAccessible(true);
			Singleton1_2_1 s3 = con.newInstance();
			Singleton1_2_1 s4 = con.newInstance();
			System.out.println("【破解单例】通过反射得到多个实例化类："+s3);
			System.out.println("【破解单例】通过反射得到多个实例化类："+s4);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	}
	public void test1(){
		Th ins = new Th();
		Thread th1 = new Thread(ins);
		Thread th2 = new Thread(ins);
		th1.start();
		th2.start();
		
		System.out.println(Singleton2_2.INSTANCE);
		System.out.println(Singleton2_2.INSTANCE);
		/*Singleton1 s1 = Singleton1.getInstance();
		Singleton1 s2 = Singleton1.getInstance();
		System.out.println(s1+" "+s2);
		System.out.println(s1==s2);*/
	}
	
	public class Th implements Runnable{
		Singleton1_1 s;
		@Override
		public void run() {
			s = Singleton1_1.getInstance();
			System.out.println(s);
		}
		
	}

}
