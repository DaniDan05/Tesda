public class Gorilla implements Animal {
    // put gorilla food into cage
    public boolean feed(boolean timeToEat) {
        System.out.println("put gorilla food into cage");
        return timeToEat;
    }
    // lather, rinse, repeat
    public void groom() {
        System.out.println("lather, rinse, repeat");
    }
    // pet at your own risk
    public void pet() {
        System.out.println("pet at your own risk");
    }
    
    public static void main(String[] args) {
        Gorilla kingkonGorilla = new Gorilla();

        System.out.println("Return value: " + kingkonGorilla.feed(true));
        kingkonGorilla.groom();
        kingkonGorilla.pet();
    }
}