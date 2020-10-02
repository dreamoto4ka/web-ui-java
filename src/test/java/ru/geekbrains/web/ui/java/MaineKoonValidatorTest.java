package ru.geekbrains.web.ui.java;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.geekbrains.web.ui.java.model.Breed;
import ru.geekbrains.web.ui.java.model.Cat;
import ru.geekbrains.web.ui.java.validator.MaineKoonValidator;



class MaineKoonValidatorTest {

    @Test
    void positiveTryCertify() {
        Cat maine = new Cat();
        maine.setBreed(Breed.MAINE_KOON);

        MaineKoonValidator catValidator = new MaineKoonValidator();

        boolean actual = catValidator.tryCertify(maine);

        Assertions.assertTrue(actual);
    }


    @Test
    void negativeTryCertify() {
        Cat maine = new Cat();
        maine.setBreed(Breed.ORIENTAL);

        MaineKoonValidator catValidator = new MaineKoonValidator();

        boolean actual = catValidator.tryCertify(maine);

        Assertions.assertFalse(actual);
    }

    @Test
    void noBreedCertify() {
        Cat maine = new Cat();
        maine.setBreed(Breed.ORIENTAL);

        MaineKoonValidator catValidator = new MaineKoonValidator();

        boolean actual = catValidator.tryCertify(maine);

        Assertions.assertFalse(actual);
    }
}