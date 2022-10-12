import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;


public class Main {
    public static void main(String[] args) {

        Set<String> card = new HashSet<>();

        card.add("Spades");
        card.add("Hearts");
        card.add("Diamonds");
        card.add("Clubs");

        System.out.println(card.contains("Clubs"));
        System.out.println(card.size());

        // ser inte dubletter då de räknas som en
        Set<Cards> newCards = new HashSet<>();

        newCards.add(new Cards(2,"Hearts"));
        newCards.add(new Cards(3,"Hearts"));
        newCards.add(new Cards(4,"Hearts"));
        newCards.add(new Cards(5,"Hearts"));
        newCards.add(new Cards(6,"Hearts"));
        newCards.add(new Cards(7,"Hearts"));
        newCards.add(new Cards(8,"Hearts"));
        newCards.add(new Cards(9,"Hearts"));
        newCards.add(new Cards(10,"Hearts"));
        newCards.add(new Cards(2,"Spades"));
        newCards.add(new Cards(3,"Spades"));
        newCards.add(new Cards(4,"Spades"));
        newCards.add(new Cards(5,"Spades"));
        newCards.add(new Cards(6,"Spades"));
        newCards.add(new Cards(7,"Spades"));
        newCards.add(new Cards(8,"Spades"));
        newCards.add(new Cards(9,"Spades"));
        newCards.add(new Cards(10,"Spades"));
        newCards.add(new Cards(2,"Diamonds"));
        newCards.add(new Cards(3,"Diamonds"));
        newCards.add(new Cards(4,"Diamonds"));
        newCards.add(new Cards(5,"Diamonds"));
        newCards.add(new Cards(6,"Diamonds"));
        newCards.add(new Cards(7,"Diamonds"));
        newCards.add(new Cards(8,"Diamonds"));
        newCards.add(new Cards(9,"Diamonds"));
        newCards.add(new Cards(10,"Diamonds"));
        newCards.add(new Cards(2,"Clubs"));
        newCards.add(new Cards(3,"Clubs"));
        newCards.add(new Cards(4,"Clubs"));
        newCards.add(new Cards(5,"Clubs"));
        newCards.add(new Cards(6,"Clubs"));
        newCards.add(new Cards(7,"Clubs"));
        newCards.add(new Cards(8,"Clubs"));
        newCards.add(new Cards(9,"Clubs"));
        newCards.add(new Cards(10,"Clubs"));

        System.out.println(newCards.contains(new Cards(4, "Hearts")));
        System.out.println(newCards.size());









    }
}