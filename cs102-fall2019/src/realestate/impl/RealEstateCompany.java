package realestate.impl;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import realestate.interfaces.IApartment;
import realestate.interfaces.IHome;
import realestate.interfaces.IRealEstate;
import realestate.interfaces.IRealEstateCompany;


public class RealEstateCompany implements IRealEstateCompany{
    
    private List<IRealEstate> realEstates = new ArrayList<IRealEstate>();
    
    private String name;
    
    private static RealEstateCompany instance = new RealEstateCompany("");
    
    private RealEstateCompany(String name) {
        this.name = name;
    }
    
    public static RealEstateCompany getInstance(){
        return instance;
    }
    
    /*
    loadData Method Grade: 5 points Duration: 15 minutes

In the class RealEstateCompany, write the method
public void loadRealEstates(String filename)
that reads all the data from the file specified by the name filename and stores 
them in the list of real estates objects realEstates, which is an attribute in the class RealEstateCompany.
Note. You must use the factory pattern to create new real estate objects.
    */
    
    
    public void loadData (String fileName){
        
        RealEstateFactory re = new RealEstateFactory();
        try {
            Scanner sc = new Scanner(new File(fileName));
            while (sc.hasNextLine()){
                /*
                home,H10000,Home10000,265,2,false,94340
                apartment,A10000,Apartment10000,236,6,10,2,257712
                terrain,T10000,Terrain10000,102,false,13770
                */
                
                String [] items = sc.nextLine().split(",");
                String id = items[1];
                String name = items[2];
                double surface = Double.parseDouble(items[3]);
                
                if (items[0].equalsIgnoreCase("home")){
                    int nRooms = Integer.parseInt(items[4]);
                    boolean hasGarage = Boolean.parseBoolean(items[5]);
                    double price = Double.parseDouble(items[6]);
                    
                    Home home = (Home)re.getRealEstate("home", id, name, surface);
                    home.setPrice(price);
                    home.setHasGarage(hasGarage);
                    home.setNumberOfRooms(nRooms);
                    realEstates.add(home);
                    
                }else if (items[0].equalsIgnoreCase("apartment")){
                    
                }else if (items[0].equalsIgnoreCase("terrain")){
                    
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(RealEstateCompany.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    
    
    
    public void loadRealEstates2(String filename) throws FileNotFoundException{
        File inFile = new File(filename);
        Scanner input = new Scanner(inFile);

        RealEstateFactory ref = new RealEstateFactory();

        while(input.hasNextLine())
        {
            String[] line = input.nextLine().split(",");
            String type = line[0];
            String id = line[1];
            String name = line[2];
            double surface = Double.parseDouble(line[3]);

            IRealEstate realEstate = ref.getRealEstate(type, id, name, surface);

            if(realEstate instanceof Home)
            {


            ((Home)realEstate).setNumberOfRooms(Integer.parseInt(line[4]));
            ((Home)realEstate).setHasGarage(Boolean.parseBoolean(line[5]));
            realEstate.setPrice(Double.parseDouble(line[6]));
            }

            else if(realEstate instanceof Apartment)
            {
                ((Apartment)realEstate).setNumberOfRooms(Integer.parseInt(line[4]));
                ((Apartment)realEstate).setNumber(Integer.parseInt(line[5]));
                ((Apartment)realEstate).setFloorNumber(Integer.parseInt(line[6]));
                realEstate.setPrice(Double.parseDouble(line[7]));
            }

            else if(realEstate instanceof Terrain)
            {
                ((Terrain)realEstate).setHasSink(Boolean.parseBoolean(line[4]));
                realEstate.setPrice(Double.parseDouble(line[5]));
            }

            realEstates.add(realEstate);
        }

}
    
    public void addApartmentToBuilding(String buildingId, String apartmentId){
        int buildingIndex = -1;
        int apartmentIndex = -1;
        for (int i=0;i<realEstates.size();i++){
            IRealEstate realEstate = realEstates.get(i);
            if (realEstate instanceof Building){
                if (buildingId.compareTo(realEstates.get(i).getId())==0)
                buildingIndex = i;
                if ((buildingIndex !=-1) &&(apartmentIndex != -1)) break;
            }
            if (realEstate instanceof IApartment){
                if (buildingId.compareTo(realEstates.get(i).getId())==0)
                apartmentIndex = i;
                if ((buildingIndex !=-1) &&(apartmentIndex != -1)) break;
            }
        }
        if ((buildingIndex !=-1) &&(apartmentIndex != -1)){
            Building b = (Building) (realEstates.get(buildingIndex));
            IApartment a = (IApartment)(realEstates.get(apartmentIndex));
            b.getApartments().add(a);
        }
    }
    
    

    @Override
    public List<IRealEstate> getRealEstates() {
        return realEstates;
    }

    public void setRealEstates(ArrayList<IRealEstate> realEstates) {
        this.realEstates = realEstates;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public boolean addRealEstate (IRealEstate realEstate){
        for (int i=0;i<realEstates.size();i++){
            if (realEstate.getId().compareTo(realEstates.get(i).getId())==0)
                return false;
        }
        realEstates.add(realEstate);
        return true;
    }
    public boolean removeRealEstate (String id){
        int index = -1;
        for (int i=0;i<realEstates.size();i++){
            if (id.compareTo(realEstates.get(i).getId())==0)
                index = i;
                break;
        }
        if (index !=-1)
            realEstates.remove(index);
        return true;
    }  
}
