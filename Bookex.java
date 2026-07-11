class Bookex {
   String title;
   String author;
   int year;

   Bookex(String var1, String var2) {
      this.title = var1;
      this.author = var2;
   }

   Bookex(String var1) {
      this.title = var1;
      this.author = "Unknown";
   }

   void display() {
      System.out.println("Title:" + this.title);
      System.out.println("Author:" + this.author);
   }
}
