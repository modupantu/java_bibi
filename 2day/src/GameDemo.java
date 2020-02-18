import java.util.Scanner;

public class GameDemo {
	public static void main(String[] a){
		Scanner sc = new Scanner(System.in);
		System.out.println("输入一个整数0-100");
		int guessNum = (int)(Math.random()*100)+1;
		while (true){
			int result = sc.nextInt();
			if(result>guessNum){
				System.out.println("大了");
			}else if(result<guessNum){
				System.out.println("小了");
			}else{
				System.out.println("ok");
				break;
			}
		}
	}
}
