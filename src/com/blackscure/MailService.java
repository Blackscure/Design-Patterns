package com.blackscure;

public class MailService {
    public void sendEmail() {
        connect();
        authenticate();
        //send email
        disconnect();
        
    }
    private void connect() {
        System.out.println("Connect");
    }

    private void disconnect(){
        System.out.println("Diconnect");
    }

    private void authenticate(){
        System.out.println("Authenticate");
    }
}
