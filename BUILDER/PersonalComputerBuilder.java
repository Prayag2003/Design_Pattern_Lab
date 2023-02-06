
public class PersonalComputerBuilder extends ComputerBuilder {

    protected Computer c;

    @Override
    protected void HDD() {
        c.setHDD(124);
    }

    @Override
    protected void OSConfig() {
        c.setDeviceDriver("Windows");
    }

    @Override
    protected void RAM_Size() {
        c.setRAM_Size("8 GB");
    }

    @Override
    protected void deviceDriver() {
        c.setDeviceDriver("D:Drive");
    }

    @Override
    protected void monitorSize() {
        c.setMonitorSize("Large");
    }

    @Override
    protected void monitorType() {
        c.setMonitorType("Solid");
    }

}
