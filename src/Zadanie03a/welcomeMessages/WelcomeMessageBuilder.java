package Zadanie03a.welcomeMessages;

public abstract class WelcomeMessageBuilder
{
    protected String welcomeMessage;

    public WelcomeMessageBuilder()
    {
        this.welcomeMessage = "";
    }

    public abstract void printWM();

    public String getWelcomeMessage()
    {
        return welcomeMessage;
    }
}
