package DC;

public class DC61 {
    public static void main(String[] args) {
        try {
            int[] myInt = {1, 2, 3};
            System.out.println(myInt[2]);
        } catch (Exception e) {
            System.out.println("Error...");
        } finally {
            System.out.println("Finally, I am Done.");
        }
    }
}
