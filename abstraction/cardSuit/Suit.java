package abstraction.cardSuit;

public enum Suit {
    CLUBS(0, "CLUBS"),
    DIAMONDS(1, "DIAMONDS"),
    HEARTS(2, "HEARTS"),
    SPADES(3, "SPADES");
    private int value;
    private String name;

    Suit(int value, String name) {
        this.name = name;
        this.value = value;

    }

    public String getName() {
        return name;
    }



    public int getValue() {

        return this.value;

    }


}
