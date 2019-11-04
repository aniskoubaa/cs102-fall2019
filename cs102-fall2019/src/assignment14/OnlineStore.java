
package assignment14;


public class OnlineStore {
    
    public static void main(String [] args){
        
        /** task 1: Create the object [store] of the class Store **/
        Store store = Store.getInstance();
        
        /** task 2: create a new FactoryProduct object **/
        ProductFactory fp = new ProductFactory();
        
        
        
        //define books
        String [] authors_book1= {"Anis Koubaa"};
        String [] authors_book2= {"Mohamed Affendi"};
        
        /** task 3: 
         * task 3.1: using Product Factory, create a book1 as 
         * 1, "Java Programming", 120.35, authors_book1, "1234569" 
         * task 3.2: add the created book into the products ArrayList of the store object
         */
         
        IProduct book1 =  fp.getProduct("book",1, "Java Programming", 120.35, authors_book1, "1234569");
        IProduct book2 = fp.getProduct("book", 2, "Mobile Computing", 172.35, authors_book2, "5748789");
        
        store.getProducts().add((Product)book1);
        store.getProducts().add((Product)book2);
        
        /** task 4: 
         * task 4.1: using Product Factory, create a mobile1 as {1, 2, "iPhone6", 3500.0, "iPhone"} 
         * task 4.2: add the created book into the products ArrayList of the store object
         */
        IProduct phone1 = fp.getProduct("mobile", 1, "iPhone6", 3500.0,null, "iPhone");
        IProduct phone2  = fp.getProduct("mobile", 2, "Samsung S4", 2100.0,null, "Samsung");
        
        store.getProducts().add((Product)phone1);
        store.getProducts().add((Product)phone2);

        //define customer
        //define customer
        Street st1 = new Street (1,"Rafha Street", "Riyadh");
        Address a1 = new Address (st1, "Riyadh ", "Saud Arabia", 14523);
        
        Street st2 = new Street (12,"Olya Street", "Riyadh");
        Address a2 = new Address (st2, "Riyadh ", "Saud Arabia", 14523);
        
        Customer customer1 = new Customer ("FG21", "Khaled Ali", a1);
        Customer customer2 = new Customer ("FG25", "Hassan Mounir", a1);
        
        /** task 5: 
         * fix the error in "phones[0]" and "books[0]" by putting the two products that are in the store ArrayList
         */
        
        Order order1 = new Order (customer1,store.getProducts().get(2), customer1.getAddress());
        
        Address shippingAddress1 = a2;
        Order order2 = new Order (customer2, store.getProducts().get(0), customer2.getAddress());
        
        /** task 6: 
         * add the orders into the orders ArrayList of store
         */
        store.getOrders().add(order1);
        store.getOrders().add(order2);
        
    }
    
}

