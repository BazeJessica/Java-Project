/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guidetour1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author gabriel
 */
public class Agents extends Character {// inheritance 

    public Agents(String name) {
        super(name);
    }

    // let us know if the room is ready with conditions
    public void accomodation() throws IOException{
        System.out.println();
        System.out.println(" Hello, I am  " + name + " and I'm here to help find you an accomodation");
        System.out.println();
        Scanner scanner = new Scanner(System.in);// we use scanner

        System.out.println("""
                           Enter the type of accomodation you would like to use 
                           Hotel or Appartment.
                           
                           Hotel :: 1
                           Appartment :: 2
                                                      """);

        int choice;
        int hotelOption=0;
        int AppartmentOption=0;

        while (true) {
            try {

                choice = scanner.nextInt();
                scanner.nextLine(); // consume the newline character
                if (choice == 1 || choice == 2) {
                    break;
                } else {
                    System.out.println("Invalid choice,Please enter either 1 for Hotel or 2 for Apartment.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.nextLine();
            }
        }

        if (choice == 1) {
            Hotel hotel1 = new Hotel("Marriot International", true);
            Hotel hotel2 = new Hotel("Jin Jan", true);
            Hotel hotel3 = new Hotel("Hilton", false);
            Hotel hotel4 = new Hotel("Accor", true);

            // int hotelOption;
            while (true) {
                System.out.println("""
                                    Choose the hotel of your choice
                                    Marriot International :: 1
                                    Jin Jan Hotel :: 2
                                    Hilton Hotel :: 3
                                    Accor Hotel :: 4
                                    
                           """);

                hotelOption = scanner.nextInt();

                if (hotelOption >= 1 && hotelOption <= 4) {
                    break;
                } else {
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                }
            }

            switch (hotelOption) {
                case 1:
                    System.out.println(hotel1.toString());
                    break;
                case 2:
                    System.out.println(hotel2.toString());
                    break;
                case 3:
                    System.out.println(hotel3.toString());
                    System.out.println("");
                    System.out.println("""
                                    Choose the hotel of your choice
                                    Marriot International :: 1
                                    Jin Jan Hotel :: 2
                                    Accor Hotel :: 3
                                    
                           """);

                    int hotelChoice = scanner.nextInt();
                    switch (hotelChoice) {
                        case 1:
                            System.out.println(hotel1.toString());
                            break;
                        case 2:
                            System.out.println(hotel2.toString());
                            break;
                        case 3:
                            System.out.println(hotel4.toString());
                            break;
                        default:
                            System.out.println("Oops you chose an unknown Hotel");
                    }
                case 4:
                    System.out.println(hotel2.toString());
                    break;
            }

        } else if (choice == 2) {
            Appartment appartment1 = new Appartment("Sunset", true, true);
            Appartment appartment2 = new Appartment("Sunrise", false);
            Appartment appartment3 = new Appartment("Wave", true, true);
            Appartment appartment4 = new Appartment("Jungle", true, true);
            //int AppartmentOption;
            while (true) {
                System.out.println("""
                                    Choose the hotel of your choice
                                    Sunset Appartment   :: 1
                                    Sunrise Appartment  :: 2
                                    Wave Appartment     :: 3
                                    Jungle Appartment   :: 4
                                    
                           """);

                AppartmentOption = scanner.nextInt();
                if (AppartmentOption >= 1 && AppartmentOption <= 4) {
                    break;
                } else {
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                }
            }

            switch (AppartmentOption) {
                case 1:
                    System.out.println(appartment1.toString());
                    break;
                case 2:
                    System.out.println(appartment2.toString());
                    System.out.println("");
                    System.out.println("""
                                    Select among these appartments
                                    Sunset :: 1
                                    Wave :: 2
                                    Jungle :: 3
                                    
                           """);

                    int AppartmentChoice = scanner.nextInt();
                    switch (AppartmentChoice) {
                        case 1:
                            System.out.println(appartment1.toString());
                            break;
                        case 2:
                            System.out.println(appartment2.toString());
                            break;
                        case 3:
                            System.out.println(appartment3.toString());
                            break;
                        default:
                            System.out.println("Oops you chose an unknown Appartment");
                            break;
                    }

                case 3:
                    System.out.println(appartment3.toString());
                    break;
                case 4:
                    System.out.println(appartment4.toString());
                    break;
                default:
                    System.out.println("Oops you chose an unknown Appartment");
            }
        }
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("./TouristAccommodation.txt"))) {
            writer.write("Tourist Information:\n");
            writer.write("Choice: " + choice + "\n");
            writer.write("HotelOpttion: " + hotelOption + "\n");
            writer.write("AppartmentOption: " + AppartmentOption + "\n");
            writer.write("Age: " + age + "\n");
            System.out.println("Tourist information written to here");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
