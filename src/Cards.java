import java.util.Objects;

public class Cards {

    private int number;

    private String suits;

    public Cards(int number, String suits){
        this.number = number;
        this.suits = suits;


    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getSuits() {
        return suits;
    }

    public void setSuits(String suits) {
        this.suits = suits;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cards cards = (Cards) o;
        return number == cards.number && suits.equals(cards.suits);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, suits);
    }
}
