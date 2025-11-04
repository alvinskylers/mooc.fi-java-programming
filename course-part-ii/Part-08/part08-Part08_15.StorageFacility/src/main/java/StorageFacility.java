import java.util.HashMap;
import java.util.ArrayList;

public class StorageFacility {
    private HashMap<String, ArrayList<String>> storage;

    public StorageFacility() {
        this.storage = new HashMap<>();
    }

    public void add(String unit, String item) {
        if (!storage.containsKey(unit)) {
            storage.put(unit, new ArrayList<String>());
        }
        storage.get(unit).add(item);
    }

    public ArrayList<String> contents(String storageUnit) {
        if (storage.containsKey(storageUnit)) {
            return storage.get(storageUnit);
        }
        return new ArrayList<String>();
    }

    public void remove(String storageUnit, String item) {
        if (storage.containsKey(storageUnit)) {
            if (storage.get(storageUnit).isEmpty()) {
                storage.remove(storageUnit);
            } else {
                storage.get(storageUnit).remove(item);
            }
        }

        if (storage.get(storageUnit).isEmpty()) {
            storage.remove(storageUnit);
        }
    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> storages = new ArrayList<>();
        for (String unit:storage.keySet()) {
            storages.add(unit);
        }
        return storages;
    }
}

