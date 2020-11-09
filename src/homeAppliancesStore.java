public class homeAppliancesStore {
    String onomaEtairias;
    String address;
    int numberOfEmployees;

    public String getName() {
        return this.onomaEtairias;
    }
    public void setName(String name) {
        this.onomaEtairias = name;
    }

    public String getAddress() {
        return this.address;
    }
    public void setAddress(String newAddress) {
        address = newAddress;
    }

    public int getNumberOfEmployees() {
        return this.numberOfEmployees;
    }
    public void setNumberOfEmployees(int employees) {
        this.numberOfEmployees = employees;
    }


    public static void main(String[] args) {
        homeAppliancesStore store = new homeAppliancesStore();
        store.setName("Home Appliances Store");
        store.setAddress("Diefthinsi 445");
        store.numberOfEmployees = 25;

        System.out.println(store.getName() + " | " + store.getAddress() + " | " + store.getNumberOfEmployees());

        System.out.printf("\n");

        // Fridge
        Device fridge = new Device(59.5, 203.00,68.2, "LG", "LG GBP62DSNFN", "Fridge", 193);
        Fridge fridgeFeatures = new Fridge(384, "French", 2, true, false);

        System.out.println("General Features of " + fridge.getDeviceType());
        System.out.printf("Length: %.2f | Height: %.2f | Depth: %.2f | Constructor Name: %s | Device Name: %s | Device Type: %s | Electric Consumption: %.2f", fridge.getLength(), fridge.getHeight(), fridge.getDepth(), fridge.getConstructorName(), fridge.getDeviceName(), fridge.getDeviceType(), fridge.getElectricityConsum());
        System.out.println("\nSpecial Features of " + fridge.getDeviceType());
        System.out.printf("Capacity: %.2flt | Type: %s | Motors: %d | No Frost: %b | Anti Finger: %b", fridgeFeatures.getFridgeCapacity(), fridgeFeatures.getFridgeType(), fridgeFeatures.getAmountOfMotors(), fridgeFeatures.isNoFrost(), fridgeFeatures.isAntiFinger());

        System.out.printf("\n\n");


        // Washing Machine
        Device washingMachine = new Device(59.8, 84.8,59.00, "Pitsos", "Pitsos WQP1400G9", "Washing Machine", 152.00);
        washingMachine washingMachineFeatures = new washingMachine(1400, 20, "A+++", true, false);

        System.out.println("General Features of " + washingMachine.getDeviceType());
        System.out.printf("Length: %.2f | Height: %.2f | Depth: %.2f | Constructor Name: %s | Device Name: %s | Device Type: %s | Electric Consumption: %.2f", washingMachine.getLength(), washingMachine.getHeight(), washingMachine.getDepth(), washingMachine.getConstructorName(), washingMachine.getDeviceName(), washingMachine.getDeviceType(), washingMachine.getElectricityConsum());
        System.out.println("\nSpecial Features of " + washingMachine.getDeviceType());
        System.out.printf("Laundry Speed: %d | Settings Amount: %d | Energy Class: %s | Digital Screen: %b | Delayed Start: %b", washingMachineFeatures.getLaundrySpeed(), washingMachineFeatures.getAmountOfSettings(), washingMachineFeatures.getEnergyClass(), washingMachineFeatures.isDigitalScreen(), washingMachineFeatures.isDelayedStart());


        System.out.printf("\n\n");

        // Oven
        Device oven = new Device(60, 85,60, "Bosch", "Bosch HKR390050", "Oven", 202.00);
        Oven ovenFeatures = new Oven("electric", "A", 66, true, false);

        System.out.println("General Features of " + oven.getDeviceType());
        System.out.printf("Length: %.2f | Height: %.2f | Depth: %.2f | Constructor Name: %s | Device Name: %s | Device Type: %s | Electric Consumption: %.2f", oven.getLength(), oven.getHeight(), oven.getDepth(), oven.getConstructorName(), oven.getDeviceName(), oven.getDeviceType(), oven.getElectricityConsum());
        System.out.println("\nSpecial Features of " + oven.getDeviceType());
        System.out.printf("Oven Type: %s | Energy Class: %s | Oven Capacity: %d | Digital Screen: %b | Cleaning System: %b", ovenFeatures.getOvenType(), ovenFeatures.getEnergyClass(), ovenFeatures.getOvenCapacity(),ovenFeatures.isDigitalScreen(), ovenFeatures.isCleaningSystem());


        System.out.printf("\n\n");

        // Air Condition
        Device airCondition = new Device(970, 300,224, "Toyotomi", "Izuru TRN/TRG-856ZR", "Air Conditioner", 304.00);
        airCondition airConditionFeatures = new airCondition(17743, 14330, "A++", "A+", true);

        System.out.println("General Features of " + airCondition.getDeviceType());
        System.out.printf("Length: %.2f | Height: %.2f | Depth: %.2f | Constructor Name: %s | Device Name: %s | Device Type: %s | Electric Consumption: %.2f", airCondition.getLength(), airCondition.getHeight(), airCondition.getDepth(), airCondition.getConstructorName(), airCondition.getDeviceName(), airCondition.getDeviceType(), airCondition.getElectricityConsum());
        System.out.println("\nSpecial Features of " + airCondition.getDeviceType());
        System.out.printf("Cooling Power: %d | Heating Power: %d | Cooling Energy Class: %s | Heating Energy Class: %s | WiFi Enabled: %b", airConditionFeatures.getCoolingPower(), airConditionFeatures.getHeatingPower(), airConditionFeatures.getCoolingEnergyClass(),airConditionFeatures.getHeatingEnergyClass(), airConditionFeatures.isWifiEnabled());

    System.out.printf("\n\n\nAmount of products: %d", Device.getCounter());

    }
}
