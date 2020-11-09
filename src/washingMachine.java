public class washingMachine {

    private void periodicMaintenance() {}

    private int laundrySpeed; // strofes to lepto
    private int amountOfSettings;
    private String energyClass;
    private boolean digitalScreen;
    private boolean delayedStart;
    public washingMachine(
            int laundrySpeed,
            int amountOfSettings,
            String energyClass,
            boolean digitalScreen,
            boolean delayedStart
    ) {
        this.laundrySpeed = laundrySpeed;
        this.amountOfSettings = amountOfSettings;
        this.energyClass = energyClass;
        this.digitalScreen = digitalScreen;
        this.delayedStart = delayedStart;
    }

    public void setLaundrySpeed(int laundrySpeed) {
        this.laundrySpeed = laundrySpeed;
    }

    public int getLaundrySpeed() {
        return this.laundrySpeed;
    }

    public void setAmountOfSettings(int amountOfSettings) {
        this.amountOfSettings = amountOfSettings;
    }

    public int getAmountOfSettings() {
        return this.amountOfSettings;
    }

    public void setEnergyClass(String energyClass) {
        this.energyClass = energyClass;
    }

    public String getEnergyClass() {
        return this.energyClass;
    }

    public void setDigitalScreen(boolean digitalScreen) {
        this.digitalScreen = digitalScreen;
    }

    public boolean isDigitalScreen() {
        return this.digitalScreen;
    }

    public void setDelayedStart(boolean delayedStart) {
        this.delayedStart = delayedStart;
    }

    public boolean isDelayedStart() {
        return this.delayedStart;
    }
}
