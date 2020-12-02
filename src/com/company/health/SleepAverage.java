package com.company.health;

import java.util.Scanner;

/**
 * Created by brendanfitzpatrick on 29/11/2020
 * UPDATE COMMENTS ABOUT PROGRAM HERE
 **/
public class SleepAverage extends Health
{
   final static int daysInWeek = 7;
   protected int hoursSlept;
   protected int minutesSlept;

   public SleepAverage(int hours, int minutes, int age)
   {
      super(age);
      hoursSlept = hours;
      minutesSlept = minutes;
   }// default constructor

   public void setHoursSlept(int hours)
   {
      hoursSlept = hours;
   }// set hours slept

   public void setMinutesSlept(int minutes)
   {
      minutesSlept = minutes;
   }// set minutes slept

   public int getHoursSlept()
   {
      return hoursSlept;
   }

   public int getMinutesSlept()
   {
      return minutesSlept;
   }

   public void sleepComparison(int count) //Change return type to string?
   {
      Scanner keyboard = new Scanner(System.in);
      int number = 1;
      int weeklySleepAverage;
      int personAge = getPersonAge();

      for (count = 0; count < 7; count++)
      {

         System.out.print("How many hours did you sleep on day " + number++);
         weeklySleepAverage = keyboard.nextInt();
         //return weeklySleepAverage; //Return should be in the if statements

         if (personAge <= 17 && weeklySleepAverage == 63) //&& weeklySleepAverage <= 45
         {
            System.out.print("You are sleeping the correct amount for your age");
            //Maybe do return String instead and return the answer rather than the print statement then do a toString method to print answer?
         } else if (personAge <= 17 && weeklySleepAverage < 63)
         {
            System.out.print("You are not sleeping enough for you age");
            //if (weeklySleepAverage == 45) Might be best to do age if first then a nested statement to check the weeklySleepAverage?
            // {
         } else if (personAge <= 17 && weeklySleepAverage > 63)
         {
            System.out.print("You are sleeping to much for your age");
         }


         if (personAge >= 18 && personAge <= 64 && weeklySleepAverage == 56)
         {
            System.out.print("You are sleeping the correct amount for your age");
            // return ""
         } else if ((personAge >= 18 && personAge <= 25 && weeklySleepAverage < 56))
         {
            System.out.print("You are not sleeping enough for you age");
         } else if ((personAge >= 18 && personAge <= 25 && weeklySleepAverage > 56))
         {
            System.out.print("You are sleeping to much for your age");
         }

         if (personAge >= 65 && weeklySleepAverage == 49)
         {
            System.out.print("You are sleeping the correct amount for your age");
         } else if (personAge >= 65 && weeklySleepAverage < 49)
         {
            System.out.print("You are not sleeping enough for you age");
         } else if (personAge >= 65 && weeklySleepAverage > 49)
         {
            System.out.print("You are sleeping to much for your age");
         }


         // if (personAge < 25 && weeklySleepAverage == 45)
         //{
         //}
         //return 2; //Just to stop the program flagging an error. Can remove and replace with the returns in if statements.

      }//sleepComparison
   }
}//Class

