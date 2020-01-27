package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        CookieBox thanksALot = new CookieBox();
        CookieBox girlScoutSmores = new CookieBox();
        CookieBox lemonades = new CookieBox();
        CookieBox shortbread = new CookieBox();
        CookieBox thinMints = new CookieBox();
        CookieBox peanutButterPatties = new CookieBox();
        CookieBox caramelDeLites = new CookieBox();
        CookieBox peanutButterSandwich = new CookieBox();
        thanksALot.name = "Thanks a lot";
        girlScoutSmores.name = "Girl Scout Smores";
        lemonades.name = "Lemonades";
        shortbread.name = "Shortbread";
        thinMints.name = "Thin Mints";
        peanutButterPatties.name = "Peanut Butter Patties";
        caramelDeLites.name = "Caramel deLites";
        peanutButterPatties.name = "Peanut Butter Sandwich";
        Object[] cookies = new Object[] { thanksALot.name, girlScoutSmores.name, lemonades.name, shortbread.name,
                thinMints.name, peanutButterPatties.name, caramelDeLites.name, peanutButterSandwich.name };
        for (int i = 0; i < cookies.length - 1; i++) {
            System.out.println(cookies[i]);
            System.out.println("-");
        }
        System.out.println("What would like? ");
        Scanner input = new Scanner(System.in);
        String choice = input.nextLine();
        for (int i = 0; i < cookies.length - 1; i++) {
            if (choice.equals(cookies[i])) {
                System.out.println("Amount: ");
                int amount = input.nextInt();
                input.close();
                System.out.println("--------------------");
                System.out.println("      Receipt ");
                System.out.println("--------------------");
                System.out.println("Cookie/s purchased: " + choice);
                System.out.println("Amount purchased: " + amount);
                System.out.println("Order amount: $" + amount * 5);
                System.out.println("--------------------");
            }
        }
    }
}