package assignment14;

public class OnlineStoreWithoutDesignPatterns {
    
    public static void main(String [] args){
        
        Store store = new Store();
        
        BookProduct [] books = new BookProduct [2];
        MobilePhoneProduct [] phones = new MobilePhoneProduct [2];
        
        
        //define books
        String [] authors_book1= {"Anis Koubaa"};
        String [] authors_book2= {"Mohamed Affendi"};
        
        books [0] = new BookProduct ( 1, "Java Programming", 120.35, authors_book1, "1234569");
        books [1] = new BookProduct ( 2, "Mobile Computing", 172.35, authors_book2, "5748789");
        
        //define phones
        phones [0]  = new MobilePhoneProduct ( 1, "iPhone6", 3500.0, "iPhone");
        phones [1]  = new MobilePhoneProduct ( 2, "Samsung S4", 2100.0, "Samsung");
        
        
        //define customer
        Street st1 = new Street (1,"Rafha Street", "Riyadh");
        Address a1 = new Address (st1, "Riyadh ", "Saud Arabia", 14523);
        
        Street st2 = new Street (12,"Olya Street", "Riyadh");
        Address a2 = new Address (st2, "Riyadh ", "Saud Arabia", 14523);
        
        Customer customer1 = new Customer ("FG21", "Khaled Ali", a1);
        Customer customer2 = new Customer ("FG25", "Hassan Mounir", a1);
        
        //define an order
        Order order1 = new Order (customer1, phones [0], customer1.getAddress());
        
        Address shippingAddress1 = a2;
        Order order2 = new Order (customer2, books [0], customer2.getAddress());
        
        System.out.println (order1);
        
        System.out.println (order2);
        
        
    }
    
}
