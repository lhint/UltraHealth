package com.company.health;
import java.util.Scanner;

/**
 * Created by brendanfitzpatrick on 29/11/2020
 * A programme too evaluate if the user is sleeping just enough, too much, or too little
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

         Scanner keyboard = new Scanner(System.in);

         //Array
         final int SIZE = 6;
         int[] daysInWeek = new int[SIZE];

         for (int index = 0; index < SIZE; index++)
         {
            System.out.print("How many hours did you sleep on day " + (index + 1) + ":");
            daysInWeek[index] = keyboard.nextInt();
         }

   }

   public int calculate(int [] daysInWeek)
   {
      //Calculate day hours (from array) to weekly and return total.
   weeklySleepAverage = daysInWeek[0] + daysInWeek[1] + daysInWeek[2] + daysInWeek[3] + daysInWeek[4] + daysInWeek[5] + daysInWeek[6] + daysInWeek[7];
      System.out.print(weeklySleepAverage);
   return weeklySleepAverage;
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
      return ("You have slept " + weeklySleepAverage + " " + sleepComparison(personAge) + "\n");
   }//toString
}//Class

