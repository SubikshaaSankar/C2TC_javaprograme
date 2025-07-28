public class ExtendingInterfaceDem implements ChildInterface {
	
	
	
	public void print() { 
		System.out.println("print method");
	}

	
	public void show() {
		System.out.println("show Method");
	}
	
	public static void main(String[] args) {
        ExtendingInterfaceDem obj = new ExtendingInterfaceDem();
        obj.print();  
        obj.show();
    }
	
}