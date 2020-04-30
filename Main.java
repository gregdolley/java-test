public class Main {
     public static void main(final String[] args) throws Exception {
          System.out.println("Hello World!");
          final Object theUnsafe = Class.forName("jdk.internal.misc.Unsafe").getMethod("getUnsafe").invoke(null);

          if(theUnsafe != null) {
               System.out.println("Reflection object is not null.");
          }

          System.out.println("Done!");
     }

     @Override
     public String toString() {
          return "Main []";
     }
}