/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guidetour1;

import java.util.Scanner;

/**
 *
 * @author gabriel
 */
public class PolyvalentPeople extends Tourist implements BestGuide {

    Scanner input = new Scanner(System.in);

    @Override
    public void giveInformation(String information) {
        System.out.println(information
                + """
           
                           >> Don’t Purchase Products From Children ...
                           >> Do Due Diligence on Tours Involving Animals ...
                           >> Steer Clear of Child-led Entertainment ...
                           >> Don’t Wander Where You Shouldn’t ...
                           >> Research the Impact of Legal Drugs ...
                           >> Investigate Volunteer Opportunities ...
                           >> Be Cautious With Adult Pleasures ..
                           """);
        // a polyvalentPeople can now give Information
    }

    @Override
    public void guideVisit() {
        boolean validInput = false;
        try {
            do {
                System.out.println("""
                          
    Hello, we would like to know if you have been to this country before
                Enter "yes/y" if you have
                Enter " no/n" if this is your first time
                          """);

                String HaveBeenHere = (input.nextLine()).toLowerCase();
                if (HaveBeenHere.equals("yes") || (HaveBeenHere.equals("y"))) {
                    System.out.println();
                    System.out.println("""
                Tourist who are seen trustworthy have the chance of been selected as a guide in this countries.
                           """);
                    validInput = true;
                } else if (HaveBeenHere.equals("no") || (HaveBeenHere.equals("n"))) {
                    System.out.println();
                    System.out.println("""
                We would like to see you in this country soon. 
                           """);
                    validInput = true;
                } else {
                    System.out.println("Invalid input, Please enter 'yes/y' or 'no/n'.");
                }

            } while (!validInput);
            // a PolyvaentPeople can now guide a visit
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("It was nice interacting with you,Have a great time");
            System.out.println();
        }

    }
}
