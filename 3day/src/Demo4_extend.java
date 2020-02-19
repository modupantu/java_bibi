public class Demo4_extend {
	public static void main(String[] a) {
    Son s = new Son();

	}
}
/*
* 子类中所有的构造方法默认都会访问父类中空参的构造方法
*
* */
class Father {
 public   Father (){
	System.out.println("Father 的构造方法");
 }
}
class Son extends Father{
  public Son(){
  	super(); // 这是一条语句，如果不屑，系统会默认加上，用来访问父类中的空参构造
	  System.out.println("Son 的构造方法");
  }
}