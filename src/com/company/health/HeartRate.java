package com.company.health;
import java.util.Scanner;

/**
 * Created by Luke Hinton on 29/11/2020
 * HeartRate sub class of the main class Health. This class will provide the code for the heart rate function of the app. Take the persons age away from 220
 * to find average max heart rate.
 **/
public class HeartRate extends Health
{

   public int currentAverage;

   public HeartRate()
   {

   }//Default constructor

   public HeartRate(String name, int age)
   {
      super(name, age);
   }//Alternative constructor

   //Method to calculate average age heart rate.

   public int calculateHeartRate(int age)
   {
      final int MAXHEARTRATE = 220;
      currentAverage = MAXHEARTRATE - age;
      return currentAverage;
   }//calculateHeartRate

   public void promptDetails()
   {
      Scanner keyboard = new Scanner(System.in);

      System.out.println("Please enter your name: ");
      personName = keyboard.nextLine();
      System.out.println("Please enter your age: ");
      personAge = keyboard.nextInt();
   }

   //Method to check if the heart rate is normal for age.

   public String checkIsNormal(int age)
   {
      boolean isNormal;

      if (age >= 0 && age < 30)
      {
         return (" and should be between 190 - 200bpm for your age.");
      } else if (age >= 30 && age < 35)
      {
         return (" and should be between 185 - 190 for your age");
      } else if (age >= 35 && age < 40)
      {
         return (" and should be between 180 - 185 for your age");
      } else if (age >= 40 && age < 45)
      {
         return (" and should be between 175 - 180 for your age");
      } else if (age >= 45 && age < 50)
      {
         return (" and should be 170 - 185 for your age");
      } else if (age >= 50 && age < 55)
      {
         return (" and should be between 165 - 170 for your age");
      } else if (age >= 55 && age < 60)
      {
         return (" and should be between 160 - 165 for your age");
      } else if (age >= 60 && age < 65)
      {
         return (" and should be between 155 - 160 for your age");
      } else if (age>= 65 && age < 70)
      {
         return (" and should be between 150 - 155 for your age");
      } else if (age >= 70)
      {
           return (" and should be between 145 - 150 for your age");
      } else
         {
           return ("please enter a valid age!");
         }
   }//checkIsNormal

   //Print the result.

   public String toString()
   {
      return (personName + ", your max heart rate is " + calculateHeartRate(personAge) + checkIsNormal(personAge));

   }//toString

}//class
