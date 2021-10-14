package Lab1;

public class checkvalidation {
    public static void checkFirstName(String  firstName) throws IllegalArgumentException {
        if ((firstName.length() < 3 || firstName.length() > 21)& firstName !="") {
            throw new IllegalArgumentException("first name  must be 3 to 20 characters long or it won't be stored!");
        }
    }

    public static void checkLastName(String  lastName) throws IllegalArgumentException {
        if ((lastName.length() < 3 || lastName.length() > 20) & lastName !="") {
            throw new IllegalArgumentException("last Name must be 3 to 20 characters long or it won't be stored!");
        }
    }

    public static void checkHeight(int  height) throws IllegalArgumentException {
        if ((height < 24 || height > 84) & height != 0) {
            throw new IllegalArgumentException("height must be 24 to 84 inches or it won't be stored!");
        }
    }
    public static void checkWeight(double  weight) throws IllegalArgumentException {
        if ((weight < 80 || weight > 280) & weight != 0) {
            throw new IllegalArgumentException("weight must be  80 to 280 pounds or it won't be stored!");
        }
    }
}
