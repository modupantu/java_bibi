/**
 * @program: 5day
 * @description:
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
class Demo2_Polymorphic {
	public static void main(String[] a){
	   Father f = new Son();
	   System.out.println(f.num);
	   f.print();
	   Son s = new Son();
	   System.out.println(s.num);
	   s.print();
	}
}

class Father{
	int num = 10;
	public void print(){
		System.out.println("Father");
	}
}
class Son extends  Father{
	int num = 20;
public void print(){
	System.out.println("Son");
}
}