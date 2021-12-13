
/**
 * This program is written with the purpose of using logical operators
 * mainly, in the if-else-if statements and basic incorporation of 
 * string methods and double values.
 *
 * @author Anish Gupta
 * @version 3/1/2021
 */
import java.util.Scanner;
public class TDEE
{
    public static void main(String [] args) 
    {
        // Variable declarations 
        double activityFactor;                              // Activity factor rate variable
        double basalMetabolicRate;                          // Basal metabolic rate variable
        double poundsToKilogramConversionRate = 0.453592;   // Pounds to kilograms conversion rate
        double inchesToCentimetersConversionRate = 2.54;    // Inches to centimeters conversion rate
        double feetToMilesConversionRate = 5280;            // Feet to miles conversion rate
        Scanner in = new Scanner(System.in);                // Scanner class object
         
        // Input scanner
        System.out.println("This program will calculate your total daily energy expenditure (TDEE), or in other words,");
        System.out.println("the amount of calories your body burns in 24 hours to support your basal metabolic rate and any additional activities you undertake.");
        System.out.println();
        System.out.print("Please enter your name (first last): ");
        String name = in.nextLine();
        System.out.print("Please enter your gender (M/F): ");
        String gender = in.next();
        String genderUpperCase = gender.toUpperCase();
        System.out.print("Please enter your weight in pounds (lbs): ");
        double weightInPounds = in.nextDouble();
        double weightInKilograms = weightInPounds * poundsToKilogramConversionRate;
        System.out.print("Please enter your height in inches (in): ");
        double heightInInches = in.nextDouble();
        double heightInCentimeters = heightInInches * inchesToCentimetersConversionRate;
        System.out.print("Please enter your age in years (e.g. 15): ");
        String ageInYears = in.next();
        int age = Integer.parseInt(ageInYears);
        System.out.println();
        
        // Display menu
        System.out.println("Select Your Activity Level");
        System.out.println("[A] Resting (Sleeping, Reclining)");
        System.out.println("[B] Sedentary (Minimal Movement)");
        System.out.println("[C] Light (Sitting, Standing)");
        System.out.println("[D] Moderate (Light Manual Labor, Dancing, Riding Bike)");
        System.out.println("[E] Very Active (Team Sports, Hard Manual Labor)");
        System.out.println("[F] Extremely Active (Full-time Athlete, Heavy Manual Labor)");
        System.out.println("[Q] Quit"); 
        System.out.println();
        System.out.print("Enter the letter corresponding to your activity level (A, B, C, D, E, F, or Q): ");
        String choice = in.next();
        String choiceUpperCase = choice.toUpperCase();
        System.out.println();
        System.out.println();
        
        // Set activity factor values based on letter choice corresponding to activity level and the inputted gender
    if(choice.equalsIgnoreCase("A") && (gender.equalsIgnoreCase("M")))
        {
        activityFactor = 1.0;
        basalMetabolicRate = 88.362 + (13.397 * weightInKilograms) + (4.799 * heightInCentimeters) - (5.677 * age);
        double TDEE = basalMetabolicRate * activityFactor;
        System.out.println("Your Results:");
        System.out.println("Name: " + name + "\t\t\t Gender: " + genderUpperCase);
        System.out.println("BMR: " + basalMetabolicRate + " calories" + "\t Activity Factor: " + activityFactor);
        System.out.println("TDEE: " + TDEE + " calories");
    }
    else if(choice.equalsIgnoreCase("A") && (gender.equalsIgnoreCase("F")))
    {
        activityFactor = 1.0;
        basalMetabolicRate = 447.593 + (9.247 * weightInKilograms) + (3.098 * heightInCentimeters) - (4.330 * age);
        double TDEE = basalMetabolicRate * activityFactor;
        System.out.println("Your Results:");
        System.out.println("Name: " + name + "\t\t\t Gender: " + genderUpperCase);
        System.out.println("BMR: " + basalMetabolicRate + " calories" + "\t\t Activity Factor: " + activityFactor);
        System.out.println("TDEE: " + TDEE + " calories");
    }
    else if(choice.equalsIgnoreCase("B") && (gender.equalsIgnoreCase("M")))
    {
        activityFactor = 1.3;
        basalMetabolicRate = 88.362 + (13.397 * weightInKilograms) + (4.799 * heightInCentimeters) - (5.677 * age);
        double TDEE = basalMetabolicRate * activityFactor;
        System.out.println("Your Results:");
        System.out.println("Name: " + name + "\t\t\t Gender: " + genderUpperCase);
        System.out.println("BMR: " + basalMetabolicRate + " calories" + "\t Activity Factor: " + activityFactor);
        System.out.println("TDEE: " + TDEE + " calories");
    }
    else if(choice.equalsIgnoreCase("B") && (gender.equalsIgnoreCase("F")))
    {
        activityFactor = 1.3;
        basalMetabolicRate = 447.593 + (9.247 * weightInKilograms) + (3.098 * heightInCentimeters) - (4.330 * age);
        double TDEE = basalMetabolicRate * activityFactor;
        System.out.println("Your Results:");
        System.out.println("Name: " + name + "\t\t\t Gender: " + genderUpperCase);
        System.out.println("BMR: " + basalMetabolicRate + " calories" + "\t\t Activity Factor: " + activityFactor);
        System.out.println("TDEE: " + TDEE + " calories");
    }
    else if(choice.equalsIgnoreCase("C") && (gender.equalsIgnoreCase("M")))
    {
        activityFactor = 1.6;
        basalMetabolicRate = 88.362 + (13.397 * weightInKilograms) + (4.799 * heightInCentimeters) - (5.677 * age);
        double TDEE = basalMetabolicRate * activityFactor;
        System.out.println("Your Results:");
        System.out.println("Name: " + name + "\t\t\t Gender: " + genderUpperCase);
        System.out.println("BMR: " + basalMetabolicRate + " calories" + "\t Activity Factor: " + activityFactor);
        System.out.println("TDEE: " + TDEE + " calories");
    }
    else if(choice.equalsIgnoreCase("C") && (gender.equalsIgnoreCase("F")))
    {
        activityFactor = 1.5;
        basalMetabolicRate = 447.593 + (9.247 * weightInKilograms) + (3.098 * heightInCentimeters) - (4.330 * age);
        double TDEE = basalMetabolicRate * activityFactor;
        System.out.println("Your Results:");
        System.out.println("Name: " + name + "\t\t\t Gender: " + genderUpperCase);
        System.out.println("BMR: " + basalMetabolicRate + " calories" + "\t\t Activity Factor: " + activityFactor);
        System.out.println("TDEE: " + TDEE + " calories");
    }
    else if(choice.equalsIgnoreCase("D") && (gender.equalsIgnoreCase("M")))
    {
        activityFactor = 1.7;
        basalMetabolicRate = 88.362 + (13.397 * weightInKilograms) + (4.799 * heightInCentimeters) - (5.677 * age);
        double TDEE = basalMetabolicRate * activityFactor;
        System.out.println("Your Results:");
        System.out.println("Name: " + name + "\t\t\t Gender: " + genderUpperCase);
        System.out.println("BMR: " + basalMetabolicRate + " calories" + "\t Activity Factor: " + activityFactor);
        System.out.println("TDEE: " + TDEE + " calories");
    }
    else if(choice.equalsIgnoreCase("D") && (gender.equalsIgnoreCase("F")))
    {
        activityFactor = 1.6; 
        basalMetabolicRate = 447.593 + (9.247 * weightInKilograms) + (3.098 * heightInCentimeters) - (4.330 * age);
        double TDEE = basalMetabolicRate * activityFactor;
        System.out.println("Your Results:");
        System.out.println("Name: " + name + "\t\t\t Gender: " + genderUpperCase);
         System.out.println("BMR: " + basalMetabolicRate + " calories" + "\t\t Activity Factor: " + activityFactor);
        System.out.println("TDEE: " + TDEE + " calories");
    }
    else if(choice.equalsIgnoreCase("E") && (gender.equalsIgnoreCase("M")))
    {
        activityFactor = 2.1;
        basalMetabolicRate = 88.362 + (13.397 * weightInKilograms) + (4.799 * heightInCentimeters) - (5.677 * age);
        double TDEE = basalMetabolicRate * activityFactor;
        System.out.println("Your Results:");
        System.out.println("Name: " + name + "\t\t\t Gender: " + genderUpperCase);
        System.out.println("BMR: " + basalMetabolicRate + " calories" + "\t Activity Factor: " + activityFactor);
        System.out.println("TDEE: " + TDEE + " calories");
    }
    else if(choice.equalsIgnoreCase("E") && (gender.equalsIgnoreCase("F")))
    {
        activityFactor = 1.9;
        basalMetabolicRate = 447.593 + (9.247 * weightInKilograms) + (3.098 * heightInCentimeters) - (4.330 * age);
        double TDEE = basalMetabolicRate * activityFactor;
        System.out.println("Your Results:");
        System.out.println("Name: " + name + "\t\t\t Gender: " + genderUpperCase);
        System.out.println("BMR: " + basalMetabolicRate + " calories" + "\t\t Activity Factor: " + activityFactor);
        System.out.println("TDEE: " + TDEE + " calories");
    }
    else if(choice.equalsIgnoreCase("F") && (gender.equalsIgnoreCase("M")))
    {
        activityFactor = 2.4;
        basalMetabolicRate = 88.362 + (13.397 * weightInKilograms) + (4.799 * heightInCentimeters) - (5.677 * age);
        double TDEE = basalMetabolicRate * activityFactor;
        System.out.println("Your Results:");
        System.out.println("Name: " + name + "\t\t\t Gender: " + genderUpperCase);
        System.out.println("BMR: " + basalMetabolicRate + " calories" + "\t Activity Factor: " + activityFactor);
        System.out.println("TDEE: " + TDEE + " calories");
    }
    else if(choice.equalsIgnoreCase("F") && (gender.equalsIgnoreCase("F")))
    {
        activityFactor = 2.2;
        basalMetabolicRate = 447.593 + (9.247 * weightInKilograms) + (3.098 * heightInCentimeters) - (4.330 * age);
        double TDEE = basalMetabolicRate * activityFactor;
        System.out.println("Your Results:");
        System.out.println("Name: " + name + "\t\t\t Gender: " + genderUpperCase);
        System.out.println("BMR: " + basalMetabolicRate + " calories" + "\t\t Activity Factor: " + activityFactor);
        System.out.println("TDEE: " + TDEE + " calories");
    }
    else if(choice.equalsIgnoreCase("Q"))
    {
        System.out.println("You chose Q for quit.");
        System.out.println("You have quit this program, please re-run the program when you would like to via the main menu. Thank you!");
    }
    else
    {
        System.out.println("You did not choose a valid menu option!");
    }
     }//end of main method
}//end of class
