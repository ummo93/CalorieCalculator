package caloriecalc;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWorker {

   public static void write(String fileName, String text) {
      File file = new File(fileName);

      try {
         if(!file.exists()) {
            file.createNewFile();
         }

         PrintWriter e = new PrintWriter(file.getAbsoluteFile());

         try {
            e.print(text);
         } finally {
            e.close();
         }

      } catch (IOException var8) {
         throw new RuntimeException(var8);
      }
   }
}
