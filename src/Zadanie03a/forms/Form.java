package Zadanie03a.forms;

import Zadanie03a.buttons.Button;

import java.util.List;

public class Form
{
    private List<Button> buttons;
    private String welcomeMessage;

    public Form(List<Button> buttons, String welcomeMessage)
    {
        this.buttons = buttons;
        this.welcomeMessage = welcomeMessage;
    }

    public List<Button> getButtons()
    {
        return buttons;
    }

    public String getWelcomeMessage()
    {
        return welcomeMessage;
    }

    @Override
    public String toString() {
        return "Form{" +
                "buttons=" + buttons +
                ", welcomeMessage='" + welcomeMessage + '\'' +
                '}';
    }
}
