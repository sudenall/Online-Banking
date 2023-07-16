import business.*;
import entities.Acount;
import entities.Customer;

public class Main {
    public static void main(String[] args){


        Customer customer1= new Customer();
        customer1.setName("Engin");
        customer1.setLastName("Yaman");
        customer1.setPassword("123456");

        Customer customer2= new Customer();
        customer2.setName("Çiğdem");
        customer2.setLastName("Ergün");
        customer2.setPassword("98765");

        Acount acount1= new Acount();
        acount1.setIban("TR567...");
        acount1.setKalanBakiye(10000);
        acount1.setHesapNumarasi("293047631537");

        Acount acount2= new Acount();
        acount2.setIban("TR566...");
        acount2.setKalanBakiye(2000);
        acount2.setHesapNumarasi("564793610982");

        System.out.println("------");

        Entrance entrance = new Entrance(customer1);
        entrance.entrance(acount1);

        System.out.println("-------");

        BakiyeOgren bakiyeOgren= new BakiyeOgren();
        bakiyeOgren.bakiyeOgren(acount1);

        System.out.println("--------");

        Havale havale= new Havale(customer2, acount2);
        havale.setTutar(200);
        havale.aktar(acount1, customer1);

        System.out.println("------");

        KrediCek krediCek= new KrediCek();
        krediCek.setMiktar(100000);
        krediCek.setVade(12);
        krediCek.setFaiz(0.36);
        krediCek.krediCek(acount1);

        System.out.println("---------");

        ParaCek paraCek= new ParaCek(acount1);
        paraCek.paraCek(100);

        System.out.println("-------");

        ParaYatir paraYatir= new ParaYatir(acount2);
        paraYatir.paraYatir(350);

        System.out.println("---------");

        Exit exit= new Exit();
        exit.setCustomer(customer1);
        exit.exit(customer1);








    }
}