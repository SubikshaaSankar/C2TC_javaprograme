package abstractexample;

public class executor {
	
	public static void main(String[] args) {
		coder c1;
		
		//student object
		c1= new Student();
		c1.rules();
		
		//trainer object
		c1= new trainer();
		c1.rules();
	}

}
