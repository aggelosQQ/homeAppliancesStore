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
        this.address = newAddress;
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
    }
}
