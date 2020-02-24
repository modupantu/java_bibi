/**
 * @program: 6day
 * @description:
 * @author: 魔都叛徒
 * @create: 2020-02-24 23:57
 */
public class Text1_Cat_Dog {
	public static void main(String[] a){
    Cat1 c = new Cat1("jiafei",8);
    c.eat();
    c.CatchMouse();
    Dog dog = new Dog("888",30);
    dog.lookHome();
    dog.eat();
	}
}


abstract class Animal_1 {
	private String name;
	private int age;
	public Animal_1(){};
	public Animal_1(String name,int age){
		this.name = name;
		this.age = age;
	};
	public void setName(String name){
		this.name = name;
	}
	public String getName() {
	    return name;
	}
	public int getAge() {
	    return age;
	}
	public void setAge(int age){
		this.age = age;
	}
	public abstract void eat();
}

class Cat1 extends Animal_1{
	public Cat1() {}
	public Cat1(String name,int age){
		super(name, age);
	}
	public void eat() {
	    System.out.println("Cat eat yu");
	}
	public void CatchMouse() {
		System.out.println("抓老鼠");
	}
}

class Dog extends Animal_1{
public Dog() {}
public Dog(String name,int age){
	super(name, age);
}
public void eat() {
	System.out.println("Cat eat 肉");
}
public void lookHome() {
	System.out.println("看家");
}
}