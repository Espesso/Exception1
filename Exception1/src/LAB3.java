public class LAB3 {
    public static void main(String[] args) {
        //    65130500003

        try {
            System.out.println("Statement 1");
            System.out.println(1 / 0);
//            System.out.println("Statement 2");

            System.out.println("Statement 3");

        } catch (ArrayIndexOutOfBoundsException e) {

        } finally {
            System.out.println("Statement 4");
        }
        System.out.println("Steatment 5");
    }
}
