package Lab3;

public class Character extends Human implements Likeable {

    public Character(String Name) {
        this.Name = Name;
    }

    public void like(Doings verb) {
        System.out.println(Name + " очень любил " + verb.getValue());
    }

    @Override
    public void sit(VariousObjects obj) {
        System.out.println(Name + " по прежнему сидит в " + obj.getValue() );
    }
}
