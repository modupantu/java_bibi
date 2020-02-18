package bijiao_demo;

public class bijiao_demo
{
 public static void main(String[] args){
 	boolean b1= isEquals(10,10);
 	System.out.println(b1);
 	boolean b2 = isEquals(10.5,10.6);
 	System.out.println(b2);
 }

 public static boolean isEquals(int a,int b){
 	return a==b;
 }
 /*
 * 方法重载（通过参数类型区分）
 * */

 public static boolean isEquals(double a,double b){
	return a==b;
}
}
