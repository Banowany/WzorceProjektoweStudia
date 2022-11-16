package Zadanie03a;

import Zadanie03a.buttons.StudentsButtonsBuilder;
import Zadanie03a.forms.Form;
import Zadanie03a.forms.FormBuilder;
import Zadanie03a.welcomeMessages.StudentsWMBuilder;

public class BuilderExample
{
    public static void main(String[] args)
    {
        FormBuilder fBuilder = new FormBuilder();
        StudentsButtonsBuilder bBuilder = new StudentsButtonsBuilder();
        StudentsWMBuilder wmBuilder = new StudentsWMBuilder();
        fBuilder.setButtonsBuilder(bBuilder);
        fBuilder.setWMBuilder(wmBuilder);
        fBuilder.constructForm();
        Form form = fBuilder.getForm();

        System.out.println(form);
    }
}