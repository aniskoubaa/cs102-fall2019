package majorexam02.fall2019.core;

public class Address {
    private String StreetName;
    private String City;
    private String Country;
    
    public Address (String sn, String city, String country){
        StreetName=sn;
        City=city;
        Country=country;
    }
    
    public void SetAddress (String sn, String city, String country){
        StreetName=sn;
        City=city;
        Country=country;
    }
    
    public String getStreetName(){
        return StreetName;
    }
    
    public String getCity(){
        return City;
    }
    
    public String getCountry(){
        return Country;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %s", this.StreetName, this.City, this.Country);
    }

}
