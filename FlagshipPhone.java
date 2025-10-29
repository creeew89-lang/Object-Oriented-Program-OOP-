package Vibe;

public class FlagshipPhone extends SmartPhone{
    private String processorModel;
    private String biometricSecurity;
    private int wirelessChargingSpeed;

    @Override
    public String toString() {
        return "FlagshipPhone{" +
                "processorModel='" + processorModel + '\'' +
                '}';
    }
}
