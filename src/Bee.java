public class Bee extends Animal {
    public Bee (String name) {
        super(name, "pollen");
    }
// finish this
     public void eat(String food) {
            if (food.equals(this.getFavoriteFood())){
                System.out.println("YUM!!! " + this.getName() + " wants more " + food + ". ");
                sleep();
            }else{
                System.out.println("YUCK!!! " + this.getName() + " will not eat " + food + ". ");
            }
     }
    public void sleep() {
        System.out.println(this.getName() + " never sleeps. ");
    }
}
