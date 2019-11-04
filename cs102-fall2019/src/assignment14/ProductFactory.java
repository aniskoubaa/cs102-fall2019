/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment14;

/**

If the productType is mobile Phone, then authors attribute should be null when 
getProduct() is called.

brand_isbn attribute is a generic attribute represents either the brand, 
* if product type is a MobilePhoneProduct, 
* and the ISBN of the book if the product type of BookProduct. ProductFactory Class
* 
* 
 */
public class ProductFactory {
    
    public IProduct getProduct(  
       String productType,   
       int id,   
       String label,   
       double price,   
       String [] authors,   
       String brand_isbn){
        
        if (productType.equalsIgnoreCase("book")){
            return new BookProduct(id, label, price, authors, brand_isbn);
        }else if (productType.equalsIgnoreCase("mobile")){
            return new MobilePhoneProduct(id, label, price, brand_isbn);
        }
        return null;
    }
    
}
