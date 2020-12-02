package com.company.health;

import java.util.Scanner;

/**
 * Created by brendanfitzpatrick on 02/12/2020
 * UPDATE COMMENTS ABOUT PROGRAM HERE
 **/
public class UltraHeatlh
{
   final int TERMINATOR = 5;

   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      boolean cont = true;
      int menuChoice;
      System.out.print("Welcome to Ultra Health, Please choose from the options below");

      while (cont)
      {

         do
         {
            System.out.println("1. Body Mass index(BMI) ");
            System.out.println("2. Max Heart Rate ");
            System.out.println("3. Basal Metabolic Rate(BMR) ");
            System.out.println("4. Sleep Average");
            System.out.println("5. Exit");


            menuChoice = keyboard.nextInt();
         }

         while (menuChoice != 1 & menuChoice != 2 & menuChoice != 3 & menuChoice != 4);

      }
      switch (menuChoice)
      {
         case 1:
            

            break;
         case 2:
            System.out.println("2. Find square root \n\n");
            break;
         case 3:

            System.out.println("3. Test if Odd or Evan \n\n");
            break;
         default:
            System.out.println("Are you sure you want to exit? Y/N \n\n");
            menuChoice2 = keyboard.next().toUpperCase();

            if ("Y".equals(menuChoice2))
            {
               cont = false;
               break;
            } else
            {
               cont = true;
            }


   }//main
}//class
