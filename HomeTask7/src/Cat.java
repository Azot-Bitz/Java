public class Cat {
    private String name;
    public int appetite;
    public boolean satiety = false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }
    public void eat(Plate p) {
        if(p.decreaseFood(appetite)){
            satiety = true;
            System.out.println(name + ": Сытость = true");
        }else{
            System.out.println(name + ": Сытость = false");
        }
    }

    public int getAppetite() {
        return appetite;
    }
}

