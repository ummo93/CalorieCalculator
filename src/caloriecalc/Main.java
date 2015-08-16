package caloriecalc;

import caloriecalc.BreakfastIO;
import caloriecalc.DinnerIO;
import caloriecalc.FileWorker;
import caloriecalc.LanchIO;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

   static final Scanner sc0 = new Scanner(System.in);
   static final Scanner sc = new Scanner(System.in);
   static final Scanner sc1 = new Scanner(System.in);
   static final Scanner sc2 = new Scanner(System.in);
   static final Scanner scc = new Scanner(System.in);
   static final Scanner InputDate = new Scanner(System.in);
   public static String date;


   public static void main(String[] args) throws FileNotFoundException {
       
      System.out.println("Эта программа позволяет рассчитать количество "
              + "каллорий съеденных вами за день.\n День условно делиться на 3 "
              + "этапа:\n - Завтрак,\n - Обед,\n - Ужин.\n Вы должны ввести "
              + "каждый из приёмов пищи за каждый этап.\n "
              + "Если вы ничего не ели в какой-то этап, выберите его "
              + "и введите \'0\', когда вас спросят кол-во съеденных "
              + "продуктов.\n Когда будете готовы начать, нажмите любую "
              + "клавишу:");
      
      sc0.nextLine();
      System.out.println("Введите текущую дату в формате dd.mm.yy: ");
      userInputDate();
      userChoose1Processing();
      int Accumulator = DinnerIO.sum1 + BreakfastIO.sum2 + LanchIO.sum;
      String List = "\n" + LanchIO.sumName + "\n" + DinnerIO.sumName1 + "\n" 
              + BreakfastIO.sumName2;
      System.out.println("\nВсего на " + date + " было съедено: " + List);
      System.out.println("\nОбщий калораж за день составил: " + Accumulator 
              + " (Ккал)");
      String text = "\nВсего на " + date + " было съедено: " + List + "\n" 
              + "\nОбщий калораж за день составил: " + Accumulator + " (Ккал)";
      System.out.println("\nХотите сохранить отчёт? Если да, нажмите "
              + "Y или N, чтобы отказаться");
      String Choose1 = sc1.nextLine();
      if(Choose1.matches("(?i).*[Yy].*")) {
         System.out.println("\nУкажите папку, куда сохранить файл в "
                 + "формате \'\'C:/Program Files/\'\'");
         String DirChoose = sc2.nextLine();
         String fileName = DirChoose + date + ".txt";
         FileWorker.write(fileName, text);
      } else {
         System.out.println("До скорой встречи!");
      }

   }

   public static void userInputDate() {
      date = InputDate.nextLine();
      if(date.matches("(?i).*[/*].*")) {
         System.out.println("\nВы ввели недопустимый символ, дата будет "
                 + "= \'Test\'\n");
         date = "Test";
      }

   }

   public static void userChoose1Processing() {
      for(int i = 0; i < 3; ++i) {
         System.out.println("\nКакой приём пищи вы хотите ввести?"
                 + "\n 1 - завтрак, 2 - обед, 3 - ужин.\n\nУ вас есть " 
                 + (3 - i) + " попытки(-ка)");
         int choose = sc.nextInt();
         if(choose == 1) {
            new BreakfastIO();
         } else if(choose == 2) {
            new LanchIO();
         } else if(choose == 3) {
            new DinnerIO();
         } else {
            System.out.println("\nВы ввели неверный символ,у вас осталось " 
                    + (2 - i) + " попыток:\n");
            
            }
        }
    }
}
