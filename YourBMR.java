package HealthApp;
import java.util.Scanner;
/**
 * Created by Cillian McKermitt on 30/11/2020
 * UPDATE COMMENTS ABOUT PROGRAM HERE
 **/
public class YourBMR
{

    private Scanner keyboard = new Scanner(System.in);
    private String gender;
    private int age;
    private int height;
    private int activityLevel;
    private double weight;



    public YourBMR(String rGender, int rAge, int rHeight, double rWeight) {
     rGender = gender;
     rAge = age;
     rHeight = height;
     rWeight = weight;

    }

    public double calculateBMR() {
        double BMR;

        if (gender == "male") {
            BMR = (10 * weight) + (6.25 * height) - (5 * age) + 5;

        }
        else {
            BMR = (10 * weight) + (6.25 * height) - (5 * age) - 161;

        }

        return BMR;
    }

    public double BMRExercise() {
        
        double calories = 0;
        double calcBMR = calculateBMR();

        if (activityLevel == 1) {
            calories = calcBMR * 1.2;

        } else if (activityLevel == 2) {
            calories = calcBMR * 1.375;

        } else if (activityLevel == 3) {
            calories = calcBMR * 1.55;

        } else if (activityLevel == 4) {
            calories = calcBMR * 1.725;

        }else if (activityLevel == 5) {
            calories = calcBMR * 1.9;

        };
      return calories;
    }

    public int getAge() {return age;}
    public int getHeight() {return height;}
    public double getWeight() {return weight;}
    public String getGender() {return gender;}




}//class
