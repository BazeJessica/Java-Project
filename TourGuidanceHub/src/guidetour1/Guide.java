/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guidetour1;

/**
 *
 * @author gabriel
 */
public class Guide extends Character{// inheritance 
    
    public Guide(String name) {
        super(name);
      
    }

    // give ordres 
    public void giveOrders() {
        System.out.println();
        System.out.println("Hello I am " + name + " ,and I will be your guide for this tour");
    }
    
}
