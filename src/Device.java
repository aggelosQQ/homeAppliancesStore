public class Device {
    private static int counter;

    double length;
    double height;
    double depth;
    String constructorName;
    String deviceName;
    String deviceType;
    double electricityConsum;

    public Device(
            double length,
            double height,
            double depth,
            String constructorName,
            String deviceName,
            String deviceType,
            double electricityConsum
    ) {
        this.length = length;
        this.height = height;
        this.depth = depth;
        this.constructorName = constructorName;
        this.deviceName = deviceName;
        this.deviceType = deviceType;
        this.electricityConsum = electricityConsum;
        counter++;
    }


    /* Global Characteristics */
    // Length
    public void setLength(double newLength) {
        length = newLength;
    }

    public double getLength() {
        return length;
    }

    // Height
    public void setHeight(double newHeight) {
        height = newHeight;
    }

    public double getHeight() {
        return height;
    }

    // Depth
    public void setDepth(double newDepth) {
        depth = newDepth;
    }

    public double getDepth() {
        return depth;
    }

    // Constructor Name
    public void setConstructorName(String newConstructorName) {
        constructorName = newConstructorName;
    }

    public String getConstructorName() {
        return constructorName;
    }

    // Device Name
    public void setDeviceName(String newDeviceName) {
        deviceName = newDeviceName;
    }

    public String getDeviceName() {
        return deviceName;
    }

    // Device Type
    public void setDeviceType(String newDeviceType) {
        deviceType = newDeviceType;
    }

    public String getDeviceType() {
        return deviceType;
    }

    // Electricity Consumption
    public void setElectricityConsum(double newElectricityConsum) {
        electricityConsum = newElectricityConsum;
    }

    public double getElectricityConsum() {
        return electricityConsum;
    }

    public static int getCounter() {
        return counter;
    }
}

