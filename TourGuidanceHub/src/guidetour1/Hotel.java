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
public class Hotel extends Accomodation {

    String[] services = {"Wifi", "Parking Spot", "Television","Sport room","restaurant"};

    public Hotel(String name,boolean isAvailable) {
        super(name,isAvailable);
    }

    @Override
    public String toString() {
    if (isAvailable == true) {
        return "Welcome to our fancy " + this.getName() + " hotel, you have access to these services as well { " + Arrays.toString(services) + " }";
    } else {
        return "We are sorry to inform you that, " + this.getName() + " is not available at the moment";
    }
}

    
}

//    public Hotel() {
//        // Add the default constructor implementation here if needed
//    }

