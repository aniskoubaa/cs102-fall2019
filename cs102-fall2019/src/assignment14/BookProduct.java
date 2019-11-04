package assignment14;


public class BookProduct extends Product implements IProduct{
    
    private String [] authors;
    private int numberOfAuthors;
    private String ISBN;
    
    public BookProduct(int id, String label, double price, 
            String [] authors, String ISBN){
        super (id, label, price);
        setNumberOfAuthors(authors.length);
        setAuthors(authors);
        setISBN(ISBN);
    }
    
    public String getTitle(){
        return getLabel();
    }
    
    public void setTitle(String title){
        setLabel(title);
    }
    
    public void setNumberOfAuthors(int n){
        if (n>0)
            numberOfAuthors=n;
    }
    
    public void setAuthors(String [] auth){
        authors = auth;
    }
    
    public void setISBN(String isbn){
        if (isbn.length()==6)
            ISBN = isbn;
    }
    
    public int getNumberOfAuthors(){
        return numberOfAuthors;
    }
    
    public String [] getAuthors(){
        return authors;
    }
    
    public String getISBN(){
        return ISBN;
    }
    
    @Override
    public String toString(){
        return String.format("BookProduct{%s}", super.toString());
    }

    @Override
    public String getPID() {
       return String.format("%d",getID());
    }

    @Override
    public String getInfo() {
        return toString();
    }
    
}
