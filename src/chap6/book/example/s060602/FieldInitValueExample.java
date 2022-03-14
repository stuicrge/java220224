package chap6.book.example.s060602;

public class FieldInitValueExample {
	public static void main(String[] args) {
		FieldInitValue fiv = new FieldInitValue();
		
		System.out.println("byField: "+fiv.byteField);
		System.out.println("shortField: "+fiv.shortField);
		System.out.println("intField: "+fiv.intField);
		System.out.println("longField: "+fiv.longField);
		System.out.println("booleanField: "+fiv.booleanField);
		System.out.println("charField: "+fiv.charField);
		System.out.println("floatField: "+fiv.floatField);
		System.out.println("doubleField: "+fiv.doubleField);
		System.out.println("arrField: "+fiv.arrField);
		System.out.println("referenceField: "+fiv.referenceField);
		//전부 0 , null , false로 초기화된다. 기본값으로 초기화가 되어져있다
		
	}
}
