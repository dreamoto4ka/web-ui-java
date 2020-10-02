package ru.geekbrains.web.ui.java.service;

import ru.geekbrains.web.ui.java.model.Cat;
import ru.geekbrains.web.ui.java.validator.MaineKoonValidator;

import java.util.Optional;

public class Family {

    private ExhibitionService exhibitionService;
    private Cat mara;

    public void goToSpringExhibition(){
        Optional<Cat> bride = exhibitionService.findBride(mara);
        if(bride.isPresent()){
            Cat cat = bride.get();
            cat.sayHello();
            //УРА УРА УРА
        } else{
            //одиночество
        }

        MaineKoonValidator catValidator = new MaineKoonValidator();
        Boolean b = catValidator.tryCertify(mara);


    }


}