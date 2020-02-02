package com.kodilla.good.patterns.challenges;

public class MailService implements InformationService {

    @Override
    public void inform(User user) {
        System.out.println("Mail to: " + user.getName() + " " + user.getSurname() + "\n" + "Your order is registered.") ;
    }
}
