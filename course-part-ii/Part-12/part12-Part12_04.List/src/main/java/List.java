

public class List<Type> {
    private Type[] values;
    private int firstFreeIndex;

    //initializes a new array of Object type with 10 slots
    //when constructor is invoked will typecast the array type to match the object type defined
    public List() {
        this.values = (Type[]) new Object[10];
        this.firstFreeIndex = 0;
    }

    // checks if the firstfreeindex is equal to the size of the array
    // if yes will call the grow method to expand the array
    // if not then it will add the item and increment the firstfreeindex variable
    public void add(Type value) {
        if(this.firstFreeIndex == this.values.length) {
            grow();
        }

        this.values[this.firstFreeIndex] = value;
        this.firstFreeIndex++;
    }

    // checks if the current index is valid, if not returns nothing
    // if valid, removes the item and shifts all the rightside elements by one to the left 
    public void remove(Type value) {
        int indexOfValue = indexOfValue(value);
        if (indexOfValue < 0) {
            return; // not found
        }

        moveToTheLeft(indexOfValue);
        this.firstFreeIndex--;
    }


    // iterates through the array and checks if it contains the item queried
    // if it does it return true else it returns false
    public boolean contains(Type value) {
        for (int i = 0; i < this.firstFreeIndex; i++) {
            if (this.values[i].equals(value)) {
                return true;
            }
        }

        return false;
    }

    // checks if the index is valid, if not retuns exception
    // if valid returns the element from the index
    public Type value(int index) {
        if (index < 0 || index >= this.firstFreeIndex) {
            throw new ArrayIndexOutOfBoundsException("Index " + index + " outside of [0, " + this.firstFreeIndex + "]");
        }

        return this.values[index];
    }

    // returns the current array size
    public int size() {
        return this.firstFreeIndex;
    }


    // creates a new size variable by adding the current size with the current size divided by two
    // initializes a new array with the new size
    // copies all the items to the new array
    // sets the current array to the new array with new size
    private void grow() {
        int newSize = this.values.length + this.values.length / 2;
        Type[] newValues = (Type[]) new Object[newSize];
        
        for (int i = 0; i < this.values.length; i++) {
            newValues[i] = this.values[i];
        }

        this.values = newValues;
    }

    // checks if the queried element exists in the array by iterating
    // if found returns the index, if not returns -1
    public int indexOfValue(Type value) {
        for (int i = 0; i < this.firstFreeIndex; i++) {
            if (this.values[i].equals(value)) {
                return i;
            }
        }

        return -1;
    }

    // shifts the array from the specified index by one to the left
    private void moveToTheLeft(int fromIndex) {
        for (int i = fromIndex; i < this.firstFreeIndex - 1; i++) {
            this.values[i] = this.values[i + 1];
        }
    }


}
