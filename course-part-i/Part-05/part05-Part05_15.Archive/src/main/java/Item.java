public class Item {

    private String identifier;
    private String name;

    public Item(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }

    public String getIdentifier() {
        return this.identifier;
    }

    public String getName() {
        return this.name;
    }

    public boolean equals(Object object) {
        
        if (this == object) {
            return true;
        }

        if (!(object instanceof Item)) {
            return false;
        }

        Item itemObject = (Item) object;

        if (this.identifier.equals(itemObject.identifier)) {
            return true;
        }
        
        return false;
    }
    
}
