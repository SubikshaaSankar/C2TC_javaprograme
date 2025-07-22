package entityclassassignment1;

public class Students {
	
		private int Sid;
	    private String Sname;
	    private int Sage;
	    public int getCid() {
		return Sid;
	}
		public int getSid() {
			return Sid;
		}
		public void setSid(int sid) {
			Sid = sid;
		}
		public String getSname() {
			return Sname;
		}
		public void setSname(String sname) {
			Sname = sname;
		}
		public int getSage() {
			return Sage;
		}
		public void setSage(int sage) {
			Sage = sage;
		}
		@Override
		public String toString() {
			return "Students [Sid=" + Sid + ", Sname=" + Sname + ", Sage=" + Sage + "]";
		}
		

}
