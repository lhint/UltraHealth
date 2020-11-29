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

   //Methods

   public int calculateHeartRate(String name, int age, int heartRate)
   {
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Please enter heart rate over one minute.\nTo do this find your pulse and count it over the course of one minute and enter the total pulses:\nHeart rate: ");
      setEnteredHeartRate(keyboard.nextInt());
      currentAverage = MAXHEARTRATE - age;
      return currentAverage;
   }

}//class
