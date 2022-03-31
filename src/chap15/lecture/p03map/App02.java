package chap15.lecture.p03map;

import java.util.HashMap;
import java.util.Map;

public class App02 {
	public static void main(String[] args) {
	Map<Computer,Integer> map = new HashMap<>();
	map.put(new Computer("samsung","galaxy"),1);
	map.put(new Computer("LG","gram"),5);
	
	System.out.println(map.size());
	
	map.put(new Computer("samsung","galaxy"),10);
	System.out.println(map.size());
	
	
	
	}
}
class Computer{
	private String model;
	private String company;
	
	public Computer(String model, String company) {
		
		this.model = model;
		this.company = company;
	}

	public String getModel() {
		return model;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Computer other = (Computer) obj;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		return true;
	}

	public String getCompany() {
		return company;
	}


}