public class HardwareEngineer {

    ComputerBuilder computerBuilder;

    public void setComputerBuilder(ComputerBuilder cbd) {
        computerBuilder = cbd;
    }

    public void buildComputer() {
        computerBuilder.OSConfig();
        computerBuilder.RAM_Size();
        computerBuilder.HDD();
        computerBuilder.deviceDriver();
        computerBuilder.monitorType();
        computerBuilder.monitorSize();
    }

}
