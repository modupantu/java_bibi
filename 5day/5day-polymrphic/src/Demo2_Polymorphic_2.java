/**
 * @program: 5day
 * @description: 多态
 * @author: 魔都叛徒
 * @create: 2020-02-23 23:25
 */
/*
 * 成员变量
 * 编译看左边（父类） 运行看左边（父类）
 * 成员方法
 * 编译看左边，运行看右边(子类)。动态绑定
 * 静态方法
 * 编译看左边（父类），运行看左边（父类）
 * */
class Demo2_Polymorphic_2{
public static void main(String[] a){
		Person1 p =new SuperMan1();
		System.out.println(p.name);
		p.show();
		((SuperMan1) p).fly();//强制向下转型
	}
}

class Person1{
	String name= "john";
	public void show(){
		System.out.println("说话");
	}
}

class SuperMan1 extends Person1{
	String name = "SuperMan";
	public void show(){
		System.out.println("SuperMan说话");
	}
	public void fly(){
		System.out.println("SuperManfly");
	}
}