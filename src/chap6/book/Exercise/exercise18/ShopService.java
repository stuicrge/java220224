package chap6.book.Exercise.exercise18;

public class ShopService {
	private static ShopService shopservice;
	
	private ShopService() {
		
	}
	static ShopService getInstance() {
		return shopservice;
	}
}
