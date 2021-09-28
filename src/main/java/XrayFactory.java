public class XrayFactory extends AbstractDeviceFactory {


    @Override
    Device getGadget(DeviceType deviceType) {
        switch (deviceType) {
            case TOMOGRAPHYMACH:
                return new BrainShockMach("16gb",50000);
            case ROENTGENMACH:
                return new HeartShockMach("32gb",75000);
        }
        return null;
    }
}
