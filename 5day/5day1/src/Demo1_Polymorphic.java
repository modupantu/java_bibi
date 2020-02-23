/**
 * @program: 5day
 * @description: 多态 Polymorphic
 * @author: 魔都叛徒
 * @create: 2020-02-23 23:11
 */

/*
* 1.多态
*   事物存在的多种状态
* 2.多态的前提
*   要有继承关系
*   要有方法重写
*   要有父类应用指向子类对象
* */
class Demo1_Polymorphic {
  public static void main(String[] a){
//    父类引用指向子类对象
    Animal a1 = new Cat();
    a1.eat();
  }
}

class Animal{
	public void eat(){
		System.out.println("动物吃饭");
	}

}
//继承关系
class Cat extends Animal{
//	方法重写
	public void eat(){
		System.out.println("猫吃鱼");
	}
}