package business;

import entities.Acount;
import entities.Customer;

public class Havale{

    private Customer customer1;
    private Customer customer2;
    private Acount acount1;
    private Acount acount2;

    private int tutar;



    public void aktar(Acount acount1){

       // int tutar= 0 ;
        int i = +acount1.getKalanBakiye();
        int total= i+ tutar;

        int j= getAcount2().getKalanBakiye();
        int total2= j- tutar;

        System.out.println("Para gönderildi," + " "+ "Tutar:"+ tutar);
        System.out.println("Alıcı:"+ getCustomer1().getName() + " " + getCustomer1().getLastName());
        System.out.println( "(" +getCustomer1().getName()+ " "+ getCustomer1().getLastName()+ ")" +" Kalan Bakiye:" + total);
        System.out.println( "Gönderen:"+ getCustomer2().getName()+ " "+ getCustomer2().getLastName()+ "," + "Kalan Bakiye:"+ total2);

    }


    public Customer getCustomer1() {
        return customer1;
    }

    public void setCustomer1(Customer customer1) {
        this.customer1 = customer1;
    }

    public Customer getCustomer2() {
        return customer2;
    }

    public void setCustomer2(Customer customer2) {
        this.customer2 = customer2;
    }

    public Acount getAcount1() {
        return acount1;
    }

    public void setAcount1(Acount acount1) {
        this.acount1 = acount1;
    }

    public Acount getAcount2() {
        return acount2;
    }

    public void setAcount2(Acount acount2) {
        this.acount2 = acount2;
    }

    public int getTutar() {
        return tutar;
    }

    public void setTutar(int tutar) {
        this.tutar = tutar;
    }
}
