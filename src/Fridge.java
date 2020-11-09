public class Fridge {

    private void periodicMaintenance() {}

    private double fridgeCapacity;
    private String fridgeType;
    private int amountOfMotors;
    private boolean noFrost;
    private boolean antiFinger;

    public Fridge(double fridgeCapacity,
            String fridgeType,
            int amountOfMotors,
            boolean noFrost,
            boolean antiFinger
    ) {
        this.fridgeCapacity = fridgeCapacity;
        this.fridgeType = fridgeType;
        this.amountOfMotors = amountOfMotors;
        this.noFrost = noFrost;
        this.antiFinger = antiFinger;
    }


    public void setFridgeCapacity(double newFridgeCapacity) {
        fridgeCapacity = newFridgeCapacity;
    }

    public double getFridgeCapacity() {
        return fridgeCapacity;
    }

    public void setFridgeType(String newFridgeType) {
        fridgeType = newFridgeType;
    }

    public String getFridgeType() {
        return fridgeType;
    }

    public void setAmountOfMotors(int newAmountOfMotor) {
        amountOfMotors = newAmountOfMotor;
    }

    public int getAmountOfMotors() {
        return amountOfMotors;
    }

    public void setNoFrost(boolean newNoFrost) {
        noFrost = newNoFrost;
    }

    public boolean isNoFrost() {
        return noFrost;
    }

    public void setAntiFinger(boolean newAntiFinger) {
        antiFinger = newAntiFinger;
    }

    public boolean isAntiFinger() {
        return antiFinger;
    }

}
