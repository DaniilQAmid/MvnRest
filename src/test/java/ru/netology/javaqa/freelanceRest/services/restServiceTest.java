package ru.netology.javaqa.freelanceRest.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class restServiceTest {

    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/rest.csv")
    public void testRestBigSalary(int expected, int income, int expenses, int threshold) {
        restService service = new restService();

//        int expected = 2;
        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }

//    @Test
//    public void testRestSmallSalary() {
//        restService service = new restService();
//
//        int expected = 3;
//        int actual = service.calculate(10_000, 3_000, 20_000);
//
//        Assertions.assertEquals(expected, actual);
//    }
}

