package ru.netology.javaqa.freelanceRest.services;

public class rest {
    public static void main(String[] args){
        restService service = new restService();
        System.out.println("Количество месяцев отдыха в следующем году: " + service.calculate(10_000, 3_000, 20_000));
    }
}
