package business;

import entities.Acount;
import entities.Customer;

public class Entrance {

    private Customer customer;
    String[] islemler= {"Bakiye Öğren", "Havale", "Kredi Çek", "Para Çek", "Para Yatır", "Çıkış"};
    public void entrance(Customer customer){
        if(this.customer==customer){
        System.out.println("Giriş yapıldı:"+ customer.getName()+ " "+ customer.getLastName());
        System.out.println("Uygulamak istediğiniz işlemi seçiniz:");
            for(String islemler: islemler){
                System.out.println(islemler);
            }

        }else{
            System.out.println("KUllanıcı bilgileri hatalı!");
            System.exit(0);
        }



        }

        public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }



}
