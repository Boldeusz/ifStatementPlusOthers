public class Main {

    public static void main(String[] args) {

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("I am scared of aliens!!!");

            int topScore = 80;
            if (topScore < 100) {
                System.out.println("You got the high score!!");
            }
            int secondTopScore = 90;
            if (topScore > secondTopScore && topScore <100) {
                System.out.println("Greater than second top score and less than 100 ");
            }
            if ((topScore > 90) || (secondTopScore <= 90)){
                System.out.println("Either or both the conditions are true");
            }

            int newValue = 50;
            if (newValue == 50) {
                System.out.println("This is true");
            }
            boolean isCar = false;
            if (!isCar) {
                System.out.println("This is not supposed to happen");
            }

            isCar = true;
            boolean wasCar = isCar ? true : false;
            if (wasCar) {
                System.out.println("wasCar is true");
            }
            double myFirstValue = 20.00d;
            double mySecondValue = 80.00d;
            double myTotalValues = (myFirstValue + mySecondValue) * 100.00d;
            System.out.println("MyTotalValues = " + myTotalValues);
            double theRemainder = myTotalValues % 30.00d;
            System.out.println("theRemainder = " + theRemainder);
            boolean isNotRemainder = (theRemainder ==0 ) ? true : false;
            System.out.println("isNoRemainder = " + isNotRemainder);
            if (!isNotRemainder) {
                System.out.println("Got some remainder");
            }
        }
    }
}
