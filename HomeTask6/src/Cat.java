import static java.lang.System.*;

public class Cat extends Animal {
    String color;

    public Cat(String name, String color, String breed) {
        this.name = name;
        this.color = color;
        this.breed = breed;
    }
    @Override
    public boolean run (int length, String breed){
        this.length = length;
        this.breed = breed;
        if (breed == "Шотландский Вислоухий" && length < 170 || breed == "Мейкун" && length < 200
                || breed == "Персидский" && length < 120) {
            out.println("Cat: " + breed + " run:" + true);
            return true;
        } else {
            out.println("Cat: " + breed + " run:" + false);
            return false;
        }
    }
    @Override
    public boolean jump (double height, String breed){
        this.height = height;
        this.breed = breed;
        if (breed == "Шотландский Вислоухий" && height < 1.8 || breed == "Мейкун" && height < 2.0
                || breed == "Персидский" && height < 1.1) {
            out.println("Cat: " + breed + " jump:" + true);
            return true;
        } else {
            out.println("Cat: " + breed + " jump:" + false);
            return false;
        }
    }
    @Override
    public boolean swim (int length, String breed){
        this.length = length;
        this.breed = breed;
        out.println("Cat:" + breed + " swim:" + false);
        return false;
    }
}
