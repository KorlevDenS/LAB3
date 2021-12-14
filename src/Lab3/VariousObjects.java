package Lab3;

public enum VariousObjects {
    ENTERTAINMENT("какое-ниюудь развлечение"),
    SONGS("все песенки"),
    RIDDLES("все загадки"),
    SAYINGS("поговорки"),
    PROVERBS("пословицы"),
    All_FRIENDS("всех друзей и знакомых"),
    LIFE_CASES("разные случаи из своей жизни"),
    ROCKET("ракете"),
    BRIDGE("мостом");

    private String str;
    VariousObjects(String str){
        this.str = str;
    }

    public String getValue(){
        return str;
    }

}
