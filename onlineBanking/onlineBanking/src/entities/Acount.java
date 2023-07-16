package entities;

public class Acount {

    private int kalanBakiye;
    private String Iban;
    private String HesapNumarasi;

    public Acount() {

    }

    public Acount(int kalanBakiye, String Iban) {
        this.kalanBakiye = kalanBakiye;
        this.Iban= Iban;
    }


    public int getKalanBakiye() {
        return kalanBakiye;
    }

    public void setKalanBakiye(int kalanBakiye) {
        this.kalanBakiye = kalanBakiye;
    }

    public String getIban() {
        return Iban;
    }

    public void setIban(String iban) {
        Iban = iban;
    }

    public String getHesapNumarasi() {
        return HesapNumarasi;
    }

    public void setHesapNumarasi(String hesapNumarasi) {
        HesapNumarasi = hesapNumarasi;
    }




}
