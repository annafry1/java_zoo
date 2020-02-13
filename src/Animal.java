public class Animal {
    // Put your properties here
    private String name;
    private String favoriteFood;
    static int pop;


    public Animal(String name, String favoriteFood) {
        this.name = name;
        this.favoriteFood = favoriteFood;
        pop ++;

    }

    public static int getPop() {
        return pop;
    }

    public String getName() {
        return name;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void sleep() {
        // complete your sleep function here, noting the change from global to properties
        System.out.println(this.name + " sleeps for 8 hours. ");
    }

    public void eat(String food) {
        // complete your eat function here!
        System.out.println(this.name + " eats " + food + ". ");
        if (food.equals(favoriteFood)){
            System.out.println("YUM!!! " + this.name + " wants more " + food + ". ");
        }else{
            sleep();
        }
    }
}
