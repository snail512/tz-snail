package wwwang.com;

public class ClassWork7 {
	public static void main(String[] args) {
		int priceShoes = 58;
		int priceClothes = 30;		
		double priceBag = 55.8;
		
		System.out.println("共给钱500");
		System.out.println("买的东西:1双鞋,3件衣服,5个包");
		System.out.println("找零:" + (500 - priceShoes - priceClothes * 3 - priceBag * 5));
	}
}
