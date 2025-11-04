import java.util.HashMap;
import java.util.ArrayList;

public class VehicleRegistry {

    private HashMap<LicensePlate, String> vehicleRegis;

    public VehicleRegistry() {
        this.vehicleRegis = new HashMap<>();
    }
    
    public boolean add(LicensePlate licensePlate, String owner) {
        if (vehicleRegis.get(licensePlate) == null) {
            vehicleRegis.put(licensePlate, owner);
            return true;
        }
        return false;
    }

    public String get(LicensePlate licensePlate) {
        if (vehicleRegis.get(licensePlate) == null) {
            return null;
        }
        return vehicleRegis.get(licensePlate);
    }

    public boolean remove(LicensePlate licensePlate) {
        if (vehicleRegis.get(licensePlate) == null) {
            return false;
        } else {
            vehicleRegis.remove(licensePlate);
            return true;
        }
    }

    public void printLicensePlates() {
        for (LicensePlate plate : vehicleRegis.keySet()) {
            System.out.println(plate);
        }
    }

    public void printOwners() {
        ArrayList<String> names = new ArrayList<>();

        for (LicensePlate plate : vehicleRegis.keySet()) {
            if (!names.contains(vehicleRegis.get(plate))) {
                names.add(vehicleRegis.get(plate));
            }
        }

        for (String name : names) {
            System.out.println(name);
        }
    }

}
 