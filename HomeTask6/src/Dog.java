import static java.lang.System.out;

public class Dog extends Animal {
    String color;

    public Dog(String name, String color, String breed) {
        this.name = name;
        this.color = color;
        this.breed = breed;
    }

    @Override
    public boolean run(int length, String breed) {
        this.length = length;
        this.breed = breed;
        if (breed == "Джек Рассел Терьер" && length < 500 || breed == "Французский Бульдог" && length < 350
                || breed == "Русская Гончая" && length < 900) {
            out.println("Dog: " + breed + " run:" + true);
            return true;
        } else {
            out.println("Dog: " + breed + " run:" + false);
            return false;
        }
    }

    @Override
    public boolean jump(double height, String breed) {
        this.height = height;
        this.breed = breed;
        if (breed == "Джек Рассел Терьер" && height < 0.3 || breed == "Французский Бульдог" && height < 0.4
                || breed == "Русская Гончая" && height < 0.5) {
            out.println("Dog: " + breed + " jump:" + true);
            return true;
        } else {
            out.println("Dog: " + breed + " jump:" + false);
            return false;
        }
    }

    @Override
    public boolean swim(int length, String breed) {
        this.length = length;
        this.breed = breed;
        if (breed == "Джек Рассел Терьер" && length < 6 || breed == "Французский Бульдог" && length < 5
                || breed == "Русская Гончая" && length < 10) {
            out.println("Dog: " + breed + " swim:" + true);
            return true;
        } else {
            out.println("Dog: " + breed + " swim:" + false);
            return false;
        }
    }
}