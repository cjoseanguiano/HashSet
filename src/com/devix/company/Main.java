package com.devix.company;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> values = new ArrayList<>();
        values.add("cat");
        values.add("dog");
        values.add("cat");
        values.add("bird");

        HashSet<String> set = new HashSet<>(values);

        ArrayList<String> result = new ArrayList<>(set);

        System.out.println(result.toString());
    }
}
