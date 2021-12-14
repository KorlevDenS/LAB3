package Lab3;

public enum ProverbsSayings {
    PROVERB1("\"Кому пироги да пышки, а нам синяки да шишки\""),
    PROVERB2("\"Слышит ухо, что не сыто брюхо\""),
    PROVERB3("\"Яков лаком, съел кошку с маком\"");

    private String phrase;
    ProverbsSayings(String phrase){
        this.phrase = phrase;
    }
    public String getValue(){
        return phrase;
    }
}
