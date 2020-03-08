public abstract class Animal {
    int length;
    double height;
    String name;
    String breed;

    public abstract boolean run (int length, String breed);

    public abstract boolean jump (double height, String breed);
    public abstract boolean swim (int length, String breed);


}
