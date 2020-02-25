/**
 * @program: 5day
 * @description:
 * @author: 魔都叛徒
 * @create: 2020-02-25 23:29
 */
public class Demo1_Interface {
	public static void main(String[] a){
		Inter i = new Demo12();
			i.print();
	}
}
//接口
interface Inter{
	public abstract  void  print();//接口中的方法都是抽象的
}

class Demo12 implements Inter{
	public void print() {
		System.out.println("print");
	}
}