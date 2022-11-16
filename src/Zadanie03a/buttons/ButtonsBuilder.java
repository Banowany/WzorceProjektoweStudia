package Zadanie03a.buttons;

import java.util.ArrayList;
import java.util.List;

public abstract class ButtonsBuilder
{
    protected List<Button> buttons;

    public ButtonsBuilder()
    {
        reset();
    }

    public void reset()
    {
        buttons = new ArrayList<>();
    }

    public abstract void addButtons();

    public List<Button> getButtons()
    {
        return buttons;
    }
}
