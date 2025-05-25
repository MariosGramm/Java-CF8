package gr.aueb.cf.ch12;

public class ProductMain {

    public static void main(String[] args) {

        Product milk = new Product(123322 , "Fage","Full fat" , 19.99 , 20 , true);
        Product cheese = new Product();

        cheese.setPrice(14.90);

        System.out.println("Milk description: " + milk.getDescription() );
        System.out.printf("Cheese price: %.2f", cheese.getPrice());
    }
}
