package com.jbit.test;
/**
 *
 *@author 栗子
 *@description 懒汉模式
 */
public class Singleton {
//	是否 Lazy 初始化：是
//	是否多线程安全：否
//	实现难度：易
	private static Singleton instance;
	private Singleton(){}
	
	/*public static Singleton getInstance(){
		if(instance==null){
			instance=new Singleton();
		}
		return instance;
	}
	*/
//	是否 Lazy 初始化：是
//	是否多线程安全：是
//	实现难度：易
	public static synchronized Singleton getInstance(){
		if(instance==null){
			instance =new Singleton();
		}
		return instance;
	}
	
}
