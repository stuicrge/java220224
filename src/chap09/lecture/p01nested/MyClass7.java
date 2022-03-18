package chap09.lecture.p01nested;

public class MyClass7 {
	void method1(int param) {
		//지역클래스에서 지역변수 사용시 주의점
		//지역변수(파라미터)는 final이어야만 함
		//단, 값이 변경되지 않으면 생략가능(effectively final)
		final int i=3;
		
		class LocalClass1{
			void method2() {
				System.out.println(i);
			}

			void method4() {
				System.out.println(param);
//				param = 4; 값을 변경할 수 없다(X)
				
			}
		}
	}
}
