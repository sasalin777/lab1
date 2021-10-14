package Lab1;

import static Lab1.checkvalidation.checkFirstName;
import static Lab1.checkvalidation.checkLastName;
import static Lab1.checkvalidation.checkHeight;
import static Lab1.checkvalidation.checkWeight;

/**
 * @author  Sasa
 * class Model
 * ●	first name
 * ●	last name
 * ●	height (inches – use int)
 * ●	weight (pounds – use double)
 * ●	can travel (true or false)
 * ●	smokes (true or false)
 */

public class Model {
    private String firstName;
    private String lastName;
    private int heightInches;
    private double weightPounds;
    private boolean canTravel;
    private boolean smoker;
    public static final int INCHES_PER_FOOT = 12;
    public static final double POUNDS_PER_KG = 2.2046;
    public static final int BASE_RATE_DOLLARS_PER_HOUR = 60;
    public static final int TALL_INCHES = 67;
    public static final double THIN_POUNDS = 140.0;
    public static final int TALL_THIN_BONUS_DOLLARS_PER_HOUR = 5;
    public static final int TRAVEL_BONUS_DOLLARS_PER_HOUR = 4;
    public static final int SMOKER_DEDUCTION_DOLLARS_PER_HOUR = 10;
    public  long kilograms;
    public int feet;
    double hourlyrate;







    public Model() { this("", "", 0, 0, false,false); }


    public Model(String firstName,String lastName, int heightInches, double weightPounds, boolean canTravel, boolean smoker)
    {
        checkFirstName(firstName);
        checkLastName(lastName);
        checkHeight(heightInches);
        checkWeight(weightPounds);
        setFirstName(firstName);
        setLastName(lastName);
        setHeightInches(heightInches);
        setWeightPounds(weightPounds);
        setCanTravel(canTravel);
        setSmoker(smoker);
    }

    public Model(String firstName,String lastName, int heightInches, double weightPounds)
    {
        checkFirstName(firstName);
        checkLastName(lastName);
        checkHeight(heightInches);
        checkWeight(weightPounds);
        setFirstName(firstName);
        setLastName(lastName);
        setHeightInches(heightInches);
        setWeightPounds(weightPounds);
        setCanTravel(true);
        setSmoker(false);
    }





    /*public Model(String firstName, String lastName, int heightInches, double weightPounds, boolean canTravel, boolean smoker)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.heightInches = heightInches;
        this.weightPounds = weightPounds;
        this.canTravel = false;
        this.smoker = false;

    }*/
    public double calculatePayDollarsPerHour(){
        int TALL_THIN_BONUS_DOLLARS_PER_HOUR1 = ((heightInches >= TALL_INCHES) & (weightPounds < THIN_POUNDS)) ? TALL_THIN_BONUS_DOLLARS_PER_HOUR : 0;
        int TRAVEL_BONUS_DOLLARS_PER_HOUR1 = (canTravel == true) ? TRAVEL_BONUS_DOLLARS_PER_HOUR : 0;
        int SMOKER_DEDUCTION_DOLLARS_PER_HOUR1 = (smoker == true) ? SMOKER_DEDUCTION_DOLLARS_PER_HOUR : 0;
        double hourlyrate = BASE_RATE_DOLLARS_PER_HOUR + TALL_THIN_BONUS_DOLLARS_PER_HOUR1 + TRAVEL_BONUS_DOLLARS_PER_HOUR1 - SMOKER_DEDUCTION_DOLLARS_PER_HOUR1;
        return (int)hourlyrate;
    }

    public int getHeightInFeetAndInches_f(){
        int dFeet = heightInches / INCHES_PER_FOOT;

        return dFeet;

    }
    public int getHeightInFeetAndInches_i(){
        int dinches = heightInches % INCHES_PER_FOOT;
        return dinches;

    }


    public String  t() {
            while (firstName !="") {
                String ccanTravel = (canTravel == true) ? "Does travel" : "Does NOT travel";
                String issmoker = (smoker == true) ? "Does smoke" : "Does NOT smoke";
                return String.format("Name: %s %s\nHeight: %d inches\nWeight: %.0f pounds\n%s\n%s", getFirstName(), getLastName(), getHeightInches(), getWeightPounds(), ccanTravel, issmoker);
            }
            return "";
    }
    public String  displayModelDetails() {
        while (firstName != "") {
            String ccanTravel1 = (canTravel == true) ? "yup" : "nope";
            String issmoker1 = (smoker == true) ? "yup" : "nope";
            return String.format("Name: %s %s\nHeight: %d foot %d inches\nWeight: %.1f pounds\nTravels: %s\nSmokes:%s\nHourly rate: $%.0f", getFirstName(), getLastName(),getHeightInFeetAndInches_f(), getHeightInFeetAndInches_i(), getWeightPounds(), ccanTravel1, issmoker1, calculatePayDollarsPerHour());
        }
        return "";
    }




        










    public String getFirstName() {
        return firstName;
            }

    public final void setFirstName(String firstName) {
        checkLastName(firstName);
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public final void setLastName(String lastName) {
       checkFirstName(lastName);
        this.lastName = lastName;
    }

    public int getHeightInches() { return heightInches; }

    public final void setHeightInches(int heightInches) {
        checkHeight(heightInches);
        this.heightInches = heightInches;
    }

    public double getWeightPounds() { return weightPounds; }

    public final void setWeightPounds(double weightPounds) {
        checkWeight(weightPounds);
        this.weightPounds = weightPounds;
    }

    public boolean getCanTravel() { return canTravel; }

    public final void setCanTravel(boolean canTravel) {
        //checkSecond(canTravel);
        this.canTravel = canTravel;
    }

    public boolean getSmoker() { return smoker; }

    public final void setSmoker(boolean smoker) {
        //checkSecond(canTravel);
        this.smoker = smoker;
    }






}
