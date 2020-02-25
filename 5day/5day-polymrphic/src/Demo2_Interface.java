/**
 * @program: 5day
 * @description: 接口
 * @author: 魔都叛徒
 * @create: 2020-02-25 23:29
 */
public class Demo2_Interface {
	public static void main(String[] a){
    Demo31 d = new Demo31();
    d.print();

	}
}
/*
 * 成员变量；只能是常量，并且是静态的并公共的。
 * 默认修饰符：public static final	三个关键字可以互相交换位置
 * 建议：自己手动给出。
 * 构造方法：接口没有构造方法。
 * 成员方法：只能是抽象方法。
 * 默认修饰符：public abstract
 * 建议：自己手动给出。
 */
interface Inter12{
	public static final int num = 10;
}

class Demo31 implements Inter12{
	public void print() {
	    System.out.println(num);
	}
}