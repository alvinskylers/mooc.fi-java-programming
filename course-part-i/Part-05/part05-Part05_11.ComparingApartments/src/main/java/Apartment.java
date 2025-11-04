
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }


    public int getSquares() {
        return this.squares;
    }

    public int getPricePerSquare() {
        return this.pricePerSquare;
    }
    
    public boolean largerThan(Apartment compared) {
        return this.squares > compared.getSquares();
    }

    public int priceDifference(Apartment compared) {
        int apt = (this.pricePerSquare * this.squares);
        int anotherApt =(compared.getPricePerSquare() * compared.getSquares()); 
        return apt > anotherApt ? apt - anotherApt : anotherApt - apt;
    }

    public boolean moreExpensiveThan(Apartment compared) {
        int apt = (this.pricePerSquare * this.squares);
        int anotherApt =(compared.getPricePerSquare() * compared.getSquares());
        return apt > anotherApt;
    }

}
