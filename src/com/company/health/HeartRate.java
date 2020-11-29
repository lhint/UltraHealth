package com.company.health;
import java.util.Scanner;

/**
 * Created by Luke Hinton on 29/11/2020
 * HeartRate sub class of the main class Health. This class will provide the code for the heart rate function of the app.
 **/
public class HeartRate extends Health
{

   public final int MAXHEARTRATE = 220;
   public int currentAverage, enteredHeartRate;

   public HeartRate()
   {

   }//Default constructor

   public HeartRate(String name, int age, int heartRate)
   {
      super(name, age);
      enteredHeartRate = heartRate;
   }//Alternative constructor

   //Setters
   public void setEnteredHeartRate(int heartRate)
   {
      enteredHeartRate = heartRate;
   }

   //Getters
   public int getEnteredHeartRate()
   {
      return enteredHeartRate;
   }

   //Method to calculate average age heart rate.

   public int calculateHeartRate(int age, int heartRate)
   {
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Please enter heart rate over one minute.\nTo do this find your pulse and count it over the course of one minute and enter the total pulses:\nHeart rate: ");
      setEnteredHeartRate(keyboard.nextInt());
      currentAverage = MAXHEARTRATE - age;
      return currentAverage;
   }//calculateHeartRate

   //IsNormal

   public String isNormal(boolean isNormal)
   {
      if(isNormal)
      {
         return ("is ");
      } else
      {
         return ("is not ");
      }
   }//isNormal

   //Method to check if the heart rate is normal for age.

   public String checkIsNormal(int age, int heartRate)
   {
      boolean isNormal;

        if(age >= 0 && age < 30)
      {
         if(heartRate >= 100 && age <= 170)
         {
            isNormal = true;
         } else
         {
            isNormal = false;
         }
         return ("Heart rate should be between 100 - 170bpm" + isNormal(isNormal) + " normal");
      } else if(age >= 30 && age < 35)
      {
         if(heartRate >= 95 && age <= 162)
         {
            isNormal = true;
         } else
         {
            isNormal = false;
         }
         return ("Heart rate should be between 95 - 162"  + isNormal(isNormal) + " normal");
      } else if(age >= 35 && age < 40)
      {
         if(heartRate >= 93 && age <= 157)
         {
            isNormal = true;
         } else
         {
            isNormal = false;
         }
         return ("Heart rate should be between 93 - 157" + isNormal(isNormal) + " normal");
      } else if(age >= 40 && age < 45)
      {
         if(heartRate >= 90 && age <= 153)
         {
            isNormal = true;
         } else
         {
            isNormal = false;
         }
           return ("Heart rate should be between 90 - 153" + isNormal(isNormal) + " normal");
      } else if(age >= 45 && age < 50)
      {
         if(heartRate >= 88 && age <= 149)
         {
            isNormal = true;
         } else
         {
            isNormal = false;
         }
           return ("Heart rate should be between 88 - 149" + isNormal(isNormal) + " normal");
      } else if(age >= 50 && age < 55)
      {
         if(heartRate >= 85 && age <= 145)
         {
            isNormal = true;
         } else
         {
            isNormal = false;
         }
           return ("Heart rate should be between 85 - 145" + isNormal(isNormal) + " normal");
      } else if(age >= 55 && age < 60)
      {
         if(heartRate >= 83 && age <= 140)
         {
            isNormal = true;
         } else
         {
            isNormal = false;
         }
           return ("Heart rate should be between 83 - 140" + isNormal(isNormal) + " normal");
      } else if(age >= 60 && age < 65)
      {
         if(heartRate >= 80 && age <= 136)
         {
            isNormal = true;
         } else
         {
            isNormal = false;
         }
           return ("Heart rate should be between 80 - 136" + isNormal(isNormal) + " normal");
      } else if(age >= 65 && age < 70)
      {
         if(heartRate >= 78 && age <= 132)
         {
            isNormal = true;
         } else
         {
            isNormal = false;
         }
           return ("Heart rate should be between 78 - 132" + isNormal(isNormal) + " normal");
      } else if( age >= 70)
      {
         if(heartRate >= 75 && age <= 128)
         {
            isNormal = true;
         } else
         {
            isNormal = false;
         }
           return ("Heart rate should be between 75 - 128" + isNormal(isNormal) + " normal");
      } else
         {
           return ("Please enter a valid age!");
         }
   }//checkIsNormal

   //Print the result.

   public String toString()
   {
      return "";

   }//toString

}//class
