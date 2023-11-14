import java.util.ArrayList;
import java.util.List;

public class Orderlist {
    List <Product> products = new ArrayList<>(); 

    public void productAdder(Product product){
        products.add(product);
    }
    public void productRemover(Product product){
        products.remove(product);
    }
    
}
