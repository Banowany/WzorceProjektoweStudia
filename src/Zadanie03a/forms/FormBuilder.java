package Zadanie03a.forms;

import Zadanie03a.buttons.ButtonsBuilder;
import Zadanie03a.welcomeMessages.WelcomeMessageBuilder;

public class FormBuilder
{
    private ButtonsBuilder buttonsBuilder;
    private WelcomeMessageBuilder welcomeMessageBuilder;

    public void reset()
    {
        buttonsBuilder = null;
        welcomeMessageBuilder = null;
    }

    public FormBuilder()
    {
        reset();
    }

    public void setButtonsBuilder(ButtonsBuilder buttonsBuilder)
    {
        this.buttonsBuilder = buttonsBuilder;
    }

    public void setWMBuilder(WelcomeMessageBuilder welcomeMessageBuilder)
    {
        this.welcomeMessageBuilder = welcomeMessageBuilder;
    }

    public void constructForm()
    {
        buttonsBuilder.addButtons();
        welcomeMessageBuilder.printWM();
    }

    public Form getForm()
    {
        return new Form(buttonsBuilder.getButtons(), welcomeMessageBuilder.getWelcomeMessage());
    }
}
