package day5normal;

public class Person {
	private int pid;
	private String name;
	private String City;
	private int getPid() {
		return pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", name=" + name + ", City=" + City + "]";
	}	
	
	
 
}
