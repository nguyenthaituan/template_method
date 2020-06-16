
package template.method;

public class Coffee extends CaffeineBeverage{

    @Override
    public void brew() {
        System.out.println("Bỏ bột cafe vào");
    }

    @Override
    public void addCondiments() {
        System.out.println("Thêm đường, sữa" + "\n");
        
    }
    
}
