package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by RENT on 2017-04-10.
 */
public class Totolotek  implements Obserwowany{

    private List<Obserwator> lista = new ArrayList<Obserwator>();

    private int[]wyniki = new int[6];

    public List<Obserwator> getTotolotek(){
        return lista;
    }

    public void dodajObserwatora( Obserwator obserwator){
        lista.add(obserwator);
    }

    public void usunObserwatora( Obserwator obserwator){
        lista.remove(obserwator);
    }

    public void powiadamiajObserwatorow(){
        refreshObservers();
    }

    public void refreshObservers(){
        lista.forEach(s -> s.update());
    }

    public void kolejneLosowanie(){

        Random generator = new Random();

        for(int i=0; i<6; i++) {

          wyniki[i] = generator.nextInt(24);

        }

       // this.wyniki = wyniki ;
        refreshObservers();
    }

    public int[] getResult(){
        kolejneLosowanie();
        return wyniki;

    }
}
