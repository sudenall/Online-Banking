package business;

import entities.Acount;
import entities.Customer;

public class Entrance {

    private Customer customer;
    private Acount acount;
    String[] islemler= {"Bakiye Öğren", "Havale", "Kredi Çek", "Para Çek", "Para Yatır", "Çıkış"};


    public Entrance(Customer customer) {
        this.customer= customer;

    }

    public void entrance(Acount acount){
        if(this.customer==customer){
        System.out.println( acount.getHesapNumarasi()+"  Numaralı hesaba giriş yapıldı: ");
        System.out.println("Uygulamak istediğiniz işlemi seçiniz:");
            for(String islemler: islemler){
                System.out.println(islemler);
            }

        }else{
            System.out.println("Kullanıcı bilgileri hatalı! Tekrar deneyiniz.");

            //System.exit(0);
        }



        }

        public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }


    public Acount getAcount() {
        return acount;
    }

    public void setAcount(Acount acount) {
        this.acount = acount;
    }
}
