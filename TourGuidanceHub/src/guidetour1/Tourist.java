/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guidetour1;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author gabriel
 */
public class Tourist extends Character {
   
    
     
    public Tourist(String name,String nationality,String gender, int age) {
        super(name,nationality,gender, age);
        this.rating=0;
    }
    public Tourist(){
        
    }
   
    
    public void askQuestion(String question) {
        System.out.println(getName() + " asks: " + question);
    }
     
    public int howManyDaysToStay() {
    Scanner scanner = new Scanner(System.in);
    int daysToStay =0;
    
    
    do {// do a loop in ordrer to enter less than 30 days 
        System.out.print("How many days you want to stay ? (maximum 30 days) ? ");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a valid integer.");
            scanner.next();
        }    
            
        daysToStay = scanner.nextInt();

        if (daysToStay > 30) {
            System.out.println("Sorry, you can't stay more than 30 days. ");
            System.out.println("Please type again how many days you want to stay.");
        }
    } while (daysToStay > 30);
    
    return daysToStay;
            
}
    
    public void fillInformation(){ //autorise a tourist to enter his own information
        Scanner scanner=new Scanner(System.in);
        
        name = "";
         while (true) {
            System.out.print("What is your name? ");
            name = scanner.nextLine();
            if (name.matches("[a-zA-Z]+")) { //only letters, no int
             break;
        }
            else {
                System.out.println("Invalid input. Please enter a valid name with only letters.");
            }
        }
        
        nationality="";
        while (true) {
            System.out.print("What is your nationality? ");
            nationality = scanner.nextLine();
            if (nationality.matches("[a-zA-Z]+")) { //only letters, no int
             break;
        }
            else {
                System.out.println("Invalid input. Please enter a valid nationality with only letters.");
            }
        }
        
        
        gender="";
        while (true) {
            System.out.print("What is your gender (male, female, or prefer not to say)? ");
            gender = scanner.nextLine().toLowerCase(); // Convert on minuscule

            if (gender.equals("male") || gender.equals("female") || gender.equals("prefer not to say")) {
                break; // only if gender is valid
            } else {
                System.out.println("Invalid gender input. Please enter 'male', 'female', or 'prefer not to say'.");
            }
        }

        age=0;
        while (true) {
            System.out.print("How old are you? ");
            if (scanner.hasNextInt()) {
                age = scanner.nextInt();
            break; // only if it's a integer
            } 
            else {
                System.out.println("Invalid input. Please enter a valid age as an integer.");
                scanner.next(); // 
            }
        }
        
        
         try (BufferedWriter writer = new BufferedWriter(new FileWriter("./TouristInfo.txt"))) {
            writer.write("Tourist Information:\n");
            writer.write("Name: " + name + "\n");
            writer.write("Nationality: " + nationality + "\n");
            writer.write("Gender: " + gender + "\n");
            writer.write("Age: " + age + "\n");
            System.out.println();
            System.out.println("Nice meeeting you Mme/Mr " + name + ", lets get started ");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    
    private int rating;
    
    public void setRating(int rating){
        this.rating=rating;
    }
    
   public void giveRating() {
    Scanner scanner = new Scanner(System.in);

    while (true) {
        try {
            System.out.print("On a scale of 1 to 10, how would you rate your experience? ");
            int newRating = scanner.nextInt();

            if (newRating >= 1 && newRating <= 10) {
                setRating(newRating); // Use the method setRating to store the rating
                System.out.println("Thank you for your rating!");
                break;
            } else {
                System.out.println("Invalid rating. Please enter a rating between 1 and 10.");

                // Consume the invalid input to prevent an infinite loop
                scanner.nextLine(); 

                // Ask the user to enter a new rating
                System.out.print("Please enter a valid rating: ");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);

            // Consume the invalid input to prevent an infinite loop
            scanner.nextLine();

            // Ask the user to enter a new rating
            System.out.print("Please enter a valid rating: ");
        }
    }
}

    
    public int getRating (){
        return rating;
    }
}

