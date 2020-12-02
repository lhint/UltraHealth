package com.company.health;
import java.util.Scanner;
/**
 * Created by Cillian McKermitt on 30/11/2020
 * UPDATE COMMENTS ABOUT PROGRAM HERE
 **/
public class YourBMR extends Health
{
    //Variables
    Scanner keyboard = new Scanner(System.in);
    private String personGender;
    private int personAge;
    private int personHeight;
    private int personActivityLevel;
    private double personWeight;


   // Constructor
    public YourBMR(String gender, int age, int height, double weight) {
     gender = personGender;
     age = personAge;
     height = personHeight;
     weight = personWeight;

    }

    //Getters
    public String getGender() {return personGender;}
    public int getAge() {return personAge;}
    public int getHeight() {return personHeight;}
    public double getWeight() {return personWeight;}

    //Setters
    public void setPersonGender(String personGender) {
        personGender = personGender;
    }
    public void setPersonAge(int personAge) {
        personAge = personAge;
    }
    public void setPersonHeight(int personHeight) {
        personHeight = personHeight;
    }
    public void setWeight(int personWeight) {
        personWeight = personWeight;
    }


    public double calculateBMR() {
        double BMR;

        //Mifflin-St Jeor Equation
        if (personGender == "male") {
            BMR = (10 * personWeight) + (6.25 * personHeight) - (5 * personAge) + 5;

        }
        else {
            BMR = (10 * personWeight) + (6.25 * personHeight) - (5 * personAge) - 161;

        }

        return BMR;
    }

    public void activityLevel(int personActivityLevel) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter your level of activity: ");
        System.out.println("1 - Sedentary:  Little/No exercise");
        System.out.println("2 - Lightly Active: Mild exercise 1-3 days a week");
        System.out.println("3 - Moderately Active: Moderate exercise 3-5 days a week");
        System.out.println("4 - Very Active: Vigorous exercise on most days");
        System.out.println("5 - Extremely Active: Physical job and intense exercise 6-7 days a week");
        personActivityLevel = keyboard.nextInt();
    }

    public double BMRExercise() {
        
        double personCalories = 0;
        double calcBMR = calculateBMR();

        if (personActivityLevel == 1) {
            personCalories= calcBMR * 1.2;

        } else if (personActivityLevel== 2) {
            personCalories = calcBMR * 1.375;

        } else if (personActivityLevel== 3) {
            personCalories= calcBMR * 1.55;

        } else if (personActivityLevel == 4) {
            personCalories = calcBMR * 1.725;

        }else if (personActivityLevel == 5) {
            personCalories = calcBMR * 1.9;

        }
       return personCalories;
    }

}//class
