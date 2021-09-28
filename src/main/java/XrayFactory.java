public class XrayFactory extends AbstractDeviceFactory {


    @Override
    Device getGadget(DeviceType deviceType) {
        switch (deviceType) {
            case TOMOGRAPHYMACH:
                return new TomographyMach("16gb",50000,50);
            case ROENTGENMACH:
                return new RoentgenMach("32gb",75000,70);
        }
        return null;
    }
}
