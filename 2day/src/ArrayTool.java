
//工具类
/*
* 工具类
* @author crc
* @version v1.0.0
*
*javadoc -d apidoc  ArrayTool.java -encoding utf-8

* */

public class ArrayTool{
	/*
	* 如果一个类中所有的方法都是静态的，需要私有构造方法。
	* 防止其他人实例化此方法
	* 直接用类名调用即可
	* */
	private ArrayTool(){};

//获取最大值
	/*
	* 获取最大值
	* @param arr 接收一个int[]
	* @return 返回数组中的最大值
	* */
 public static int getMax(int[] arr){
 	 int max = arr[0];
 	 for (int i=0;i<arr.length;i++){
 	 	if(arr[i]>max){
 	 		max = arr[i];
	  }
   }
 	 return max;
 }


//数组遍历
/*
 *  数组遍历
 *  @param arr 接收一个int[]
 * */
 public static void print(int[] arr){
 	for (int i=0;i<arr.length;i++){
 		System.out.println(arr[i]+" ");
  }
 }

// 数组反转
/*
 *  数组反转
 *  @param arr 接收一个int[]
 * */


 public static void revArray(int[] arr){
 	for (int i=0;i<arr.length/2;i++){
 		int temp = arr[i];
 		arr[i] = arr[arr.length-1-i];
 		arr[arr.length-1-i] = temp;
  }
 }
}
