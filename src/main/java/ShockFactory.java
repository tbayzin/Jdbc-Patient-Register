public class ShockFactory extends AbstractDeviceFactory{



    @Override
    Device getGadget(DeviceType deviceType) {
        switch (deviceType) {
            case BRAINSHOCKMACH:
                return new BrainShockMach("8gb",40000);
            case HEARTSHOCKMACH:
                return new HeartShockMach("12gb",55000);
        }
        return null;
    }
}
