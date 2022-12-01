public class testProgrammers {

    public static void main(String[] args) {

        Programmer programmer1 = new Programmer();
        Programmer programmer2 = new Programmer();

        programmer1.name = "Gigi";
        programmer1.age = 23;
        programmer1.wearsGlasses = false;

        programmer1.drinkCoffee();
        programmer1.printDetails();

        programmer2.name = "Luca";
        programmer2.age = 19;
        programmer2.wearsGlasses = true;

        programmer2.printDetails();
        programmer2.hasGlasses();

    }
}
