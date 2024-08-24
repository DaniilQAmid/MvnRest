package ru.netology.javaqa.freelanceRest.services;

public class restService {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету
        for (int mount = 1; mount < 12; mount++) {
            if (money >= threshold) { // можем ли отдыхать?
                count++; // увеличиваем счётчик месяцев отдыха
                int entertainments = money / 3; // дополнительные траты на отдыхе
                money = money - expenses - entertainments;
            } else {
                money = money + income - expenses;
            }
        }
        return count;
    }
}
