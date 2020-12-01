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
   public int personsAge = 0;

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

   public int sleepComparison(int count)
   {
      Scanner keyboard = new Scanner(System.in);
      int number = 1;
      int weeklySleepAverage;

      for (count = 0; count < 7; count++)

         System.out.print("How many hours did you sleep on day " + number++);
      weeklySleepAverage = keyboard.nextInt();
      return weeklySleepAverage;

      if (personsAge < 17 && weeklySleepAverage = 45)
      {
         System.out.print("You are sleeping the correct amount");
      }
      else if (super(personsAge)  < 17 && weeklySleepAverage < 45)
      {
         System.out.print("You are sleeping too little");
      }
      else
      {
         System.out.print("You are sleeping too much on average ")
      }
   }

