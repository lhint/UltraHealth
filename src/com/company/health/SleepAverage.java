package com.company.health;
import java.util.Scanner;

/**
 * Created by brendanfitzpatrick on 29/11/2020
 * UPDATE COMMENTS ABOUT PROGRAM HERE
 **/
public class SleepAverage extends Health
{
   final static int daysInWeek = 7;
   public int hoursSlept;
   public int minutesSlept;
   public int weeklySleepAverage;

   public SleepAverage(int hours, int age)
   {
      personAge = age;
      hoursSlept = hours;
   }// default constructor

   //Setters
   public void setHoursSlept(int hours)
   {
      hoursSlept = hours;
   }// set hours slept

   public void setAge (int age)
   {
      personAge = age;
   }

   //Getters
   public int getHoursSlept()
   {
      return hoursSlept;
   }

   public int getPersonAge() {
      return personAge;
   }

   public void prompt()
   {
      for (int count = 0; count < 7; count++)
      {
         System.out.print("How many hours did you sleep on day " + (count+1) + ":");
         Scanner keyboard = new Scanner(System.in);
         weeklySleepAverage = keyboard.nextInt();

         //Store values in an array? Then add up in calculate method.
      }
   }

   public int calculate(int weeklySleepAverage)
   {
      //Calculate day hours (from array) to weekly and return total.
      return 0;
   }

   public String sleepComparison(int age) //Pass total and age to check
   {
         if (age <= 17 && weeklySleepAverage == 63) //&& weeklySleepAverage <= 45
         {
            return ("You are sleeping the correct amount for your age");
         } else if (age<= 17 && weeklySleepAverage < 63)
         {
            return ("You are not sleeping enough for you age");

         } else if (age <= 17 && weeklySleepAverage > 63)
         {
            return ("You are sleeping to much for your age");
         } else if (age >= 18 && age <= 64 && weeklySleepAverage == 56)
         {
            return ("You are sleeping the correct amount for your age");
         } else if ((age >= 18 && age <= 25 && weeklySleepAverage < 56))
         {
            return ("You are not sleeping enough for you age");
         } else if (age >= 18 && age <= 25 && weeklySleepAverage > 56)
         {
            return ("You are sleeping to much for your age");
         } else if (age >= 65 && weeklySleepAverage == 49)
         {
            return ("You are sleeping the correct amount for your age");
         } else if (age >= 65 && weeklySleepAverage < 49)
         {
            return ("You are not sleeping enough for you age");
         } else if (age >= 65 && weeklySleepAverage > 49)
         {
            return ("You are sleeping to much for your age");
         } else
            {
               return ("Please enter valid age!");
            }

   }//Sleep Comparison

   public String toString()
   {
      return (sleepComparison(personAge) + "\n");
   }//toString
}//Class

