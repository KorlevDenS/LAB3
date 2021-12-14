package Lab3;

public enum Doings {
    MEAL("покушать"),
    HElP("помочь"),
    INVENT("придумать");

    private String verb;
    Doings(String verb) {
        this.verb = verb;
    }

    public String getValue() {
        return verb;
    }
}
