package Tesda.Task3;

public class Task3 {
    public static void main(String[] args) {
        // String a = new String("Wow");
        String a = "Wow";
        String b = "Wow";
        // String c = a;
        String c = new String("Kahit Ano nyahahaha.");
        // String d = c;
        String d = new String("Wow!");

        boolean b1 = a == b;
        boolean b2 = d.equals(b + "!");
        boolean b3 = !c.equals(a);

        if (b1 && b2 && b3) {
            System.out.println("Success!");
        }
    }
}
