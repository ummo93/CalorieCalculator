package caloriecalc;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BreakfastIO {

   private static final Scanner cc = new Scanner(System.in);
   private static final Scanner cc1 = new Scanner(System.in);
   public static String FirstBrFoodName;
   public static String SecondBrFoodName;
   public int FirstBrFoodCal;
   public int SecondBrFoodCal;
   public static int sum2 = 0;
   public static String sumName2 = "";


   protected BreakfastIO() {
      System.out.println("Введите число съеденных вами продуктов: ");

      try {
         Scanner e = new Scanner(System.in);
         int cc0 = e.nextInt();
         if(cc0 > 10) {
            System.out.println("Превышен лимит количества продуктов, количество еды установлено \'10\'");
            cc0 = 10;
         }

         for(int breakfast = 0; breakfast < cc0; ++breakfast) {
            System.out.println("Введите название вашей " + (breakfast + 1) + "-й " + "еды на завтрак");
            if(cc.hasNextLine()) {
               this.firstBrFoodName(cc.nextLine());
            }

            System.out.println("Введите калораж вашей " + (breakfast + 1) + "-й " + "еды на завтрак");
            if(cc1.hasNextInt()) {
               this.firstBrFoodCal(cc1.nextInt());
            }

            sum2 += this.FirstBrFoodCal;
            sumName2 = sumName2 + "\n" + FirstBrFoodName;
         }
      } catch (InputMismatchException var4) {
         System.out.println("Вы ввели неверный символ, введите ещё раз:");
         new Scanner(System.in);
         new BreakfastIO();
         System.out.println("Общий калораж сейчас: " + sum2);
      }

   }

   public void firstBrFoodName(String FirstBrFoodName) {
      this.FirstBrFoodName = FirstBrFoodName;
   }

   public void firstBrFoodCal(int FirstBrFoodCal) {
      this.FirstBrFoodCal = FirstBrFoodCal;
   }

}
