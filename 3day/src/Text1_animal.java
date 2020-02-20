class Test1_animal{
	public static void main(String[] a){
    Cat1  c1 = new Cat1("花",4);
    c1.eat();
    c1.catchMouse();
    System.out.println(c1.getColor()+"11111"+c1.getLeg());
	  Dog d1 = new Dog("花",4);
		d1.eat();
		d1.lookHome();
		System.out.println(d1.getColor()+"11111"+d1.getLeg());
	}
}

class Animal {
	private String color; //颜色
	private int leg; //腿
	public Animal(){};//空参构造
//有参构造
	public Animal(String color,int leg){
		this.color=color;
		this.leg = leg;
	}
	//设置颜色
	public void setColor(String color){
		this.color = color;
	}
	// 设置腿的个数
	public void setLeg(int leg){
		this.leg = leg;
	}
	public String getColor(){
		return color;
	}
	public int getLeg(){
		return leg;
	}
	public void eat(){
		System.out.println("eat");
	}
}


class Cat1 extends Animal{
	public Cat1(){}
	public Cat1(String color,int leg){
		super(color,leg);
	}
	public void eat(){
		System.out.println("猫吃鱼");
	}
	public void catchMouse(){
		System.out.println("猫抓老鼠");
	}
}

class Dog extends Animal{
public Dog(){}
public Dog(String color,int leg){
	super(color,leg);
}
public void eat(){
	System.out.println("狗吃肉");
}
public void lookHome(){
	System.out.println("看家");
}
}