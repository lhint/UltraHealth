package com.company.health;

/**
 * Created by Luke Hinton on 29/11/2020
 * Main health class for the Ultra Health App.
 **/

public class Health
{
   public String personName;
   public int personAge;

   public Health()
   {

   }//Default constructor

   public Health(String name, int age)
   {
      personName = name;
      personAge = age;
   }///Additional constructor

   //Setters
   public void setPersonName(String name)
   {
      personName = name;
   }

   public void setPersonAge(int age)
   {
      personAge = age;
   }

   //Getters

   public String getPersonName()
   {
      return personName;
   }

   public int getPersonAge()
   {
      return personAge;
   }

}//class
