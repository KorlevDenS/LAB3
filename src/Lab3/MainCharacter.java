package Lab3;

public class MainCharacter extends Human implements Thinkable, Singable {

    public  MainCharacter(String Name) {
        this.Name = Name;
    }

    public void startRemembering(VariousObjects obj) {
        System.out.println(Name + " принялся вспоминать " + obj.getValue());
    }

    public void rememberProverb(ProverbsSayings saying) {
        System.out.println(Name + " вспомнил пословицу " + saying.getValue());
    }

    public void remember() {
        System.out.println(Name + " вспомнил:");
    }

    public void remember(Character guy) {
        System.out.println(Name + " вспомнил о друге по имени " + guy.Name);
    }

    public void makeWish(VariousObjects obj){
        System.out.println(Name + " загадал " + obj.getValue() + know());
    }

    public void solve(VariousObjects obj) {
        System.out.println(Name + " разгадал " + obj.getValue());
    }

    public void strainMind(VariousObjects obj, Doings verb) {
        System.out.println(Name + " напряг свои умственные способности, чтобы "
                + verb.getValue() + " " + obj.getValue());
    }

    public String know(){
        return " которые знал ";
    }

    public void sing(VariousObjects obj) {
        System.out.println(Name + " спел " + obj.getValue() + know());
    }

    public void imagine() {
        System.out.println(Name + " воображал:");
    }

    public String grieve() {
        return  " горевал, что ";
    }

    public void cannotHelp(Doings verb) {
        System.out.println(Name + grieve() + "ничем не может " + verb.getValue());
    }

    @Override
    public void sit(VariousObjects obj) {
        System.out.println(Name + " в одиночестве сидел под" + obj.getValue());
    }

}
