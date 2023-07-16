package business;

import entities.Acount;

public class KrediCek {
    private int miktar;
    private int vade;
    private double faiz;


    public void krediCek(Acount acount){
        System.out.println("Kredi "+ acount.getHesapNumarasi()+ " numaralı hesaba tanımlandı. Tutar: "+ getMiktar() );
        double odenecek= getMiktar()+acount.getKalanBakiye()* getFaiz()* getVade()% 36500;
        System.out.println("Ödenecek tutar:"+ odenecek);

    }

    public int getMiktar() {
        return miktar;
    }

    public void setMiktar(int miktar) {
        this.miktar = miktar;
    }

    public int getVade() {
        return vade;
    }

    public void setVade(int vade) {
        this.vade = vade;
    }

    public double getFaiz() {
        return faiz;
    }

    public void setFaiz(double faiz) {
        this.faiz = faiz;
    }
}
