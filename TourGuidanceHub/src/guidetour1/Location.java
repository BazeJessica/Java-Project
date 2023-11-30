/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guidetour1;

/**
 *
 * @author DELL
 */
public abstract class Location {

    protected String name;
    protected String description;

    public Location(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void setName(String name){
        if(this.name != null){
            this.name=name;
        }
        else{
            System.out.println("No City name was provided");
        }
    }
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    // Abstract method to display information about the location
    public abstract void displayInfo();
}

// Concrete class to represent a City
class City extends Location {

   protected String state;

    public City(String name, String description, String state) {
        super(name, description);
        this.state = state;
    }

    @Override
    public void displayInfo() {
        System.out.println("City: " + getName());
        System.out.println("State: " + state);
        System.out.println("Description: " + getDescription());
        System.out.println();
    }
}

// Concrete class to represent a Tourist Site
class TouristSite extends Location {

   protected String city;

    public TouristSite(String name, String description) {
        super(name, description);
    }

    @Override
    public void displayInfo() {
        System.out.print("Tourist Site: " + getName());
        System.out.println(", " + getDescription());
    }
}

// Concrete class to represent Activities
class TouristActivity {

   protected String name;
    protected String description;

    public TouristActivity(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void performActivity() {
        System.out.print("Activity: " + name);
        System.out.println(", " + description);
    }

}
