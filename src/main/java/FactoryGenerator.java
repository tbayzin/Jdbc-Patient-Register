public class FactoryGenerator {
    public static AbstractDeviceFactory getFactory(FactoryType factoryType) {
        switch (factoryType) {
            case XRAYFACTORY:
                    return new XrayFactory();
            case SHOCKFACTORY:
                return new ShockFactory();
            }
            return null;
    }
}
