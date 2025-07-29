package InterfaceExample;

public class Executor {
	
	public static void main(String [] args) {
		
		//college referance
		College C1;
		
		//Cse referance
		C1 = new CseStudent();
		C1.session();
		
		//It referance
		C1 = new ItStudents();
		C1.session();
	}

}
