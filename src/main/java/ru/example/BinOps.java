package ru.example;

import java.util.Objects;

public class BinOps {
    public String sum(String a, String b) {
        if (Objects.isNull(a) || a.isEmpty()
                || Objects.isNull(b) || b.isEmpty()) {
            throw new IllegalStateException("Не переданы значения!");
        }
        int aInt = Integer.parseInt(a, 2);
        int bInt = Integer.parseInt(b, 2);
        return Integer.toBinaryString(aInt + bInt);
    }

    public String mult(String a, String b) {
        if (Objects.isNull(a) || a.isEmpty()
                || Objects.isNull(b) || b.isEmpty()) {
            throw new IllegalStateException("Переданы некорретные операнды!");
        }
        int aInt = Integer.parseInt(a, 2);
        int bInt = Integer.parseInt(b, 2);
        return Integer.toBinaryString(aInt * bInt);
    }
}
