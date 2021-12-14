import Lab3.*;
import Lab3.Character;

public class Main {
    public static void main(String[] args) {
        MainCharacter Dunno = new MainCharacter("Незнайка");
        Character Donut = new Character("Пончик");
        Dunno.sit(VariousObjects.BRIDGE);
        Dunno.strainMind(VariousObjects.ENTERTAINMENT, Doings.INVENT);
        Dunno.sing(VariousObjects.SONGS);
        Dunno.makeWish(VariousObjects.RIDDLES);
        Dunno.solve(VariousObjects.RIDDLES);
        Dunno.rememberProverb(ProverbsSayings.PROVERB1);
        Dunno.rememberProverb(ProverbsSayings.PROVERB2);
        Dunno.rememberProverb(ProverbsSayings.PROVERB3);
        Dunno.startRemembering(VariousObjects.LIFE_CASES);
        Dunno.startRemembering(VariousObjects.All_FRIENDS);
        Dunno.remember(Donut);
        Dunno.imagine();
        Donut.sit(VariousObjects.ROCKET);
        Dunno.cannotHelp(Doings.HElP);
        Dunno.remember();
        Donut.like(Doings.MEAL);
    }
}
