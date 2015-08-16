package caloriecalc;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LanchIO {

   private static final Scanner bc = new Scanner(System.in);
   private static final Scanner bc1 = new Scanner(System.in);
   public static String FirstLaFoodName;
   public static String SecondLaFoodName;
   public int FirstLaFoodCal;
   public int SecondLaFoodCal;
   public static int sum = 0;
   public static String sumName = "";


   protected LanchIO() {
      System.out.println("Введите число съеденных вами продуктов: ");

      try {
         Scanner e = new Scanner(System.in);
         int bc0 = e.nextInt();
         if(bc0 > 10) {
            System.out.println("Превышен лимит количества продуктов, количество еды установлено \'10\'");
            bc0 = 10;
         }

         for(int lanch = 0; lanch < bc0; ++lanch) {
            System.out.println("Введите название вашей " + (lanch + 1) + "-й " + "еды на обед");
            if(bc.hasNextLine()) {
               this.firstLaFoodName(bc.nextLine());
            }

            System.out.println("Введите калораж вашей " + (lanch + 1) + "-й " + "еды на обед");
            if(bc1.hasNextInt()) {
               this.firstLaFoodCal(bc1.nextInt());
            }

            sum += this.FirstLaFoodCal;
            sumName = sumName + "\n" + FirstLaFoodName;
         }
      } catch (InputMismatchException var4) {
         System.out.println("Вы ввели неверный символ, введите ещё раз:");
         new Scanner(System.in);
         new LanchIO();
         System.out.println("Общий калораж сейчас: " + sum);
      }

   }

   public void firstLaFoodName(String FirstLaFoodName) {
      this.FirstLaFoodName = FirstLaFoodName;
   }

   public void firstLaFoodCal(int FirstLaFoodCal) {
      this.FirstLaFoodCal = FirstLaFoodCal;
   }

}
