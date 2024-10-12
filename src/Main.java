public class Main {
    public static void main(String[] args) {

        Product product = new Product();

        product.setId(1);
        product.setName("Mobile");
        product.setCategory("Electronics");
        product.setPrice("670");

        System.out.println("PRODUCT NAME: " + product.getName());
        System.out.println("CATEGORY: " + product.getCategory());
        System.out.println("PRICE: " + product.getPrice());

        Product product2 = new Product();

        product2.setId(2);
        product2.setName("Fan");
        product2.setCategory("Electronic");
        product2.setPrice("200");

        System.out.println("PRODUCT NAME: " + product2.getName());
        System.out.println("CATEGORY: " + product2.getCategory());
        System.out.println("PRICE: " + product2.getPrice());
    }
}