/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guidetour1;

import static guidetour1.ProjectApplication.polyvalent;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Countries {

    CountryCity mexico = new CountryCity();
    Spain spain = new Spain();
    Africa africa = new Africa();
    Australia australia = new Australia();
    Thailand thailand = new Thailand();

    Scanner scan = new Scanner(System.in);

    public void generalIntro() {
        System.out.println("""
            Hi!!,               
            Welcome to GB's TourGuidanceHub, a place where you are given the opportunity to 
            explore some countries and their cities and have an insight about some tour places and 
            activities that can be undertaken for relaxation during family vacation,break
            trips or on leave.
                           Have a lovely time exploring!!   
                           
                    We would like to get few details from you              
                           """);

    }

    public void countrySelection() {
        Tourist tourist1 = new Tourist();
        Guide guide1 = new Guide("Jessica");
        Guide guide2 = new Guide("Gabriel");
        Guide guide3 = new Guide("Sara");
        Guide guide4 = new Guide("Jonh");
        Guide guide5 = new Guide("Tao");

        Agents agent1 = new Agents("Hugo");
        Agents agent2 = new Agents("Zoé");
        Agents agent3 = new Agents("Damian");
        Agents agent4 = new Agents("Illiana");
        Agents agent5 = new Agents("Claudia");

        boolean validCountry = false;

        System.out.println("""
        "Hello!! Here is a list of countries you can choose from"
        Australia         
        South Africa     
        Mexico           
        Spain            
        Thailand         

Would you want to proceed with the exploring? (yes/y/no/n) -->>
                                  """);

        String answer;

        while (true) {
            try {
                answer = scan.nextLine().toLowerCase();

                if (answer.equals("yes") || answer.equals("y")) {
                    // User wants to proceed
                    break;
                } else if (answer.equals("no") || answer.equals("n")) {
                    // User doesn't want to proceed
                    System.exit(0);
                } else {
                    System.out.println("Invalid choice. Please enter either 'yes' or 'no'.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid response.");
                scan.nextLine(); // consume the invalid input
            }
        }

        if (answer.toUpperCase().equals("YES") || answer.toUpperCase().equals("Y")) {

            do {
                System.out.println("Great, Enter the country of your choice -->>");
                try {
                    String choice = scan.nextLine();
                    switch (choice) {
                        case "Australia":
                            population();
                            season();
                            guide1.giveOrders();
                            australia.displayAustra();
                            agent1.accomodation();
                            validCountry = true;

                            break;
                        case "South Africa":
                            population();
                            season();
                            guide2.giveOrders();
                            africa.displayAfrica();
                            agent2.accomodation();
                            validCountry = true;

                            break;
                        case "Mexico":
                            population();
                            season();
                            guide3.giveOrders();
                            mexico.displayMexico();
                            agent3.accomodation();
                            validCountry = true;

                            break;
                        case "Spain":
                            population();
                            season();
                            guide4.giveOrders();
                            spain.displaySpain();
                            agent4.accomodation();
                            validCountry = true;

                            break;
                        case "Thailand":
                            population();
                            season();
                            guide5.giveOrders();
                            thailand.displayThail();
                            agent5.accomodation();
                            validCountry = true;

                            break;
                        default:

                            System.out.println("Oops, you chose an unknown Country");
                            break;
                    }
                } catch (Exception e) {
                    System.err.println("An error occurred: " + e.getMessage());

                }
            } while (!validCountry);

            polyvalent.guideVisit();  // Access polyvalent through the instance of Countries
            polyvalent.giveInformation("Precautions to take into account for a successful tour");

            tourist1.giveRating();
            int rating = tourist1.getRating();
            System.out.println("Tourist's rating: " + rating);

        } else {
            System.exit(0);

        }
    }

    public void population() {
        // Define the range
        long min = 8000000L;
        long max = 20000000L;

        // Create an instance of the Random class
        Random random = new Random();

        // Generate a random number within the specified range
        long randomNumber = random.nextLong() % (max - min + 1) + max;

        // Ensure the generated number is positive (greater than or equal to min)
        if (randomNumber < min) {
            randomNumber += min;
        }

        // Output the random number
        System.out.println("Total occupants in this country is: " + randomNumber + "people ");
        System.out.println(" ");
    }

    public void season() {
        // Create an array of seasons
        String[] seasons = {"Spring", "Summer", "Autumn", "Winter"};

        // Create an instance of the Random class
        Random random = new Random();

        // Generate a random index to select a season
        int randomIndex = random.nextInt(seasons.length);

        // Get the random season based on the random index
        String randomSeason = seasons[randomIndex];

        // Print the random season
        System.out.println("We are currently in the " + randomSeason + " season");
        System.out.println(" ");

    }
}
