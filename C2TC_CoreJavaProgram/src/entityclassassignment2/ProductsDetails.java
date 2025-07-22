package entityclassassignment2;

import entityclassassignment2.Products;

public class ProductsDetails {
	
	
		public static void main(String[] args) {
			Products p1 = new Products();
			p1.setPid(01);
			p1.setPname("shampoo");
			p1.setPrice(20);
			System.out.println(p1);
			
			Products p2 = new Products();
			p2.setPid(03);
			p2.setPname("soap");
			p2.setPrice(21);
			System.out.println(p2);

		}

}
