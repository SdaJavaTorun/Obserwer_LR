package com.company;

/**
 * Created by RENT on 2017-04-10.
 */
public class Internet implements Obserwator, Media{

    private Totolotek totolotek;

   private int[] wyniki = new int[12];

    public Internet(Totolotek totolotek){
        this.totolotek = totolotek;
        this.totolotek.dodajObserwatora( this);
    }

    public void Internet(Totolotek totolotek){

    }
    public void update(){

    }

    public void informuj(){

        System.out.println("\nW internecie sa wyniki: ");
for(int j = 0; j < totolotek.getResult().length; j++){
            System.out.print(wyniki[j] + ", ");
    System.out.println();
        }
    }

    public void spadam(){}

}
