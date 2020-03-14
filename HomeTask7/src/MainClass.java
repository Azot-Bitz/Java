public class MainClass {
    public static void main(String[] args) {
        Cat [] catArr = new Cat[5];
        catArr[0] = new Cat("Barsik", 10);
        catArr[1] = new Cat("Golod", 30);
        catArr[2] = new Cat("Richard", 20);
        catArr[3] = new Cat("Molly", 10);
        catArr[4] = new Cat("Dollar", 40);
        Plate plate = new Plate(100);
        plate.info();
        catArr[0].eat(plate);
       // plate.setFood(plate.getFood() - cat.getAppetite());
        plate.info();
        catArr[1].eat(plate);
        plate.info();
        catArr[2].eat(plate);
        plate.info();
        catArr[3].eat(plate);
        plate.info();
        catArr[4].eat(plate);
        plate.info();
        plate.addFood(40);
        plate.info();
    }
}

