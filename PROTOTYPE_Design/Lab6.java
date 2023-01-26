// https://www.geeksforgeeks.org/prototype-design-pattern/

import java.lang.Cloneable;
import java.util.HashMap;

// Prototype Design Participants

// 1) Prototype : This is the prototype of an actual object.

// 2) Prototype registry : This is used as a registry service to have all prototypes accessible using simple string parameters.

// 3) Client : Client will be responsible for using registry service to access prototype instances.

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
    // Clone() is a method of the Object Class

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}

class Two_BHK extends House {

    // extra instance field for parking Charge
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
        return "Residential Area is " + area + ". Worth Rs " + price + ". HouseID is " + houseID
                + ". Parking Charge is = "
                + parkingCharge + " .\n";
    }

}

class Three_BHK extends House {

    // extra instance field for furniture price
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
    public String toString() 
    {
        return "Residential Area is " + area + ".  Worth Rs " + price + ". HouseID is " + houseID
                + ". Furniture_price = "
                + furniture_price + " .\n";
    }

}

class HouseStore {
    private static HashMap<String, House> collection = new HashMap<String, House>();

    // static initialiser block called only once
    static {
        collection.put("2BHK House", new Two_BHK("Delhi", 27000000, "A402", 30));
        collection.put("3BHK House", new Three_BHK("Mumbai", 35000000, "B300", 40));
    }

    public House getHouse(String type) throws CloneNotSupportedException {
        return (House) collection.get(type).clone();
    }

}

public class Lab6 {
    public static void main(String[] args) throws CloneNotSupportedException 
    {

        HouseStore store = new HouseStore();

        House PeaceOfLife = store.getHouse("2BHK House");
        PeaceOfLife.setPrice(20000000);

        House CradleOfHeaven = store.getHouse("3BHK House");
        CradleOfHeaven.setPrice(300000000);

        System.out.println(PeaceOfLife);

        System.out.println(CradleOfHeaven);

        // alternate method 
        CradleOfHeaven = (House) PeaceOfLife.clone();
        System.out.println(CradleOfHeaven);

    }
}
