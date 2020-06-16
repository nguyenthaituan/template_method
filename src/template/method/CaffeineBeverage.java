
package template.method;


public abstract class CaffeineBeverage {
    public void prepareRecipe(){
        boidWater();
        pourInCup();
        brew();
        addCondiments();
    }
    public void boidWater(){
        System.out.println("Đun sôi 100ml!");
    
    }
    
    public void pourInCup(){
        System.out.println("Đổ vô ly");
    }
    
    public abstract void brew();
    
    public abstract void addCondiments();
}
