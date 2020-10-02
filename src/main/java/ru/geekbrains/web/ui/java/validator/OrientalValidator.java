package ru.geekbrains.web.ui.java.validator;

import ru.geekbrains.web.ui.java.model.Cat;

public class OrientalValidator implements CatValidator{

    @Override
    public Boolean tryCertify(Cat cat) {
        return "Nya".equals(cat.getGreeting());
    }
}