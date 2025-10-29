package Vibe;

abstract class PHONES {
    private String model;
    private double priceUsd;

    protected PHONES(String model, double priceUsd) {
        this.model = model;
        this.priceUsd = priceUsd;
    }

    public String getModel() {
        return model;
    }

    public double getPriceUsd() {
        return priceUsd;
    }

    public void setPriceUsd(double priceUsd) {
        this.priceUsd = priceUsd;
    }
}

abstract class FeaturePhone extends PHONES {
    protected FeaturePhone(String model, double priceUsd) {
        super(model, priceUsd);
    }
}

final class RuggedFeaturePhone extends FeaturePhone {
    private String ipRating;
    private double dropTestHeight;
    private int batteryStandbyDays;

    public RuggedFeaturePhone(String model, double priceUsd, String ipRating, double dropTestHeight, int batteryStandbyDays) {
        super(model, priceUsd);
        this.ipRating = ipRating;
        this.dropTestHeight = dropTestHeight;
        this.batteryStandbyDays = batteryStandbyDays;
    }

    public String getIpRating() {
        return ipRating;
    }

    public double getDropTestHeight() {
        return dropTestHeight;
    }

    public int getBatteryStandbyDays() {
        return batteryStandbyDays;
    }

    public void setIpRating(String ipRating) {
        this.ipRating = ipRating;
    }

    public void setDropTestHeight(double dropTestHeight) {
        this.dropTestHeight = dropTestHeight;
    }

    public void setBatteryStandbyDays(int batteryStandbyDays) {
        this.batteryStandbyDays = batteryStandbyDays;
    }

    @Override
    public String toString() {
        return "RuggedFeaturePhone{ipRating='" + ipRating + "'}";
    }
}

final class SeniorFeaturePhone extends FeaturePhone {
    private double largeButtonSize;
    private boolean sosButton;
    private boolean hearingAidCompatibility;

    public SeniorFeaturePhone(String model, double priceUsd, double largeButtonSize, boolean sosButton, boolean hearingAidCompatibility) {
        super(model, priceUsd);
        this.largeButtonSize = largeButtonSize;
        this.sosButton = sosButton;
        this.hearingAidCompatibility = hearingAidCompatibility;
    }

    public double getLargeButtonSize() {
        return largeButtonSize;
    }

    public boolean isSosButton() {
        return sosButton;
    }

    public boolean isHearingAidCompatibility() {
        return hearingAidCompatibility;
    }

    public void setLargeButtonSize(double largeButtonSize) {
        this.largeButtonSize = largeButtonSize;
    }

    public void setSosButton(boolean sosButton) {
        this.sosButton = sosButton;
    }

    public void setHearingAidCompatibility(boolean hearingAidCompatibility) {
        this.hearingAidCompatibility = hearingAidCompatibility;
    }

    @Override
    public String toString() {
        return "SeniorFeaturePhone{sosButton=" + sosButton + "}";
    }
}

class BasicFeaturePhone extends FeaturePhone {
    private String primaryFunction;
    private boolean colorScreen;
    private boolean fmRadio;

    public BasicFeaturePhone(String model, double priceUsd, String primaryFunction, boolean colorScreen, boolean fmRadio) {
        super(model, priceUsd);
        this.primaryFunction = primaryFunction;
        this.colorScreen = colorScreen;
        this.fmRadio = fmRadio;
    }

    public String getPrimaryFunction() {
        return primaryFunction;
    }

    public boolean isColorScreen() {
        return colorScreen;
    }

    public boolean isFmRadio() {
        return fmRadio;
    }

    public void setPrimaryFunction(String primaryFunction) {
        this.primaryFunction = primaryFunction;
    }

    public void setColorScreen(boolean colorScreen) {
        this.colorScreen = colorScreen;
    }

    public void setFmRadio(boolean fmRadio) {
        this.fmRadio = fmRadio;
    }

    @Override
    public String toString() {
        return "BasicFeaturePhone{colorScreen=" + colorScreen + "}";
    }
}

abstract class GamingPhone extends PHONES {
    protected GamingPhone(String model, double priceUsd) {
        super(model, priceUsd);
    }
}

class ProGamingPhone extends GamingPhone {
    private boolean shoulderTriggers;
    private String coolingSystemType;
    private int displayRefreshRate;

    public ProGamingPhone(String model, double priceUsd, boolean shoulderTriggers, String coolingSystemType, int displayRefreshRate) {
        super(model, priceUsd);
        this.shoulderTriggers = shoulderTriggers;
        this.coolingSystemType = coolingSystemType;
        this.displayRefreshRate = displayRefreshRate;
    }

    public boolean isShoulderTriggers() {
        return shoulderTriggers;
    }

    public String getCoolingSystemType() {
        return coolingSystemType;
    }

    public int getDisplayRefreshRate() {
        return displayRefreshRate;
    }

    public void setShoulderTriggers(boolean shoulderTriggers) {
        this.shoulderTriggers = shoulderTriggers;
    }

    public void setCoolingSystemType(String coolingSystemType) {
        this.coolingSystemType = coolingSystemType;
    }

    public void setDisplayRefreshRate(int displayRefreshRate) {
        this.displayRefreshRate = displayRefreshRate;
    }

    @Override
    public String toString() {
        return "ProGamingPhone{displayRefreshRate=" + displayRefreshRate + "}";
    }
}

class BudgetGamingPhone extends GamingPhone {
    private double processorClockSpeed;
    private int ramSize;
    private boolean gameBoosterSoftware;

    public BudgetGamingPhone(String model, double priceUsd, double processorClockSpeed, int ramSize, boolean gameBoosterSoftware) {
        super(model, priceUsd);
        this.processorClockSpeed = processorClockSpeed;
        this.ramSize = ramSize;
        this.gameBoosterSoftware = gameBoosterSoftware;
    }

    public double getProcessorClockSpeed() {
        return processorClockSpeed;
    }

    public int getRamSize() {
        return ramSize;
    }

    public boolean isGameBoosterSoftware() {
        return gameBoosterSoftware;
    }

    public void setProcessorClockSpeed(double processorClockSpeed) {
        this.processorClockSpeed = processorClockSpeed;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public void setGameBoosterSoftware(boolean gameBoosterSoftware) {
        this.gameBoosterSoftware = gameBoosterSoftware;
    }

    @Override
    public String toString() {
        return "BudgetGamingPhone{ramSize=" + ramSize + "}";
    }
}

class CloudGamingPhone extends GamingPhone {
    private String wifiStandard;
    private String[] _5gBandSupport;
    private String subscriptionBundle;

    public CloudGamingPhone(String model, double priceUsd, String wifiStandard, String[] _5gBandSupport, String subscriptionBundle) {
        super(model, priceUsd);
        this.wifiStandard = wifiStandard;
        this._5gBandSupport = _5gBandSupport;
        this.subscriptionBundle = subscriptionBundle;
    }

    public String getWifiStandard() {
        return wifiStandard;
    }

    public String[] get_5gBandSupport() {
        return _5gBandSupport;
    }

    public String getSubscriptionBundle() {
        return subscriptionBundle;
    }

    public void setWifiStandard(String wifiStandard) {
        this.wifiStandard = wifiStandard;
    }

    public void set_5gBandSupport(String[] _5gBandSupport) {
        this._5gBandSupport = _5gBandSupport;
    }

    public void setSubscriptionBundle(String subscriptionBundle) {
        this.subscriptionBundle = subscriptionBundle;
    }

    @Override
    public String toString() {
        return "CloudGamingPhone{wifi=" + wifiStandard + "}";
    }
}
