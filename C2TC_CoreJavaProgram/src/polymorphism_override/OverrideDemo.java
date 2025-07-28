package polymorphism_override;

public class OverrideDemo {
	
	public static void main(String[] args) {
		
		PLTraining p1=new PLTraining();
		p1.session("Full Stack developers");
		
		p1=new JFS();
		p1.session ("Methord Overriding");
				
		p1=new Python();
		p1.session ("Methord Overriding");		
				
	}

}
