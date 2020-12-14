package com.company.health;
import java.util.Scanner;

/**
 * Created by brendanfitzpatrick on 29/11/2020
 * A programme too evaluate if the user is sleeping just enough, too much, or too little per week
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
      System.out.print("Please enter age(7+): ");
      personAge = keyboard.nextInt();

      if (personAge < 7 || personAge > 122)
      {
         System.out.println("This is an invalid age");
      } else
      {
         //Array for hours slept
         for (int index = 0; index < SIZE; index++)
         {
            System.out.print("How many hours did you sleep on day " + (index + 1) + ":");
            daysInWeek[index] = keyboard.nextInt();
         }
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


      if (age < 7)
         return("Please enter a valid age for comparison");

      if (age  >= 7 && age <= 13)
      {
         switch(weeklySleepAverage)
         {
            case 63: case 64: case 65: case 67: case 68: case 69: case 70: case 71: case 72:
            case 73: case 74: case 75: case 76: case 77:
               return ("You are getting the correct amount of sleep for your age (Recommended between 56 - 77 hours per week)");
         }
        if (age  >= 7 && age <= 13)
           if (weeklySleepAverage < 63)
           {
              return ("You are not sleeping enough for your age (Recommended between 56 - 77 hours per week)");
           }
        if (age  >= 7 && age <= 13)
        {
           if (weeklySleepAverage > 77)
              return ("You are not sleeping enough for your age (Recommended between 56 - 77 hours per week)");
        }
      }

      if (age >= 14 && age <= 17)
      {
         switch (weeklySleepAverage)
         {
            case 56: case 57: case 58: case 59: case 60: case 61: case 62: case 63:
            case 64: case 65: case 66: case 67: case 68: case 69: case 70:
               return ("You are getting the correct amount of sleep for your age (Recommended between 56 - 70 hours per week)");
         }

         if (age >= 14 && age <= 17)
         {
            if (weeklySleepAverage < 56)
               return ("You are not sleeping enough for you age (Recommended between 56 - 70 hours per week)");
         }

         if (age >= 14 && age <=17)
         {
            if (weeklySleepAverage > 70)
               return ("You are sleeping to much for your age (Recommended between 56 - 70 hours per week)");
         }
      }

         if (age >= 18 && age <= 64)
         {
            switch (weeklySleepAverage)
            {
               case 49: case 50: case 51: case 52: case 53: case 54: case 55: case 56:
               case 57: case 58: case 59: case 60: case 61: case 62: case 63:
                  return ("You are getting the correct amount of sleep for your age (Recommended between 49 - 63 hours per week)");
            }

            if (age >= 18 && age <= 64)
            {
               if (weeklySleepAverage < 49)

                  return ("You are not sleeping enough for your age (Recommended between 49 - 63 hours per week) ");
            }

            if (age >= 18 && age <= 64)
            {
               if (weeklySleepAverage > 63)

                  return ("You are sleeping to much for your age(Recommended between 49 - 63 hours per week");
            }
         }
         if (age >= 65 && age <= 122)
         {
            switch (weeklySleepAverage)
            {
               case 49: case 50: case 51: case 52: case 53: case 54: case 55: case 56:
                  return ("You are sleeping the correct amount for your age (Recommended  between 49 - 56 hours per week)");

            }
            if (age >= 65 && age <= 122)
            {
               if (weeklySleepAverage < 49)
                  return ("You are not sleeping enough for you age (Recommended between 49 - 56 hours per week)");
            }

            if (age >= 65 && age <= 122)
            {
               if (weeklySleepAverage > 56)
                  return ("You are sleeping to much for your age(Recommended between 49 - 56 hours per week)");
            }
         }
         else //Need to add an exception if no age is entered or if the person has slept under the average.
         {
            return ("Please enter valid age!");
         }

         return null;
      }//Sleep Comparison

   public String toString()
   {
      return (personName + " you have slept " + weeklySleepAverage + " hours, " + sleepComparison(personAge, weeklySleepAverage) + "\n");
   }//toString
}//Class

