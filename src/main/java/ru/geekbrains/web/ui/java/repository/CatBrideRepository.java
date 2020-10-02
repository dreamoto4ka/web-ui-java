package ru.geekbrains.web.ui.java.repository;

import ru.geekbrains.web.ui.java.model.Cat;

import java.util.HashSet;
import java.util.Set;

public class CatBrideRepository {

    private Set<Cat> brides;

    public CatBrideRepository(Set<Cat> brides) {
        this.brides = brides;
    }

    public Cat getBride(){
        return brides.iterator().next();
    }


}