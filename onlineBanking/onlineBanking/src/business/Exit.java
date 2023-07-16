package business;

import entities.Customer;

public class Exit {

    private Customer customer;
    public void exit(Customer customer){
        System.out.println(customer.getName()+  " " +customer.getLastName()+"  hesabından çıkış yapıldı.");
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
