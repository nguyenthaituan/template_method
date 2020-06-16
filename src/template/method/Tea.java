/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package template.method;

public class Tea extends CaffeineBeverage{

    @Override
    public void brew() {
        System.out.println("Bỏ trà vào!");
    }

    @Override
    public void addCondiments() {
        System.out.println("Thêm đường phèn");
    }
    
}
