package caloriecalc;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DinnerIO {

   private static final Scanner lc = new Scanner(System.in);
   private static final Scanner lc1 = new Scanner(System.in);
   public static String FirstDiFoodName;
   public static String SecondDiFoodName;
   public int FirstDiFoodCal;
   public int SecondDiFoodCal;
   public static int sum1 = 0;
   public static String sumName1 = "";


   protected DinnerIO() {
      System.out.println("Введите число съеденных вами продуктов: ");

      try {
         Scanner e = new Scanner(System.in);
         int lc0 = e.nextInt();
         if(lc0 > 10) {
            System.out.println("Превышен лимит количества продуктов, количество еды установлено \'10\'");
            lc0 = 10;
         }

         for(int dinner = 0; dinner < lc0; ++dinner) {
            System.out.println("Введите название вашей " + (dinner + 1) + "-й " + "еды на ужин");
            if(lc.hasNextLine()) {
               this.firstDiFoodName(lc.nextLine());
            }

            System.out.println("Введите калораж вашей " + (dinner + 1) + "-й " + "еды на ужин");
            if(lc1.hasNextInt()) {
               this.firstDiFoodCal(lc1.nextInt());
            }

            sum1 += this.FirstDiFoodCal;
            sumName1 = sumName1 + "\n" + FirstDiFoodName;
         }
      } catch (InputMismatchException var4) {
         System.out.println("Вы ввели неверный символ, введите ещё раз:");
         new Scanner(System.in);
         new DinnerIO();
         System.out.println("Общий калораж сейчас: " + sum1);
      }

   }

   public void firstDiFoodName(String FirstDiFoodName) {
      FirstDiFoodName = FirstDiFoodName;
   }

   public void firstDiFoodCal(int FirstDiFoodCal) {
      this.FirstDiFoodCal = FirstDiFoodCal;
   }

}
