
public class LAB2 {
    public static void main(String[] args) {
        //    65130500003
        try{
//            int[] list = new int[10];
//            System.out.println("list[10] is "+ list[10]);
            throw new Exception();
        }
        catch (ArithmeticException ex){
            System.out.println("ArithmeticException");
        }
        catch (RuntimeException ex){
            System.out.println("RuntimeException");
        }
        catch (Exception ex){
            System.out.println("Exception");
        }
    }
}
