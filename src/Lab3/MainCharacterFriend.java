package Lab3;

public class MainCharacterFriend extends Human implements Likeable {

    public MainCharacterFriend(String Name, Double Height) {
        super(Name, Height);
    }

    public String sitIntoRocket(Rocket rocket) {
        if (rocket.getCondition().equals("Ракета стоит на месте")) {
            if (rocket.maxPassengerHeight >= this.Height)
                return Name + " сел в ракету";
            else return Name + " не поместился в ракету";
        } else {
            return " Посадка невозможна, ракета в полёте";
        }
    }

    public String likeDoingSth(Entertainment entertainment) {
        return Name +  " любит " + entertainment.getDescription();
    }
}
