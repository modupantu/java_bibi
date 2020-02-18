public class Demo1_extend {
public static void main(String[] args) {
}
}

class Animl{
		String color;
		int leg;
		public void eat(){
			System.out.println("eat");
		}
		public void sleep(){
			System.out.println("睡觉");
		}
}

class Cat extends Animl{}

class dog extends Animl{}
