public abstract class ComputerBuilder {

    protected Computer c;

    ComputerBuilder() 
    {
        this.c = new Computer(1234);
    }

    protected abstract void OSConfig();

    protected abstract void RAM_Size();

    protected abstract void HDD();

    protected abstract void deviceDriver();

    protected abstract void monitorSize();

    protected abstract void monitorType();

    public Computer getComputer() {
        return c;
    }

}