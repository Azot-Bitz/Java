public class Ex1 {
    public static void main(String[] args) {
      Cat cat1 = new Cat("Барсик", "Белый", "Шотландский Вислоухий");
      Cat cat2 = new Cat("Мурзик", " Черный", "Персидский");
      Cat cat3 = new Cat("Мисса", "Коричневый", "Мейкун");
        Dog dog1 = new Dog("Джек", "Серый", "Джек Рассел Терьер");
        Dog dog2 = new Dog("Мистик", "Коричневый", "Французский Бульдог");
        Dog dog3 = new Dog("Фила", "Черный", "Русская Гончая");


        cat1.run(100, cat1.breed);
        cat2.run(150, cat2.breed);
        cat3.run(190, cat3.breed);
        cat1.jump(1.5, cat1.breed);
        cat2.jump(1.1, cat2.breed);
        cat3.jump(1.9, cat3.breed);
        cat1.swim(4, cat1.breed);
        cat2.swim(6, cat2.breed);
        cat3.swim(8, cat3.breed);



        dog1.run(200, dog1.breed);
        dog2.run(400, dog2.breed);
        dog3.run(700, dog3.breed);
        dog1.jump(0.2, dog1.breed);
        dog2.jump(0.2, dog2.breed);
        dog3.jump(0.7, dog3.breed);
        dog1.swim(4, dog1.breed);
        dog2.swim(6, dog2.breed);
        dog3.swim(8, dog3.breed);

    }
}


