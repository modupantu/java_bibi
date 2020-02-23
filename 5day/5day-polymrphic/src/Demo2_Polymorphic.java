/**
 * @program: 5day
 * @description:
 * @author: 魔都叛徒
 * @create: 2020-02-23 23:25
 */
class Demo2_Polymorphic {
	public static void main(String[] a){
	   Father f = new Son();
	   System.out.println(f.num);
	}
}
   
class Father{
	int num = 10;
}
class Son extends  Father{
	int num = 20;
}