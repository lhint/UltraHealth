package com.company.health;
import java.util.Scanner;

/**
 * Created by brendanfitzpatrick on 29/11/2020
 * A programme too evaluate if the user is sleeping just enough, too much, or too little
 **/
public class SleepAverage extends Health
{
   public final int SIZE = 7;
   public int hoursSlept;
   public int minutesSlept;
   public int weeklySleepAverage;
   int[] daysInWeek = new int[SIZE];


   public SleepAverage(String name, int age, int hours)
   {

      super(name,age);
      hoursSlept = hours;
   }// default constructor

   //Setters
   public void setHoursSlept(int hours)
   {
      hoursSlept = hours;
   }// set hours slept

   //Getters
   public int getHoursSlept()
   {
      return hoursSlept;
   }

   public void prompt()
   {
         Scanner keyboard = new Scanner(System.in);
         //Name
         System.out.print("Please enter name: ");
         personName = keyboard.nextLine();

         //Age
         System.out.print("Please enter age: ");
         personAge = keyboard.nextInt();

         //Array for hours slept
         for (int index = 0; index < SIZE; index++)
         {
            System.out.print("How many hours did you sleep on day " + (index + 1) + ":");
            daysInWeek[index] = keyboard.nextInt();
         }
   }

   public int calculate()
   {

      //Calculate day hours (from array) to weekly and return total.
      for (int index = 0; index < daysInWeek.length; index++)
      {
         weeklySleepAverage = weeklySleepAverage + daysInWeek[index];
      }
      return weeklySleepAverage;
   }

   public String sleepComparison(int age, int weeklySleepAverage) //Check this if statements are correct.
   {

      //May need to do if statements for age and then a nested if for weeklySleepAverage.
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
         } else //Need to add an exception if no age is entered or if the person has slept under the average. Check the statements.
            {
               return ("Please enter valid age!");
            }

   }//Sleep Comparison

   public String toString()
   {
      return (personName + " have slept " + weeklySleepAverage + " hours, " + sleepComparison(personAge, weeklySleepAverage) + "\n");
   }//toString
}//Class

