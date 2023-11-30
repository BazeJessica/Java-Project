/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guidetour1;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
class CountryCity {

    Scanner input = new Scanner(System.in);
    public static City cancun, mexicoCity, tulum;
    public static TouristSite cancunSite, tulumSite2, tulumSite1, cancunSite1, cancunSite2, mexicSite, mexicSite1, mexicSite2, tulumSite;
    public static TouristActivity activity1, activity2, activity3, activity4, activity5;

    public void MexicoInfo() {

        // Create city objects
        cancun = new City("Cancun", "A popular tourist destination in Quintana Roo state.", "Quintana Roo");
        mexicoCity = new City("Mexico City", "The capital city of Mexico.", "Federal District");
        tulum = new City("Tulum", "Known for its Mayan ruins and beautiful beaches.", "Quintana Roo");

        // Create tourist site objects
        cancunSite = new TouristSite("Chichen Itza", "An ancient Mayan pyramid.");
        cancunSite1 = new TouristSite("Xcaret Park", "Eco-archaeological park with water activities.");
        cancunSite2 = new TouristSite("Isla Mujeres", "Island with beautiful beaches and marine life.");

        mexicSite = new TouristSite("National Palace", "A historic government building.");
        mexicSite1 = new TouristSite("Chapultepec Castle", "A historic castle and park.");
        mexicSite2 = new TouristSite("Frida Kahlo Museum", "Museum dedicated to the life and art of Frida Kahlo.");

        tulumSite = new TouristSite("Tulum Ruins", "Mayan ruins with ocean views.");
        tulumSite1 = new TouristSite("Tulum Beach", "Relax on the beautiful Tulum beach.");
        tulumSite2 = new TouristSite("Cenotes", "Swim in the natural sinkholes of the Yucatan Peninsula.");

        // Create activity objects
        activity1 = new TouristActivity("Snorkeling", "Explore the underwater world.");
        activity2 = new TouristActivity("Museum Visit", "Learn about the country's history and culture.");
        activity3 = new TouristActivity("Bike Tour", "Explore the city on a guided bike tour.");
        activity4 = new TouristActivity("Market Shopping", "Visit local markets for unique souvenirs.");
        activity5 = new TouristActivity("Cave Diving", "Explore underwater caves in the area.");

    }

    public void displayMexico() {
        boolean validChoice = false;
        MexicoInfo();
        do {
            System.out.println("""
                                    Welcome! Here is a list of cities you choose from
                                        Cancun           :: 1
                                        MexicoCity       :: 2
                                        Tulum            :: 3
                                    Enter the city of your choice
                                    
                                  """);
            try {
                int choice = input.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("You chose Cancun.Great choice");

                        cancun.displayInfo();
                        cancunSite1.displayInfo();
                        cancunSite2.displayInfo();
                        cancunSite.displayInfo();
                        activity1.performActivity();
                        activity3.performActivity();
                        activity2.performActivity();
                        validChoice = true;

                        break;
                    case 2:
                        System.out.println("You chose Mexico City.Attractive city and environment");

                        mexicoCity.displayInfo();
                        mexicSite1.displayInfo();
                        mexicSite2.displayInfo();
                        mexicSite.displayInfo();
                        activity5.performActivity();
                        activity3.performActivity();
                        activity2.performActivity();
                        validChoice = true;

                        break;
                    case 3:
                        System.out.println("You chose Tulum.An amazing site to behold");

                        tulum.displayInfo();
                        tulumSite1.displayInfo();
                        tulumSite2.displayInfo();
                        tulumSite.displayInfo();
                        activity1.performActivity();
                        activity4.performActivity();
                        activity5.performActivity();
                        validChoice = true;

                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a valid number (1, 2, or 3).");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        } while (!validChoice);
    }
}

    class Spain {

        Scanner input = new Scanner(System.in);
        public static City madrid, barcelona, malaga;
        public static TouristSite madridSite1, madridSite2, barcelonaSite1, barcelonaSite2, malagaSite;
        public static TouristActivity madridActivity1, madridActivity2, barcelActivity1, barcelActivity2, malagaActivity;

        public void SpainInfo() {

            // Create city objects
            madrid = new City("Madrid", "The capital city of Spain.", "Community of Madrid");
            barcelona = new City("Barcelona", "A vibrant city in Catalonia known for its architecture and art.", "Catalonia");
            malaga = new City("Malaga", "A coastal city in Andalusia with beautiful beaches.", "Andalusia");

// Create tourist site objects
            madridSite1 = new TouristSite("Royal Palace of Madrid", "A historic palace with stunning architecture.");
            madridSite2 = new TouristSite("Prado Museum", "One of the finest art museums in the world.");
            barcelonaSite1 = new TouristSite("Sagrada Familia", "An iconic basilica designed by Antoni Gaudí.");
            barcelonaSite2 = new TouristSite("Park Güell", "A colorful public park with unique architectural elements.");
            malagaSite = new TouristSite("Alcazaba of Malaga", "A Moorish fortress with beautiful gardens.");

// Create activity objects
            madridActivity1 = new TouristActivity("Visit Retiro Park", "Relax in a beautiful city park.");
            madridActivity2 = new TouristActivity("Tapas Tasting", "Experience the local food culture.");
            barcelActivity1 = new TouristActivity("Explore Gothic Quarter", "Wander the historic streets.");
            barcelActivity2 = new TouristActivity("Beach Day", "Enjoy the Mediterranean coastline.");
            malagaActivity = new TouristActivity("Picasso Museum", "View art by the famous painter Pablo Picasso.");

// Display information about locations and activities
        }

        public void displaySpain() {
            SpainInfo();
            boolean validChoice = false;

            do {
                System.out.println("""
                            Welcome! Here is a list of cities you choose from
                                Madrid      :: 1
                                Barcelona   :: 2
                                Malaga      :: 3
                            Enter the city of your choice
                          """);

                try {
                    int choice = input.nextInt();

                    switch (choice) {
                        case 1:
                            System.out.println("Madrid!, Alluring city in Spain");
                            madrid.displayInfo();
                            madridSite1.displayInfo();
                            madridActivity1.performActivity();
                            madridSite2.displayInfo();
                            madridActivity2.performActivity();
                            validChoice = true;
                            break;
                        case 2:
                            System.out.println("Barcelona!, Magnificent city in Spain");
                            barcelona.displayInfo();
                            barcelonaSite1.displayInfo();
                            barcelActivity1.performActivity();
                            barcelonaSite2.displayInfo();
                            barcelActivity2.performActivity();
                            validChoice = true;
                            break;
                        case 3:
                            System.out.println("Malaga!, Stunning locations in Spain");
                            malaga.displayInfo();
                            malagaSite.displayInfo();
                            malagaActivity.performActivity();
                            validChoice = true;
                            break;
                        default:
                            System.out.println("Oops, you entered an invalid input. Please try again.");
                    }
                } catch (java.util.InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a valid integer.");
                    input.nextLine(); // Consume the invalid input to avoid an infinite loop
                }
            } while (!validChoice);
        }

    }

    class Australia {

        Scanner input = new Scanner(System.in);
        public static City sydney, melbourne, canberra;
        public static TouristSite sydneySite1, sydneySite2, melbourneSite1, melbourneSite2, canberraSite;
        public static TouristActivity sydneyActivity1, sydneyActivity2, melbourneActivity1, melbourneActivity2, canberraActivity;

        public void AustraliaInfo() {
            // Create city objects
            sydney = new City("Sydney", "The largest city in Australia with iconic landmarks.", "New South Wales");
            melbourne = new City("Melbourne", "A cultural and artistic hub of Australia.", "Victoria");
            canberra = new City("Canberra", "The capital city of Australia with political significance.", "Australian Capital Territory");

// Create tourist site objects
            sydneySite1 = new TouristSite("Sydney Opera House", "An iconic architectural masterpiece.");
            sydneySite2 = new TouristSite("Bondi Beach", "A popular coastal destination for beachgoers.");
            melbourneSite1 = new TouristSite("Federation Square", "A cultural precinct in the heart of Melbourne.");
            melbourneSite2 = new TouristSite("Royal Botanic Gardens", "Beautiful gardens in Melbourne's city center.");
            canberraSite = new TouristSite("Parliament House", "The seat of the Australian government.");

// Create activity objects
            sydneyActivity1 = new TouristActivity("Harbor Bridge Climb", "A thrilling experience with panoramic views.");
            sydneyActivity2 = new TouristActivity("Visit Taronga Zoo", "See a wide range of Australian wildlife.");
            melbourneActivity1 = new TouristActivity("Street Art Tour", "Explore Melbourne's vibrant street art scene.");
            melbourneActivity2 = new TouristActivity("Yarra Valley Wine Tasting", "Enjoy local wines in a scenic setting.");
            canberraActivity = new TouristActivity("National Gallery of Australia", "View art and exhibitions from around the world.");

        }

        public void displayAustra() {
            AustraliaInfo();
            boolean validChoice = false;

            do {
                System.out.println("""
                            Welcome! Here is a list of cities you choose from
                                Sydney       :: 1
                                Canberra     :: 2
                                Melbourne    :: 3
                            Enter the city of your choice
                            """);

                try {
                    int choice = input.nextInt();

                    switch (choice) {
                        case 1:
                            System.out.println("Sydney!, one of the famous cities in Australia");
                            sydney.displayInfo();
                            sydneySite1.displayInfo();
                            sydneyActivity1.performActivity();
                            sydneySite2.displayInfo();
                            sydneyActivity2.performActivity();
                            validChoice = true;
                            break;
                        case 2:
                            System.out.println("Canberra!, one of the famous cities in Australia");
                            canberra.displayInfo();
                            canberraSite.displayInfo();
                            canberraActivity.performActivity();
                            validChoice = true;
                            break;
                        case 3:
                            System.out.println("Melbourne!, one of the famous cities in Australia");
                            melbourne.displayInfo();
                            melbourneSite1.displayInfo();
                            melbourneActivity1.performActivity();
                            melbourneSite2.displayInfo();
                            melbourneActivity2.performActivity();
                            validChoice = true;
                            break;
                        default:
                            System.out.println("Oops, you entered an invalid input. Please try again.");
                    }
                } catch (java.util.InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a valid integer.");
                    input.nextLine(); // Consume the invalid input to avoid an infinite loop
                }
            } while (!validChoice);
        }

    }

    class Africa {

        Scanner input = new Scanner(System.in);
        public static City capeTown, johannesburg, pretoria;
        public static TouristSite capeSite, capeSite1, capeSite2, johannSite, johannSite1, johannSite2, pretoSite, pretoSite1, pretoSite2;
        public static TouristActivity activity1, activity2, activity3, activity4, activity5;
        Australia austra = new Australia();

        public void AfricaInfo() {
            capeTown = new City("Cape Town", "A coastal city in South Africa with stunning landscapes.", "Western Cape");
            johannesburg = new City("Johannesburg", "The largest city in South Africa and a major economic hub.", "Gauteng");
            pretoria = new City("Pretoria", "The administrative capital of South Africa.", "Gauteng");

            capeSite = new TouristSite("Table Mountain", "A famous flat-topped mountain with panoramic views.");
            capeSite2 = new TouristSite("Robben Island", "Historic island with a prison museum.");
            capeSite1 = new TouristSite("V&A Waterfront", "Shopping and entertainment district by the harbor.");

            johannSite = new TouristSite("Apartheid Museum", "A museum dedicated to South Africa's history of apartheid.");
            johannSite2 = new TouristSite("Lion Park", "Get close to lions and other wildlife.");
            johannSite1 = new TouristSite("Constitution Hill", "Historical site and home to the Constitutional Court.");

            pretoSite = new TouristSite("Union Buildings", "The seat of the South African government.");
            pretoSite2 = new TouristSite("Voortrekker Monument", "Monument to South Africa's pioneer history.");
            pretoSite1 = new TouristSite("Freedom Park", "Memorial to South Africa's freedom and democracy.");

            activity1 = new TouristActivity("Safari", "Experience the wildlife of South Africa.");
            activity2 = new TouristActivity("Art Gallery Visit", "Explore the vibrant South African art scene.");
            activity3 = new TouristActivity("Wine Tasting", "Visit local wineries and taste South African wines.");
            activity4 = new TouristActivity("Hiking", "Explore the scenic trails around Cape Town.");
            activity5 = new TouristActivity("Melrose House", "Historic Victorian mansion and museum.");
        }// Create additional tourist sites and activities for Cape Town

// Create additional tourist sites and activities for Johannesburg
// Create additional tourist sites and activities for Pretoria
        public void displayAfrica() {
            AfricaInfo();
            boolean validChoice = false;

            do {
                System.out.println("""
                            Welcome! Here is a list of cities you choose from
                                CapeTown        :: 1
                                Johannesburg    :: 2
                                Pretoria        :: 3
                            Enter the city of your choice
                          """);
                try {
                    int choice = input.nextInt();

                    switch (choice) {
                        case 1:
                            System.out.println("Cape Town!, Divine city in South Africa");
                            capeTown.displayInfo();
                            capeSite.displayInfo();
                            capeSite1.displayInfo();
                            capeSite2.displayInfo();
                            activity5.performActivity();
                            activity3.performActivity();
                            activity1.performActivity();
                            validChoice = true;
                            break;
                        case 2:
                            System.out.println("Johannesburg!, Magnificent city in South Africa");
                            johannesburg.displayInfo();
                            johannSite.displayInfo();
                            johannSite1.displayInfo();
                            johannSite2.displayInfo();
                            activity2.performActivity();
                            activity4.performActivity();
                            activity3.performActivity();
                            validChoice = true;
                            break;
                        case 3:
                            System.out.println("Pretoria!, one of the famous cities in South Africa");
                            pretoria.displayInfo();
                            pretoSite.displayInfo();
                            pretoSite1.displayInfo();
                            pretoSite2.displayInfo();
                            activity5.performActivity();
                            activity4.performActivity();
                            activity1.performActivity();
                            validChoice = true;
                            break;
                        default:
                            System.out.println("Oops, you entered an invalid input. Please try again.");
                    }
                } catch (java.util.InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a valid number.");
                    input.nextLine(); // Consume the invalid input to avoid an infinite loop
                }
            } while (!validChoice);
        }

    }

    class Thailand {

        Scanner input = new Scanner(System.in);
        public static City bangkok, phuket, krabi;
        public static TouristSite bangkokSite, bangkokSite1, bangkokSite2, phukSite, phukSite1, phukSite2, krabiSite, krabiSite1, krabiSite2;
        public static TouristActivity Activity, Activity1, Activity2, Activity3, Activity4, Activity5;
        Australia austra = new Australia();

        public void ThailandInfo() {
            // Create city objects
            bangkok = new City("Bangkok", "The capital city of Thailand known for its vibrant street life and ornate temples.", "Bangkok");
            phuket = new City("Phuket", "A popular island destination in Thailand with beautiful beaches and nightlife.", "Phuket");
            krabi = new City("Krabi", "A province in southern Thailand known for its stunning limestone cliffs and clear waters.", "Krabi");

// Create tourist site objects
            bangkokSite = new TouristSite("Grand Palace", "A historic and ornate royal palace in Bangkok.");
            bangkokSite2 = new TouristSite("Wat Pho", "A famous temple known for the Reclining Buddha statue.");
            bangkokSite1 = new TouristSite("Chatuchak Weekend Market", "A bustling market for shopping and street food.");

            phukSite = new TouristSite("Patong Beach", "A bustling beach town on the island of Phuket.");
            phukSite2 = new TouristSite("Big Buddha Phuket", "Giant Buddha statue with panoramic views.");
            phukSite1 = new TouristSite("Phang Nga Bay", "Scenic bay with limestone cliffs and caves.");

            krabiSite = new TouristSite("Railay Beach", "A stunning beach surrounded by limestone cliffs in Krabi.");
            krabiSite2 = new TouristSite("Thung Teao Forest Natural Park", "Emerald pool in a lush forest.");
            krabiSite1 = new TouristSite("Ao Nang Beach", "Popular beach for swimming and water sports.");

// Create activity objects
            Activity = new TouristActivity("Tuk-Tuk Ride", "Experience the fun and chaos of Bangkok's iconic Tuk-Tuks.");
            Activity2 = new TouristActivity("Chao Phraya River Cruise", "Take a boat ride along the Chao Phraya River.");
            Activity3 = new TouristActivity("Jim Thompson House", "Visit the historic house and museum.");
            Activity4 = new TouristActivity("Island Hopping", "Explore the nearby islands on a boat tour from Phuket.");
            Activity5 = new TouristActivity("Scuba Diving", "Explore underwater life with scuba diving in Phuket.");

        }

        public void displayThail() {
            ThailandInfo();
            boolean validChoice = false;

            do {
                System.out.println("""
                            Welcome! Here is a list of cities you choose from
                                Phuket     :: 1
                                Krabi      :: 2
                                Bangkok    :: 3
                                Enter the city of your choice
                            """);

                try {
                    int choice = input.nextInt();

                    switch (choice) {
                        case 1:
                            System.out.println("Phuket!, one of the famous cities in Thailand");
                            phuket.displayInfo();
                            phukSite.displayInfo();
                            phukSite1.displayInfo();
                            phukSite2.displayInfo();
                            Activity.performActivity();
                            Activity1.performActivity();
                            Activity2.performActivity();
                            validChoice = true;
                            break;
                        case 2:
                            System.out.println("Krabi!, one of the famous cities in Thailand");
                            krabi.displayInfo();
                            krabiSite.displayInfo();
                            krabiSite1.displayInfo();
                            krabiSite2.displayInfo();
                            Activity5.performActivity();
                            Activity3.performActivity();
                            Activity4.performActivity();
                            validChoice = true;
                            break;
                        case 3:
                            System.out.println("Bangkok!, one of the famous cities in Thailand");
                            bangkok.displayInfo();
                            bangkokSite2.displayInfo();
                            bangkokSite1.displayInfo();
                            bangkokSite.displayInfo();
                            Activity2.performActivity();
                            Activity5.performActivity();
                            Activity.performActivity();
                            validChoice = true;
                            break;
                        default:
                            System.out.println("Oops you entered an invalid input. Please try again.");
                    }
                } catch (java.util.InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a valid number.");
                    input.nextLine(); // Consume the invalid input to avoid an infinite loop
                }
            } while (!validChoice);

        }
    }

