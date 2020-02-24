/**
 * @program: 5day
 * @description: 抽象类
 * @author: 魔都叛徒
 * @create: 2020-02-23 23:25
 */

class Demo1_Abstract{
	public static void main(String[] a1){
//		System.out.println("111");
		Animal a = new Cat();
		a.eat();
	}
}
/*
* 定义抽象类
* */
abstract class Animal{
	public abstract void eat(); //定义抽象方法
}

class Cat extends Animal {
    public void eat() {
	    System.out.println("猫吃鱼");
    }
}