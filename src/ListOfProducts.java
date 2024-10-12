import java.util.ArrayList;
import java.util.List;

public class ListOfProducts {
    public static void main(String[] args) {

        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1, "Laptop", "Electronics", "750"));
        productList.add(new Product(2, "Chair", "Furniture", "600"));
        productList.add(new Product(3, "Smartwatch", "Electronics", "500"));
        productList.add(new Product(4, "Notebook", "Stationary", "200"));
        productList.add(new Product(5, "Shoes", "Appare", "350"));

        System.out.println("My object is " + productList.get(2).getName());

        for(int i=0; i < productList.size(); i++){
            productList.get(i).getAllValue();
        }

    }
}
