package Zadanie03a.welcomeMessages;

public class AdminWMBuilder extends WelcomeMessageBuilder
{
    @Override
    public void printWM()
    {
        this.welcomeMessage = "Witaj adminie";
    }
}
