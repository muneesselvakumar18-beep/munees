
    public class Expectiontask2 {
    public static void main(String[] args) {
        System.out.println("Program started");
        try{
            int result=10/0;
            System.out.println(result);
            int[] arr ={1,2,3,4};
            System.out.println(arr[5]);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Number cannot be divided by zero");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Index value greater than array size");
        }
       // catch(Exception e)
       // {
            //System.out.println(e.getMessage());
        //}
        finally{
            System.out.println("This is finally block");
        }
        System.out.println("Program ended");
    }
    
}
    

    

