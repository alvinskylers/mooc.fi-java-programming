import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Hand implements Comparable<Hand> {
    
    private List<Card> cards;

    public Hand() {
        this.cards = new ArrayList<>();
    }

    public void add(Card card) {
        this.cards.add(card);
    }

    public void print() {
        Iterator<Card> iterator = cards.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void sort() {
        Collections.sort(cards);
        cards.forEach(card -> System.out.println(card));
    }

    @Override
    public int compareTo(Hand hand) {
        int thisValue = this.cards.stream()
            .mapToInt(Card::getValue)
            .sum();

        int cardValue = hand.cards.stream()
            .mapToInt(Card::getValue)
            .sum();

        if (thisValue > cardValue)
            return 1;
        else if (thisValue < cardValue)
            return -1;
        else
            return 0;
    }
}
