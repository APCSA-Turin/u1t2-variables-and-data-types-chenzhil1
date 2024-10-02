
    /*
    This program is set to change Farenheit degrees to Celcius'
    and define whether it is cold today. 
     */
public class U1T2 {
    public static void main(String[] args) {
        int tempFaren = 70;
        double tempCelcius;
        boolean coldNo;
        tempCelcius = 0;
        final double FRACTION_DURING_TEMP_CONVERTION = 5.0 / 9.0;
        tempCelcius = (tempFaren - 32) * FRACTION_DURING_TEMP_CONVERTION;
        if(tempCelcius <= 15.00) {
            coldNo = true;
        }
        else {
            coldNo = false;
        }
        System.out.println("Today's temperature is " + tempFaren + " degrees Farenheit.");
        System.out.print("Which is ");
        System.out.printf("%.2f", tempCelcius); //This line outputs the Celcius degrees in format of 2 decimal places. 
        System.out.println(" degrees Celcius.");
        if (coldNo) {
            System.out.println("It is quite cold today.");
        }
        else {
            System.out.println("It is not cold today.");
        }
    }
}
