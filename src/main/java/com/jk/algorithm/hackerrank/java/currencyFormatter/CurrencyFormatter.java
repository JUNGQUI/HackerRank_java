package com.jk.algorithm.hackerrank.java.currencyFormatter;

import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyFormatter {

    public void solution () {
        double payment = 123142.12;

        String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        String india = NumberFormat.getCurrencyInstance(new Locale("en", "in")).format(payment);
        String china = NumberFormat.getCurrencyInstance(Locale.US).format(Locale.CHINA);
        String france = NumberFormat.getCurrencyInstance(Locale.US).format(Locale.FRANCE);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }

}
