package com.company;

/**
 * Created by RENT on 2017-04-10.
 */
public class Telewizja implements Obserwator, Media {

    private Totolotek totolotek;

     private int[] wyniki = new int[6];

    public Telewizja(Totolotek totolotek) {
        this.totolotek = totolotek;
        this.totolotek.dodajObserwatora(this);
    }

    public void Telewizja(Totolotek totolotek) {

    }

    public void update() {

    }

    public void informuj() {
        System.out.println("\nW telewizji sa wyniki: ");
        for (int j = 0; j < totolotek.getResult().length; j++) {
            System.out.print(wyniki[j] + ", ");
        }

    }

    public void spadam() {


    }
}
