package ru.netology.javaqa.freelanceRest.services;

public class RestService {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету
        for (int i = 0; i < 12; i++) {
            if (money >= threshold) { // можем ли отдыхать?
                count++; // увеличиваем счётчик месяцев отдых
                money = money - expenses; // дополнительные траты на отдыхе
                money = money / 3;
            } else {
                money = money + income - expenses;
            }
        }
        return count;
    }
}
