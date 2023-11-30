/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guidetour1;

/**
 *
 * @author DELL
 */
public class Accomodation {

    protected String name;
    protected boolean isAvailable;
    

   public Accomodation(String name,boolean isAvailable) {
    this.name = name;
    this.isAvailable = isAvailable; // Assuming isAvailable is an instance variable of the class
}

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        if(name != null)
            this.name=name;
        else
            System.out.println("This accomodation is not known");
    }
    public String toString(){
        if(isAvailable == true)
            return "Welcome to our beautiful " + this.getName()+ ", it is available" ;
        else
            return "Welcome to our beautiful " + this.getName()+ ", it is not available" ;  
    }
   
}

