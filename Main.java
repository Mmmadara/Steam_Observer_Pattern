package com.company;

public class Main {

    public static void main(String[] args) {
        Steam steam = new Steam();

        User Madara = new User("MadaraGod");
        steam.registerObserver(Madara);

        //Just names of a popular games
        steam.addDiscounts("Star Wars: Jedi Fallen Order - 66%");
        steam.addDiscounts("Metro 2033 - 25%");

        steam.unregisterObserver(Madara);

        User Naruto = new User("Naruto_Hokage");
        steam.registerObserver(Naruto);

        steam.addDiscounts("The Witcher 3: Wild Hunt - 50%");
        steam.removeDiscounts("Metro 2033 - 25%");
    }
}
