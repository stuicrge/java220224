package chap11.lecture.p01object;

public class App04 {
	
	public static void main(String[] args) {
		
		Desk d1 = new Desk("a01");
		Desk d2 = new Desk("b01");
		Desk d3 = new Desk("a01");
		
		System.out.println(d1 == d2);
		System.out.println(d1 == d3);//참조값 비교
		System.out.println(d1.equals(d3));//model값 비교
	}
	
	
}
class Desk {
	private String model;
	
	Desk(String model){
		this.model = model;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		
		if(obj instanceof Desk) {
			Desk d = (Desk) obj;
			if(d.model.equals(this.model)) {
				return true;
			}
		}
				
		return false ;
	}
}
