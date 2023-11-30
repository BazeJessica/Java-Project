/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guidetour1;

import java.util.Arrays;

/**
 *
 * @author DELL
 */
public class Appartment extends Accomodation {
    protected boolean canCook;
    String[] services = {"Wifi", "Parking Spot", "Television","bikes", "Barbecue"};

    public Appartment(String name, boolean isAvailable) {
        super(name, isAvailable); // Assuming isAvailable is always true for apartments
    }
    public Appartment(String name,boolean isAvailable,boolean canCook){
        super(name, isAvailable);
        this.canCook= canCook;
    }
    
    @Override
    public String toString(){
        if((isAvailable == true) && canCook == true )
            return "Welcome to our magnificent " + this.getName()+ " appartment, you are allowed to cook as well as have access to these services "+ Arrays.toString(services);
        else
            return "We are sorry to inform you that, " + this.getName()+ " is not available";  
    }
}


    

