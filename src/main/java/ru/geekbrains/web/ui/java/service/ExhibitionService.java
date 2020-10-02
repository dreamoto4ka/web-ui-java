package ru.geekbrains.web.ui.java.service;

import ru.geekbrains.web.ui.java.model.Cat;
import ru.geekbrains.web.ui.java.repository.CatBrideRepository;
import ru.geekbrains.web.ui.java.validator.CatValidator;
import ru.geekbrains.web.ui.java.validator.MaineKoonValidator;

import java.util.Optional;

public class ExhibitionService {

    private CatBrideRepository catBrideRepository;
    private CatValidator validator;

    public ExhibitionService(CatBrideRepository catBrideRepository, CatValidator validator) {
        this.catBrideRepository = catBrideRepository;
        this.validator = validator;
    }

    public Optional<Cat> findBride(Cat cat){
        if (cat.isCertified()){
            return Optional.of(getBride());
        } else {
            boolean isCertified = validator.tryCertify(cat);
            if(isCertified){
                return Optional.of(getBride());
            }
        }

        return Optional.empty();
    }

    private Cat getBride() {
        return catBrideRepository.getBride();
    }


}