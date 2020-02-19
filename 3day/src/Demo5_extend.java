class Fu{
	public int num = 10;
	public Fu(){
		System.out.println("fu");
	}
}
class Zi extends Fu{
	public int num = 20;
	public Zi(){
		System.out.println("zi");
	}
	public void Show(){
		int num = 30;
		System.out.println(num);
		System.out.println(this.num);
		System.out.println(super.num);
	}
}

class Demo5_extend{
	public static void main(String[] a){
		Zi z = new Zi();
		z.Show();
	}
}