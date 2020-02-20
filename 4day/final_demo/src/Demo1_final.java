/*
* final 概述
* final 修饰特点
*   修饰类 类不能被继承
*   修饰变量 变量变成常量  只能被赋值一次
*   修饰方法 方法不能被重写
* */

public class Demo1_final {
}

/**
*@Description: final 定义的类和方法不能被重写和继承
*@Param: 
*@return: 
*@Author: 魔都叛徒
*@date: 2020/2/20
*/
//demo1

// class Father{
//	public final void print(){
//		System.out.println("访问底层数据");
//	}
//}


//demo2
//final class Father{
//	public void print(){
//		System.out.println("访问底层数据");
//	}
//}
//
//class Son extends Father{
//	public void print(){
//		System.out.println("破坏底层功能");
//	}
//}