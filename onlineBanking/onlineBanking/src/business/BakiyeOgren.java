package business;

import entities.Acount;

public class BakiyeOgren {
    public void bakiyeOgren(Acount acount){
        System.out.println("Hesap numarası: "+ acount.getHesapNumarasi());
        System.out.println("Kalan bakiye:"+ acount.getKalanBakiye());


    }
}
