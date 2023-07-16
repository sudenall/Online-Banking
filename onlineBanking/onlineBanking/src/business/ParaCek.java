package business;

import entities.Acount;

public class ParaCek {

    private Acount acount;
    public void paraCek(int tutar){
        int i= acount.getKalanBakiye();
        int total= i- tutar;
        System.out.println( acount.getHesapNumarasi() + " Numaralı hesaptan " +tutar+ " TL para çekildi." );
        System.out.println("Kalan bakiye: "+ total);
    }

    public Acount getAcount() {
        return acount;
    }

    public void setAcount(Acount acount) {
        this.acount = acount;
    }
}
