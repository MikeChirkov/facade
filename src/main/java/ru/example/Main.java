package ru.example;

public class Main {
    public static void main(String[] args) {
        BinOps bins = new BinOps();
        System.out.println(bins.sum("0101", "0101")); // 5 + 5
        System.out.println(bins.mult("0101", "0101")); // 5 * 5
        try {
            System.out.println(bins.sum("0101", "")); // Ошибка "Не переданы значения!"
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
    }
}