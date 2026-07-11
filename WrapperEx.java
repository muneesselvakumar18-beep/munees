
public class WrapperEx {
   public WrapperEx() {
   }

   public static void main(String[] args) {
      byte var1 = 100;
      Integer var2 = Integer.valueOf(var1);
      var2 = 200;
      int var3 = var2;
      int var4 = var2;
      System.out.println(var3);
      System.out.println(var4);
   }
}
    

