public class Hideout<T> {
    private T object;

    public void putIntoHideout(T toHide) {
        object = toHide;
    }

    public T takeFromHideout() {
        if (object == null)
        return null;
        
        T tempObject = object;
        object = null;
        return tempObject;
    }

    public boolean isInHideout() {
        return !(object == null);
    }

    
}
