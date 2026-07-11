public class Switch {
   public Switch() {
   }

   public static void main(String[] var0) {
      byte var1 = 2;
      switch (var1) {
         case 1 -> System.out.println("First case");
         case 2 -> System.out.println("Second case");
         case 3 -> System.out.println("Third case");
         default -> System.out.println("Default case");
      }

   }
}