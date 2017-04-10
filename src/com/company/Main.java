package com.company;

public class Main {

    public static void main(String[] args) {

        Totolotek totolotek = new Totolotek();

        new Internet(totolotek);

        new Telewizja(totolotek);

        totolotek.refreshObservers();

        totolotek.kolejneLosowanie();

        new Internet(totolotek).informuj();
        new Telewizja (totolotek).informuj();
    }
}
