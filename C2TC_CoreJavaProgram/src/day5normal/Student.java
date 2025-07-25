package day5normal;

public class Student {
	
	private int uid;
	private String Name;
	private String courseName;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	@Override
	public String toString() {
		return "Trainer [Trainer id: "+super.getPid()
		+"Student Name:"+super.getName()
		+"Student city:"+super.getCity()
		+"Session="+ Session
		+", design=" + design
		+", batchNo=" + batchNo + "]";
		
		
	}
	
	

}
