public class Oven {

    private void periodicMaintenance() {}

    private String ovenType;
    private String energyClass;
    private int ovenCapacity;
    private boolean digitalScreen;
    private boolean cleaningSystem;

    public Oven(
            String ovenType,
            String energyClass,
            int ovenCapacity,
            boolean digitalScreen,
            boolean cleaningSystem
    ) {
        this.ovenType = ovenType;
        this.energyClass = energyClass;
        this.ovenCapacity = ovenCapacity;
        this.digitalScreen = digitalScreen;
        this.cleaningSystem = cleaningSystem;
    }

    public void setOvenType(String ovenType) {
        this.ovenType = ovenType;
    }

    public String getOvenType() {
        return this.ovenType;
    }

    public void setEnergyClass(String energyClass) {
        this.energyClass = energyClass;
    }

    public String getEnergyClass() {
        return this.energyClass;
    }

    public void setOvenCapacity(int ovenCapacity) {
        this.ovenCapacity = ovenCapacity;
    }

    public int getOvenCapacity() {
        return this.ovenCapacity;
    }

    public void setDigitalScreen(boolean digitalScreen) {
        this.digitalScreen = digitalScreen;
    }

    public boolean isDigitalScreen() {
        return this.digitalScreen;
    }

    public void setCleaningSystem(boolean cleaningSystem) {
        this.cleaningSystem = cleaningSystem;
    }

    public boolean isCleaningSystem() {
        return this.cleaningSystem;
    }
}
