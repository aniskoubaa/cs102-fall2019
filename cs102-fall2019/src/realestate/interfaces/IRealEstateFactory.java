/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package realestate.interfaces;

/**
 *
 * @author akoubaa
 */
public interface IRealEstateFactory {
    
    public IRealEstate getRealEstate(String realEstateType, String id, String name, double surface);
    
}
