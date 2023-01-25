import java.lang.Cloneable;
import java.util.HashMap;

// Clone of already existing objects

// Copy creation , helps in time saving and saves cost

// if database is not locally available , web server , we need to fetch the data and create the object

// drawing application for example using same rectangle again and again , 

// Shallow Copy shares the same references
// MARKUP interface
// CLONABLE interface ( java.lang.Cloneable ) 
// Class should have Copy Feature

// Deep Copy main other copies wont get affected
// HASHMAP to create feature for registry
// ConcretePrototype ---> houses( 2 BHK , 3 BHK ) , shops 
// Map Object <String , newColor > = new HashMap 
// get ( to store ) , put methods of Map

// prototype 
// static initialiser block called only once

// Prototype of HOUSE
//  2 BHK , 3 BHK
//  reg of sample houses
//  agent buying 5-10 properties and give him clones of what he asks for

//  House id
//  area
// price

// set , getter , const , tostring
// House implements CLONABLE
// overrride clone method

// 2BHK extends House
// parking charge

// 3BHK
// furniture

// registry --> sample House store
// make objs of 2 bhk and 3bhk

class House implements Cloneable {
    protected String houseID;
    protected String area;
    protected float price;

    House() {

    }

    House(String area, String houseID, int price) {
        this.area = area;
        this.houseID = houseID;
        this.price = price;
    }

    public String getHouseID() {
        return houseID;
    }

    public void setHouseID(String houseID) {
        this.houseID = houseID;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException 
    {
        return super.clone();
    }

}

class Two_BHK extends House {
    protected float parkingCharge;

    public Two_BHK(String area, int price, String houseID, float parkingCharge) {
        super(area, houseID, price);
        this.parkingCharge = parkingCharge;
    }

    public float getParkingCharge() {
        return parkingCharge;
    }

    public void setParkingCharge(float parkingCharge) {
        this.parkingCharge = parkingCharge;
    }

    @Override
    public String toString() {
        return "Area is " + area + ". House is Price Rs " + price + ". HouseID is " + houseID + ". Furniture_price="
                + parkingCharge;
    }

}

class Three_BHK extends House {
    protected int furniture_price;

    public Three_BHK(String area, int price, String houseID, int furniture_price) {
        super(area, houseID, price);
        this.furniture_price = furniture_price;
    }

    public int getFurniture_price() {
        return furniture_price;
    }

    public void setFurniture_price(int furniture_price) {
        this.furniture_price = furniture_price;
    }

    @Override
    public String toString() {
        return "Area is " + area + ". House is Price Rs " + price + ". HouseID is " + houseID + ". Furniture_price="
                + furniture_price;
    }

}

// registry
class HouseStore{
    private static HashMap<String, House> collection = new HashMap<String, House>();

    static {
        collection.put("2BHK House", new Two_BHK("Surat", 1234000, "2875852", 85));
        // collection.put("3BHK House", new Three_BHK("Vadodara", 387893247, "8257842", 200));
    }

    public House getHouse(String type) throws CloneNotSupportedException
     {
        return (House)collection.get(type).clone();
    }

}

public class Lab6 {
    public static void main(String[] args) throws CloneNotSupportedException {
        HouseStore hs = new HouseStore();

        House phouse = hs.getHouse("2BHK House");
        phouse.setPrice(20000000);

        House prayaghouse = hs.getHouse("3BHK House");
        prayaghouse.setPrice(300000000);

        System.out.println(phouse);

        System.out.println(prayaghouse);

        prayaghouse = (House)phouse.clone();
        System.out.println(prayaghouse);

    }
}

// DEEP COPY
// owner mobile and name
