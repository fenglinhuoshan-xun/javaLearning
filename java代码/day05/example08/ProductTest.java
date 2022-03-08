/*
	每一个类中都可以编写主方法，但是一般情况下，一个系统只有一个入口，所以主方法一般只写一个
*/

public class ProductTest{

	public static void main(String[] args){
		
		// 创建商品对象
		Product iphone7 = new Product();

		System.out.println("商品的编号" + iphone7.productNo);
		System.out.println("商品的单价" + iphone7.price);
	}
}