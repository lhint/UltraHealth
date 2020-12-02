import java.util.Scanner;

/**
      *created by Jayne on ${30/11/2020}
      *BMI sub class of the main class. This class will provide the code for the BMI function of the app*/

public class BMI extends Health

{

   public double personWeight;
   public double personHeight;
   public int personAge;
   public double personBMI;



   public BMI(double personWeight, double personHeight, int personAge, double personBMI) {
      this.personWeight = personWeight;
      this.personHeight = personHeight;
      this.personAge = personAge;
      this.personBMI = personBMI;
   }

   //getters
   public double getPersonWeight() {
      return personWeight;
   }

   //setters
   public void setPersonWeight(double personWeight) {
      this.personWeight = personWeight;
   }

   public double getPersonHeight() {
      return personHeight;
   }

   public void setPersonHeight(double personHeight) {
      this.personHeight = personHeight;
   }

   public int getPersonAge() {
      return personAge;
   }

   public void setPersonAge(int personAge) {
      this.personAge = personAge;
   }

   public double getPersonBMI() {
      return personBMI;
   }

   public void setPersonBMI(double personBMI) {
      this.personBMI = personBMI;
   }

   //Method to calculate BMI = weight kilograms/ ( height * height )

   public void calculateBMI(double personWeight, double personHeight, double personBMI) {
      Scanner keyboard = new Scanner (System.in);

      System.out.println(" Please enter your weight in Kilograms: ");
      personWeight = keyboard.nextDouble();

      System.out.println(" Please enter your height in metres: ");
      personHeight = keyboard.nextDouble();

      personBMI = (personWeight / ( personHeight * personHeight));

      System.out.println(" Your bmi is : " + personBMI );



   }//calculateBMI

   public String rangeBMI(){
      if(personBMI < 18.5 )
         return ("Underweight");
      else if(personBMI < 25)
         return "Normal";
      else if (personBMI < 30)
         return "Overweight";
      else
         return "Obese";

   }

   public String toString() {

      return ( "Your BMI " + personBMI + " is showing that for your height and weight you are " + rangeBMI());
   } //toString


}//class