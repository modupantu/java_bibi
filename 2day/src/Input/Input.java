package Input;
import java.util.Scanner;
class Input {
	public static void main(String[] args){
//	  	Scanner sc =new Scanner(System.in); //键盘录入对象
//		  System.out.println("请输入一个整数");
//		  int x = sc.nextInt();
//		  System.out.println("请输入"+x);
		Scanner sc =new Scanner(System.in); //键盘录入对象
		System.out.println("请输入一个整数");
		int x = sc.nextInt();
		System.out.println("请输入"+x);
		System.out.println("请输入2个整数");
		int y = sc.nextInt();
		int xy = x+y;
		System.out.println("输入"+xy);



//		水仙花数
		int num=0;
		for (int i=100;i<999;i++){
			int ge = i%10; //123%10=3
			int shi = i/10%10;//123/10%10=2
			int bai = i/10/10%10; //1%10
			if(ge*ge*ge+shi*shi*shi+bai*bai*bai==i){
				++num;

				System.out.println(i);

			}
		}
		System.out.println(num);

	}
}
