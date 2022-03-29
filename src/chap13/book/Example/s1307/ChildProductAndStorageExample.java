package chap13.book.Example.s1307;

public class ChildProductAndStorageExample {
	public static void main(String[] args) {
		ChildProduct<Tv,String,String> product = new ChildProduct<>();
		product.setKind(new Tv());
		product.setModel("smartTv");
		product.setcompany("Samsung");
		
		Storage<Tv> storage = new StorageImpl<Tv>(100);
		storage.add(new Tv(), 0);
		Tv tv = storage.get(0);
		
		System.out.println(product.getModel());
		System.out.println(product.getcompany());
		
	}
}
