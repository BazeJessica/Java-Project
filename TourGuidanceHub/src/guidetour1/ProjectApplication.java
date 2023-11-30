/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guidetour1;

/**
 *
 * @author DELLy
 */
public class ProjectApplication {
   static PolyvalentPeople polyvalent = new PolyvalentPeople();
    // ... rest of the code

    public static void main(String[] args) {
        Countries place = new Countries();
        place.generalIntro();
     
        Tourist tourist1 = new Tourist();
        tourist1.fillInformation();
        int daysToStay = tourist1.howManyDaysToStay();
        place.countrySelection();

    }
}
