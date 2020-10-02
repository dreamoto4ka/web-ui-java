package ru.geekbrains.web.ui.java.validator;

import ru.geekbrains.web.ui.java.model.Cat;

public class MaineKoonValidator implements CatValidator {

    @Override
    public Boolean tryCertify(Cat cat) {
        if(cat.getBreed() == null){
            return true;
        }

        switch (cat.getBreed()){
            case MAINE_KOON:
                return true;
            case ORIENTAL:
                return false;
        }
        return false;
    }
}