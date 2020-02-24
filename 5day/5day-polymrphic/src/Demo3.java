/**
 * @program: 6day
 * @description:
 * @author: 魔都叛徒
 * @create: 2020-02-24 23:57
 */
public class Demo3 {
	public static void main(String[] a){
		ybq x = new ybq();
		x.zg();
	}
}

abstract class khbd{
	public abstract void zg();
}

class ybq extends khbd{
	public void zg() {
		System.out.println("use yaqian");
	}
}

class lpz extends khbd{
	public void zg() {
		System.out.println("use zhijiadao");
	}
}

class dfbb extends khbd {
	public void zg() {
		System.out.println("use cuizhi");
	}
}