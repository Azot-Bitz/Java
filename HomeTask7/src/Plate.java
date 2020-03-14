public class Plate {
    public int food;
    public Plate(int food) {
        this.food = food;
    }
    public boolean decreaseFood(int n) {
        if (food > n) {
            food -= n;
            return true;
        } else if (n > food) {
            System.out.println("Кот не стал есть.");
        }else if(food == n){
            food = 0;
            System.out.println("Еда закончилась.");
            return true;
        }
        return false;
    }



    public void info() {
        System.out.println("plate: " + food);
    }

    public void addFood(int j){
        food = food + j;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }
}

