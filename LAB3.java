public class LAB3 {
    public static void main(String[] args) {
        int[] list = new int[10];
        try {
            System.out.println("Statement 1");
            System.out.println("list[10] is "+ list[10]);
//            System.out.println("Statement 2");
//            throw new ArithmeticException();

            System.out.println("Statement 3");
        }
        catch (Exception e){

        }
        finally {
            System.out.println("Statement 4");
        }
        System.out.println("Steatment 5");
    }
}
