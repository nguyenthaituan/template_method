
package template.method;
import Bai2.Product;
import java.util.ArrayList;
import java.util.List;
import Bai2.SortCollection;
import Bai2.SortByPrice;
import Bai2.SortProductByName;

public class TemplateMethod {

    public static void main(String[] args) {
       CaffeineBeverage cafe = new Coffee();
       CaffeineBeverage tea = new Tea();
       
        System.out.println("Công thức pha cafe");  
        cafe.prepareRecipe();
     
        System.out.println("Công thức pha trà");
        tea.prepareRecipe();
     
       List<Product> listProDuct = new ArrayList<>();
       listProDuct.add(new Product("M", 15000, 30));
       listProDuct.add(new Product("N", 20000, 10));
       listProDuct.add(new Product("A", 10000, 20));
          
       SortCollection<Product> sapxeptheoGia = new SortByPrice();
        System.out.println("\n\n Sắp xếp theo giá: ");
        for(int i=0;i<listProDuct.size();i++)
        {
            System.out.println("Tên: " + listProDuct.get(i).getName()+"\t" + "Giá: " 
                    + listProDuct.get(i).getPrice()+"\t" + "Chất lượng: " + listProDuct.get(i).getQuanlity());
            sapxeptheoGia.sort(listProDuct);
        }
       
        SortCollection<Product> sapxeptheoTen = new SortProductByName(); 
        
        sapxeptheoTen.sort(listProDuct);
        System.out.println("\nSắp xếp theo tên: ");
        for(int i=0;i<listProDuct.size();i++)
        {
            System.out.println("Tên: " + listProDuct.get(i).getName()+"\t" + "Giá: " 
                    + listProDuct.get(i).getPrice()+"\t" + "Chất lượng: " + listProDuct.get(i).getQuanlity());
            sapxeptheoTen.sort(listProDuct);
        }
        
        
    }
    
}
