
package Bai2;

public class SortProductByName  extends SortCollection<Product>{

    @Override
    public int compare(Product t1, Product t2) {
        return t1.getName().compareTo(t2.getName());
    }   
}
