package com.company.health;

import java.util.Scanner;

/**
 * Created by brendanfitzpatrick on 02/12/2020
 * UPDATE COMMENTS ABOUT PROGRAM HERE
 **/
public class UltraHealth
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      boolean cont = true;
      int menuChoice = 0;
      String exit;
      System.out.print("Welcome to Ultra Health, Please choose from the options below:\n\n");

      while (cont)
      {

         do
         {
            System.out.println("1. Body Mass index(BMI) ");
            System.out.println("2. Max Heart Rate ");
            System.out.println("3. Basal Metabolic Rate(BMR) ");
            System.out.println("4. Sleep Average");
            System.out.println("5. Exit\n");

            System.out.print("Please enter choice: ");
            menuChoice = keyboard.nextInt();
         }

         while (menuChoice != 1 & menuChoice != 2 & menuChoice != 3 & menuChoice != 4 & menuChoice !=5);

         switch (menuChoice)
         {
            case 1:
               BMI myBMI = new BMI(0.0, 0.0, 0, 0);
               myBMI.calculateBMI();
               System.out.println(myBMI.toString());
               System.out.println("");
               break;
            case 2:
               HeartRate myHeartRate = new HeartRate("",0);
               myHeartRate.promptDetails();
               System.out.println(myHeartRate.toString());
               break;
            case 3:

               //BMR
               break;

            case 4:
               SleepAverage mySleepAverage = new SleepAverage(0, 0, 0);
               break;
            case 5:
               System.out.println("Are you sure you want to exit? Y/N \n\n");
               exit = keyboard.nextLine();
               if ("Y".equals(exit))
               {
                  cont = false;
               } else
               {
                  cont = true;
               }
         }
      }

      }//main
   }//class