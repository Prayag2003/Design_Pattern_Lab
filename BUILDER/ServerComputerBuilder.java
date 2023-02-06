
class ServerComputerBuilder extends ComputerBuilder {
    
    @Override
    protected void HDD() {
        c.setHDD(220);
    }

    @Override
    protected void OSConfig() {
        c.setDeviceDriver("Unix");
    }

    @Override
    protected void RAM_Size() {
        c.setRAM_Size("128 GB");
    }

    @Override
    protected void deviceDriver() {
        c.setDeviceDriver("C:Drive");
    }

    @Override
    protected void monitorSize() {
        c.setMonitorSize("Very Very Large");
    }

    @Override
    protected void monitorType() {
        c.setMonitorType("");
    }

}