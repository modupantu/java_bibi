class Demo2CodeState {
	static {
		System.out.println("1");
	}
	public static void main(String[] args){
		System.out.println("2");
		Student1 s1 = new Student1();
//		Student1 s2 = new Student1();
	}
}

class Student1{
	static {
		System.out.println("3");
	}
	{
		System.out.println("4");
	}
	public Student1(){
		System.out.println("5");
	}
}