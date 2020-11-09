public class airCondition {
    private void periodicMaintenance() {}

    private int coolingPower;
    private int heatingPower;
    private String coolingEnergyClass;
    private String heatingEnergyClass;
    private boolean wifiEnabled;

    public airCondition(
            int coolingPower,
            int heatingPower,
            String coolingEnergyClass,
            String heatingEnergyClass,
            boolean wifiEnabled
    ) {
        this.coolingPower = coolingPower;
        this.heatingPower = heatingPower;
        this.coolingEnergyClass = coolingEnergyClass;
        this.heatingEnergyClass = heatingEnergyClass;
        this.wifiEnabled = wifiEnabled;
    }

    public void setCoolingPower(int coolingPower) {
        this.coolingPower = coolingPower;
    }

    public int getCoolingPower() {
        return this.coolingPower;
    }

    public void setHeatingPower(int heatingPower) {
        this.heatingPower = heatingPower;
    }

    public int getHeatingPower() {
        return this.heatingPower;
    }

    public void setCoolingEnergyClass(String coolingEnergyClass) {
        this.coolingEnergyClass = coolingEnergyClass;
    }

    public String getCoolingEnergyClass() {
        return this.coolingEnergyClass;
    }

    public void setHeatingEnergyClass(String heatingEnergyClass) {
        this.heatingEnergyClass = heatingEnergyClass;
    }

    public String getHeatingEnergyClass() {
        return this.heatingEnergyClass;
    }

    public void setWifiEnabled(boolean wifiEnabled) {
        this.wifiEnabled = wifiEnabled;
    }

    public boolean isWifiEnabled() {
        return this.wifiEnabled;
    }


}
