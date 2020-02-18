package Data_type;
//数据类型
/*
* 基础数据类型4类8种
* 整数
*     byte 占一个字节 -128到127
*     short 占两个字 -2^15到2^15-1
*     int 占4个字 -2^31到2^31-1
*     long 占8个字 -2^63到2^63-1
* 浮点数
*     float 占4个字 单精度
*     double 占8个字 双精度
* 字符串
*     char 占两个字 0-65535
* 布尔
*     boolean 没有指定大小 理论上占八分之一个字节
* */
public class Data_type {
   public static void main(String [] args){
       byte b = 10;
       short s = 20;
       int i = 30;  //默认的
       long l = 88888888888L; //如果是long类型后面加L标识
       System.out.println(b);
       System.out.println(s);
       System.out.println(i);
       System.out.println(l);
       System.out.println(12345+54321L);

       float f = 12.3F; //如果是float类型后面加F标识
       double d = 33.2; //默认的
       System.out.println(f);
       System.out.println(d);


       char c = 'a';
       System.out.println(c);

       boolean bool = false;
       System.out.println(bool);

       //类型的隐式转换
       int in =10;
       byte by =2;
       in = in + by;
       System.out.println(in);
	     //by = by+in; //精度丢失
	     by = (byte)(by+in); //向下强制转换丢失精度

	   System.out.println("====================");
	   System.out.println(by);

	   float f1 = 12.3F;
	   long x = 12345;
	   f1 =x; //隐式转换
	   System.out.println(f1);
	   x = (long) f1; //强制转换
       System.out.println(x);
       System.out.println("=============");
       System.out.println('a'+1);//隐式转换 "" 转换为int
       System.out.println((char) ('a'+1));//强制转换 ASCII 码表
       System.out.println("hello"+1);
       System.out.println("5+5="+5+5);
   }
}
