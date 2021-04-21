package abstraction.cardRank;

public enum Ranks {
    ACE(0,"ACE"),
    TWO(1,"TWO"),
    THREE(2,"THREE"),
    FOUR(3,"FOUR"),
    FIVE(4,"FIVE"),
    SIX(5,"SIX"),
    SEVEN(6,"SEVEN"),
    EIGHT(7,"EIGHT"),
    NINE(8,"NINE"),
    TEN(9,"TEN"),
    JACK(10,"JACK"),
    QUEEN(11,"QUEEN"),
    KING(12,"KING");

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
