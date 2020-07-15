package com.blackscure;

public class Main {
    public static void main(String[] args) {
        TaxCalculator calculator = getCalculator();
        calculator.calculateTax();

        var account = new Account();
        account.deposit(10);
        account.withdraw(5);
        System.out.println(account.getBalance());

        //mail
        //var mailService = new MailService();
        //mailService.

        //Textbox
        var textBox = new TextBox();
        textBox.enable();

        //Uicontrol
        drawUiControl(new TextBox());

    }
    public static TaxCalculator getCalculator(){
        return new TaxCalculator2019();
    }

    public static void drawUiControl(UiControl control) {
        control.draw();
    }
}


