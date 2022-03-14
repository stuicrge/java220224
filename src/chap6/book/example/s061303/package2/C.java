package chap6.book.example.s061303.package2;
import chap6.book.example.s061303.package1.*;
public class C {
	public C() {
		A a= new A();
		a.field1=1;
		//a.field2=1; X
		//a.field3=1; X
		
		a.method1();
		//a.method2(); X
		//a.method3(); X
	}
}
