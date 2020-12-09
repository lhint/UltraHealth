package com.company.health;
import java.util.Scanner;
import java.text.DecimalFormat;
/**
 * Created by Cillian McKermitt on 30/11/2020
 * UPDATE COMMENTS ABOUT PROGRAM HERE
 **/
public class YourBMR extends Health
{
    //Variables
    DecimalFormat df = new DecimalFormat("00.##");
    Scanner keyboard = new Scanner(System.in);
    private String personGender;
    private int personAge;
    private int personHeight;
    private int personActivityLevel;
    private double personWeight;
    private double personCalories;


   // Constructor
    public YourBMR(String gender, int age, int height, double weight) {
       super (age);
     gender = personGender;
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

    public void promptDetails() {
        System.out.print("Please enter your gender (Male/Female): ");
        personGender = keyboard.nextLine();
        System.out.print("Please enter your age: ");
        personAge = keyboard.nextInt();
        System.out.print("Please enter your height (in cm): ");
        personHeight = keyboard.nextInt();
        System.out.print("Please enter your weight (in KG): ");
        personWeight = keyboard.nextDouble();
        System.out.println();
        System.out.println();
    }


    public double calculateBMR() {
        double BMR;

        //Mifflin-St Jeor Equation
        if (personGender == "Male") {
            BMR = (10 * personWeight) + (6.25 * personHeight) - (5 * personAge) + 5;

        }
        else {
            BMR = (10 * personWeight) + (6.25 * personHeight) - (5 * personAge) - 161;

        }

        return BMR;
    }

    public int activityLevel() {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter your level of activity: ");
        System.out.println("1 - Sedentary:  Little/No exercise");
        System.out.println("2 - Lightly Active: Mild exercise 1-3 days a week");
        System.out.println("3 - Moderately Active: Moderate exercise 3-5 days a week");
        System.out.println("4 - Very Active: Vigorous exercise on most days");
        System.out.println("5 - Extremely Active: Physical job and intense exercise 6-7 days a week");
        System.out.print("Please enter your choice: ");
        personActivityLevel = keyboard.nextInt();
        System.out.println();
        return personActivityLevel;
    }

    public double BMRExercise() {

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

    public String toString() {

        return "Your BMR (daily calorie need) is " + df.format(personCalories) + " calories.";
    }

}//class
