package day5normal;

public class Trainer extends Person {
	
	private String Session;
	private String desig;
	private String batchno;
	
	public Trainer(int pid, String name,    String session, String desig, String batchno) {
		super();
		Session = session;
		this.desig = desig;
		this.batchno = batchno;
	}

	public String getSession() {
		return Session;
	}
	public void setSession(String session) {
		Session = session;
	}
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
	public String getBatchno() {
		return batchno;
	}
	public void setBatchno(String batchno) {
		this.batchno = batchno;
	}
	@Override
	public String toString() {
		return "Trainer [Session=" + Session + ", desig=" + desig + ", batchno=" + batchno + "]";
	}
	
	
	
}
