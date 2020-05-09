import java.util.ArrayList;

public class Main {
    public static void main(String args[]) {

        ArrayList<String> inBOX = new ArrayList<>();

        inBOX.add("bob");
        inBOX.add("korobka");
        inBOX.add("ball");
        inBOX.add("Goroshok");

        inBOX.size();
        System.out.println("In box "+inBOX.size() + " items");
        System.out.println(" ");

        inBOX.set(3, "Kaka");
        inBOX.remove(2);

        inBOX.size();
        System.out.println("In box "+inBOX.size() + " items");
        System.out.println(" ");

        for (String item : inBOX) {
            System.out.println("In box: " + item);
        }
        inBOX.clear();

        inBOX.size();
        System.out.println("In box "+inBOX.size() + " items");
        System.out.println(" ");

    }
}
