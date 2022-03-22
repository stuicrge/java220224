package chap11.book.Example.s110304;

public class Member implements Cloneable{
	//얕은 복제
	public String id;
	public String name;
	public String password;
	public int age;
	public boolean adult;
	
	public Member(String id , String name , String password, int age, boolean adult) {
		this.id=id;
		this.name=name;
		this.password=password;
		this.age=age;
		this.adult=adult;
	}
	
	public Member getMember() {
		Member cloned = null;
		try {
			cloned = (Member)clone();
		}catch(CloneNotSupportedException e) {}
		return cloned;
	}
	
}
