package localGlobal;

public class Product {
	

	        static int productId = 501;
	        static String productName = "Laptop";
	        static String productBrand = "Dell";
	        static String productPrice = "55000";
	        static  String productColor = "Black";
	        static int productWarranty;
	        static String productCategory = "Electronics";
            public static void main(String args[]) {
	        System.out.println("Product ID : " + productId);
	        System.out.println("Product Name : " + productName);
	        System.out.println("Product Brand : " + productBrand);
	        System.out.println("Product Price : " + productPrice);
	        System.out.println("Product Color : " + productColor);
	        System.out.println("Product Warranty : " + productWarranty + " Years");
	        System.out.println("Product Category : " + productCategory);
	    }
}




