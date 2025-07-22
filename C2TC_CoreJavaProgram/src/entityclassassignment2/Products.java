package entityclassassignment2;

public class Products{
	
		private int Pid;
	    private String Pname;
	    private int Price;
		public int getPid() {
			return Pid;
		}
		public void setPid(int pid) {
			Pid = pid;
		}
		public String getPname() {
			return Pname;
		}
		public void setPname(String pname) {
			Pname = pname;
		}
		public int getPrice() {
			return Price;
		}
		public void setPrice(int price) {
			Price = price;
		}
		@Override
		public String toString() {
			return "Products [Pid=" + Pid + ", Pname=" + Pname + ", Price=" + Price + "]";
		}
	    
		
}
	   