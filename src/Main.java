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

        }
    }
}
