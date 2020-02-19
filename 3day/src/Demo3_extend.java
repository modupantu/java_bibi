public class Demo3_extend {
	public static void main(String[] a) {

	}
}
/*
*  子类只能继承父类非私有的变量和方法
 class Father {
  private String name;
	private void show (){
	   System.out.println("Hello");
  }
}
class Son extends Father{
}
*  子类不能继承父类构造方法，但是可以通过super关键字访问父类的构造方法
*
* */
