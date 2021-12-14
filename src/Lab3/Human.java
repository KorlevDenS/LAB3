package Lab3;

public abstract class Human implements Sitable{

    public String Name;

    public void sit(VariousObjects obj){}

    @Override
    public boolean equals(Object obj) {
        // быстрая проверка на идентичность
        if (this == obj) return true;
        // проверка на null явного параметра
        if (obj == null) return false;
        // проверка на совпадение классов
        if (this.getClass() != obj.getClass())
            return false;
        Human otherObj = (Human) obj;
        return Name.equals(otherObj.Name);
    }

    public int hashCode() {
        return this.Name.hashCode();
    }

    public String toString() {
        return getClass().getName()
                + "[name=" + Name
                + "]";
    }
}
