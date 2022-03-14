package chap6.lecture.p09getter_setter;

public class Computer {
	private int ssd; //읽기전용 값이 고정
	private int ram;
	
	public Computer() {
		ssd = 1000;
	}
	public int getSsd() {
		return this.ssd;
	}
	
	public void setRam(int ram) {
		if(ram<0) {
			this.ram=4;
		}else
		this.ram = ram;
	}
	int getRam() {
		return this.ram;
	}
}
