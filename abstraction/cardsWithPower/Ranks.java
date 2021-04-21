package abstraction.cardsWithPower;

public enum Ranks {
    ACE(14,"ACE"),
    TWO(2,"TWO"),
    THREE(3,"THREE"),
    FOUR(4,"FOUR"),
    FIVE(5,"FIVE"),
    SIX(6,"SIX"),
    SEVEN(7,"SEVEN"),
    EIGHT(8,"EIGHT"),
    NINE(9,"NINE"),
    TEN(10,"TEN"),
    JACK(11,"JACK"),
    QUEEN(12,"QUEEN"),
    KING(13,"KING");

    private int value;
    private String name;

    Ranks(int value, String name) {
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
