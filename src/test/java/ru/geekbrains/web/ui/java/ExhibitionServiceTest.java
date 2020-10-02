package ru.geekbrains.web.ui.java;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.geekbrains.web.ui.java.model.Breed;
import ru.geekbrains.web.ui.java.model.Cat;
import ru.geekbrains.web.ui.java.repository.CatBrideRepository;
import ru.geekbrains.web.ui.java.service.ExhibitionService;
import ru.geekbrains.web.ui.java.validator.MaineKoonValidator;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class ExhibitionServiceTest {

    @Test
    void findBride() {
        ExhibitionService exhibitionService = prepareExhibition();
        Cat mara = new Cat();
        mara.setBreed(Breed.MAINE_KOON);

        Optional<Cat> bride = exhibitionService.findBride(mara);

        Assertions.assertTrue(bride.isPresent());
        assertEquals(Breed.MAINE_KOON, bride.get().getBreed());

    }

    private ExhibitionService prepareExhibition() {
        MaineKoonValidator catValidator = new MaineKoonValidator();
        CatBrideRepository repository = getCatBrideRepository();
        return new ExhibitionService(repository, catValidator);
    }

    private CatBrideRepository getCatBrideRepository() {
        Cat luchik = new Cat();
        luchik.setBreed(Breed.MAINE_KOON);

        Set<Cat> brides = new HashSet<>();
        brides.add(luchik);
        return new CatBrideRepository(brides);
    }
}