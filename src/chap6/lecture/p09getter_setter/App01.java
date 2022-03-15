package chap6.lecture.p09getter_setter;

public class App01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer c1 = new Computer();
//		c1.ram=16;
		c1.setRam(16);
		Computer c2 = new Computer();
//		c2.ram=32;
		c2.setRam(32);
		System.out.println(c1.getRam());
		System.out.println(c2.getRam());
		System.out.println(c1.getSsd());
	}

}
