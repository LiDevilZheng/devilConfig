package com.jbit.test;
/**
 *
 *@author 栗子
 *@description 单例
 */
public class SingleObject {
	//创建SingleObject的一个对象
	private static SingleObject instance=new SingleObject();
	//让构造函数为private,防止该类实例化
	private SingleObject(){
		
	}
	//获取唯一可用对象的方法
	public static SingleObject getInstance(){
		return instance;
	}
	public void showMessage(){
		System.out.println("Hello World!");
	}
	public static void main(String []args){
		 //不合法的构造函数
	      //编译时错误：构造函数 SingleObject() 是不可见的
	      //SingleObject object = new SingleObject();
		SingleObject object=SingleObject.getInstance();
		object.showMessage();
	}
}
