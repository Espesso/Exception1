public class LAB7 {
    // 65130500003
    public static void main(String[] args) {
        System.out.println("Main method call doThis()");
        try{
            doThis();
        }
        catch (Exception e){
            System.out.println("main method receive exception "+e.getMessage());
        }
    }
    public static void doThis() throws  Exception{
        System.out.println("Method doThis() call method doThat()");
        doThat();
    }
    public static void doThat() throws  Exception{

     throw new MyException("Hello My Exception");
    }
}
