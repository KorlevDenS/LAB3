import Lab3.*;
import Lab3.MainCharacterFriend;

public class Main {
    public static void main(String[] args) {
        MainCharacter Dunno = new MainCharacter("Незнайка", 135.5, 20);
        MainCharacterFriend Donut = new MainCharacterFriend("Пончик", 140.2);
        System.out.println(Dunno.sitUnderBridge(new Bridge(300.5, 400.2, BridgeMaterials.STEEL)));
        Dunno.reactToSituation(new LifeCase("сел", "под мост", 2021, 12, 25, DunnoEmotions.STRIVE));
        System.out.println(Dunno.strainMind());
        System.out.println(Dunno.know(new Song("Чика", "Артур Пирожков")));
        System.out.println(Dunno.sing(new Song("Чика", "Артур Пирожков")));
        Riddle riddle1 = new Riddle("У него два горба, В них и пища и вода", "Верблюд");
        System.out.println(Dunno.makeARiddle(DunnoRiddles.RIDDLE4));
        System.out.println(Dunno.solveARiddle(riddle1,"Конь"));
        Folklore proverb1 = new Folklore(DunnoFolklore.PROVERB3.getDescription());
        System.out.println(Dunno.tryToRememberSth(proverb1));
        LifeCase jump = new LifeCase("прыжок с парашютом", "Италия", 2014, 8, 8, DunnoEmotions.AFRAID);
        Dunno.knowledge.add(jump);
        System.out.println(Dunno.tryToRememberSth(jump));
        System.out.println(Dunno.tryToRememberSth(Donut));
        String situation = Donut.sitIntoRocket(new Rocket(2000, 1000, 153.4));
        System.out.println(Dunno.imagine(situation, "космос", 2021, 12, 25, DunnoEmotions.BORING));
        Dunno.reactToSituation(new LifeCase("не может помочь другу", "под мостом", 2021,
                12, 25, DunnoEmotions.GRIEVE));
        System.out.println(Donut.likeDoingSth(new Entertainment(EntertainmentTypes.EAT)));
    }
}