// seperate construction of a complex object from its representation so that the same construction processs can create diffferent representations

// construct a complex object step by step and final step will return the object

// process of constructing an object should be generic so that it can be used to create different representations 

// BUILDER PATTERN

// PRODUCT
// class computer having 5-7 Fields
// add single arg constructor
// and setters
// override TO_STRING

// ABSTRACT COMPUTER BUILDER CLASS to create our class
// creation ka kaam dusre class main karna hain
// buildPart();
// BUILDER builds Product ( Composition )
// private variable of type PRODUCT 

// Concrete Builder 
// buildPart();
// getComputer(); // return type computer

class Computer {
    private int Computer_ID;
    private String OSConfig;
    private String RAM_Size;
    private int HDD;
    private String processor_make;
    private String processor_type;
    private String deviceDriver;
    private String monitorSize;
    private String monitorType;

    // Constructor
    Computer(int Computer_ID) {
        this.Computer_ID = Computer_ID;
    }

    public String getOSConfig() {
        return OSConfig;
    }

    public void setOSConfig(String oSConfig) {
        this.OSConfig = oSConfig;
    }

    public String getRAM_Size() {
        return RAM_Size;
    }

    public void setRAM_Size(String RAM_SIZE) {
        this.RAM_Size = RAM_SIZE;
    }

    public int getHDD() {
        return HDD;
    }

    public void setHDD(int HDD) {
        this.HDD = HDD;
    }

    public String getProcessor_make() {
        return "wlkghrwj";
    }

    public void setProcessor_make(String processor_make) {
        this.processor_make = processor_make;
    }

    public String getProcessor_type() {
        return "lkndsjkdf";
    }

    public void setProcessor_type(String processor_type) {
        this.processor_type = processor_type;
    }

    public String getDeviceDriver() {
        return "kbfejf";
    }

    public void setDeviceDriver(String deviceDriver) {
        this.deviceDriver = deviceDriver;
    }

    public String getMonitorSize() {
        return "monitorsixe";
    }

    public void setMonitorSize(String monitorSize) {
        this.monitorSize = monitorSize;
    }

    public String getMonitorType() {
        return monitorType;
    }

    public void setMonitorType(String monitorType) {
        this.monitorType = monitorType;
    }

}

public class Lab5 {
    public static void main(String[] args) {

        HardwareEngineer he = new HardwareEngineer();

        ComputerBuilder pcb = new PersonalComputerBuilder();

        he.setComputerBuilder(pcb);
        he.buildComputer();

        Computer comp1 = pcb.getComputer();
        System.out.println(comp1);
    }

}
