public class Giraffe extends Animal{
    public Giraffe (String name) {
        super(name, "leaves");
    }
    public void eat(String food) {
        // complete your eat function here!
        if (food.equals(this.getFavoriteFood())){
            System.out.println("YUM!!! " + this.getName() + " wants more " + food + ". ");
            sleep();
        }else{
            System.out.println("YUCK!!! " + this.getName() + " will not eat " + food + ". ");
        }
    }
}
