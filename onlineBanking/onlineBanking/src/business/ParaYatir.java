package business;

import entities.Acount;

public class ParaYatir {

    private Acount acount;
    public void paraYatir(int tutar){
        int i= acount.getKalanBakiye();
        int total= i+tutar;
        System.out.println(acount.getHesapNumarasi()+ " Numaralı hesaba " + tutar + " TL para yatırılmıştır.");
        System.out.println("Kalan bakiye: "+ total);
    }

    public Acount getAcount() {
        return acount;
    }

    public void setAcount(Acount acount) {
        this.acount = acount;
    }
}
