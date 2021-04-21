package abstraction.cardsWithPower;

public enum Suit {
    CLUBS(0, "CLUBS"),
    DIAMONDS(13, "DIAMONDS"),
    HEARTS(26, "HEARTS"),
    SPADES(39, "SPADES");
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
