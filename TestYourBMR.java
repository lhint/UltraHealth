package HealthApp;

/**
 * Created by Cillian McKermitt on 30/11/2020
 * UPDATE COMMENTS ABOUT PROGRAM HERE
 **/
public class TestYourBMR
{

    public static void main(String[] args)
    {
        YourBMR bmr = new YourBMR("male", 25, 170, 60);
        System.out.println(bmr.calculateBMR());
        System.out.println(bmr.BMRExercise());


    }//main
}//class
