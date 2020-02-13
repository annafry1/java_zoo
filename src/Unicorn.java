public class Unicorn extends Animal {
    public Unicorn(String name) {
        super(name, "marshmallows");
    }

    public void sleep() {
        System.out.println(this.getName() + " sleeps in a cloud. ");
    }

}
