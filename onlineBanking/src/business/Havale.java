package business;

import entities.Acount;
import entities.Customer;

public class Havale{


    private Customer customer;
    private Acount acount;
    private int tutar;

    public Havale(Customer customer, Acount acount) {
        this.customer = customer;
        this.acount= acount;
    }


    public void aktar(Acount acount, Customer customer){

       // int tutar= 0 ;
        int i = +acount.getKalanBakiye();
        int total= i+ tutar;

        int j= getAcount().getKalanBakiye();
        int total2= j- tutar;

        System.out.println("Para gönderildi," + " "+ "Tutar:"+ tutar);
        System.out.println("Alıcı:"+ customer.getName()+ " " + customer.getLastName());
        System.out.println("Gönderen: "+ this.customer.getName()+ " " +this.customer.getLastName()+  ", Kalan bakiye:"+ total);
        System.out.println(customer.getName()+" " + customer.getLastName()+ ": Kalan bakiye " + total2);

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

    public int getTutar() {
        return tutar;
    }

    public void setTutar(int tutar) {
        this.tutar = tutar;
    }
}
