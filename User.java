package com.company;

import java.util.List;

public class User implements Observer {

    private String login;

    public User(String login){
        this.login = login;
    }

    @Override
    public void update(List<String> gamesWithDiscount) {
        System.out.println("Dear " + login + "\n there are some discounts for our games!:\n" + gamesWithDiscount + "\n");
    }
}
