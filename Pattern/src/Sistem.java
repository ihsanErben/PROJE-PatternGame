
import java.util.Scanner;


public class Sistem {
    
    public int correct = 0; 
    int total = 1;
    
    public void sistem1(){
    Scanner input = new Scanner(System.in);
        

        int wrong = 0;
        int ard_correct = 0;

        System.out.println("Welcome to Arithmetic's Exercise Program");
        System.out.println("-----------------------------------------");
        System.out.println("You have 90 seconds to answer as many questions as possible.");
        System.out.println("You will get 5 seconds bonus if you answer 5 questions in a row.");
        System.out.println("Use java arithmetic precedence rules to find answers!");
        System.out.println("Press\" q !to quit or any key to start...");
        int soruSayisi = 6;
        while (soruSayisi > 0) {
            int random1 = (int) (Math.random() * 10);
            int random2 = (int) (Math.random() * 10);

            int randomOperator = (int) (Math.random() * 4);
            String operator = " ";
            if (randomOperator == 0) {
                operator = "+";
            } else if (randomOperator == 1) {
                operator = "-";
            } else if (randomOperator == 2) {
                operator = "*";
            } else if (randomOperator == 3) {
                operator = "/";
            } else {
                System.out.println("YANLISLIK VAR.");
            }

            System.out.print("Q" + total + " " + random1 + " " + operator + " " + random2 + " = ");
            int UsersAnswer = input.nextInt();
            int rightAnswer = 0;

            if (randomOperator == 0) {
                rightAnswer = (random1 + random2);
            } else if (randomOperator == 1) {
                rightAnswer = (random1 - random2);
            } else if (randomOperator == 2) {
                rightAnswer = (random1 * random2);
            } else if (randomOperator == 3) {
                rightAnswer = (random1 / random2);
            } else {
                System.out.println("YANLISLIK VAR2.");
            }

            if (UsersAnswer == rightAnswer) {
                System.out.println("Correct");
                System.out.println();
                correct++;
                ard_correct++;
            } else {
                System.out.println("Wrong");
                System.out.println();
                wrong++;
                ard_correct = 0;
            }

            if (correct == 3) {
                System.out.println(" * * *  good   * * *");
                System.out.println(" * * *  * * *  * * *");
                System.out.println("  * *    * *    * *");
                System.out.println("   *      *      *");
            }

            if (correct == 6) {
                System.out.println("* * * * * *      verygood        * * * * * *");
                System.out.println("* * * * * *     * * * * * *      * * * * * *");
                System.out.println(" * * * * *       * * * * *        * * * * *");
                System.out.println("  * * * *         * * * *          * * * *");
                System.out.println("   * * *           * * *            * * *");
                System.out.println("    * *             * *              * *");
                System.out.println("     *               *                *");
            }

            if (ard_correct == 3) {
                System.out.println("5 saniye kazandiniz.");
                ard_correct = 0;
            }

            soruSayisi--;
            total++;
        }
        
        System.out.println("Correct Answers: " + correct);
        System.out.println("Wrong Answers: " + wrong);
        System.out.println("Total Answers: " + (total - 1));
    }
    
    public void sistem2(){
        System.out.println();
    Scanner input = new Scanner(System.in);

        int wrong = 0;
        int ard_correct = 0;
        
        int soruSayisi = 6;
        while (soruSayisi > 0) {
            int random1 = (int) (Math.random() * 10);
            int random2 = (int) (Math.random() * 10);
            int random3 = (int) (Math.random() * 10);

            int randomOperator1 = (int) (Math.random() * 4);
            int randomOperator2 = (int) (Math.random() * 4);
            
            String operator1 = " ";
            String operator2 = " ";
            
            if (randomOperator1 == 0) {
                operator1 = "+";
            } else if (randomOperator1 == 1) {
                operator1 = "-";
            } else if (randomOperator1 == 2) {
                operator1 = "*";
            } else if (randomOperator1 == 3) {
                operator1 = "/";
            } else {
                System.out.println("YANLISLIK VAR.");
            }
            
            if (randomOperator2 == 0) {
                operator2 = "+";
            } else if (randomOperator2 == 1) {
                operator2 = "-";
            } else if (randomOperator2 == 2) {
                operator2 = "*";
            } else if (randomOperator2 == 3) {
                operator2 = "/";
            } else {
                System.out.println("YANLISLIK VAR.");
            }

            System.out.print("Q" + total + " " + random1 + " " + operator1 + " " + random2 + " " + operator2 + " " + random3 + " = ");
            int UsersAnswer = input.nextInt();
            int rightAnswer = 0;

            if (randomOperator1 == 0) {
                if(randomOperator2 == 0){
                rightAnswer = (random1 + random2 + random3);
                }else if(randomOperator2 == 1){
                rightAnswer = (random1 + random2 - random3);
                }else if(randomOperator2 == 2){
                rightAnswer = (random1 + random2 * random3);
                }
                else if(randomOperator2 == 3){
                rightAnswer = (random1 + random2 / random3);
                }
                else{
                System.out.println("YANLISLIK VAR3.");
                }
                
            } else if (randomOperator1 == 1) {
                if(randomOperator2 == 0){
                rightAnswer = (random1 - random2 + random3);
                }else if(randomOperator2 == 1){
                rightAnswer = (random1 - random2 - random3);
                }else if(randomOperator2 == 2){
                rightAnswer = (random1 - random2 * random3);
                }else if(randomOperator2 == 3){
                rightAnswer = (random1 - random2 / random3);
                }
                else{
                System.out.println("YANLISLIK VAR3.");
                }
                
            } else if (randomOperator1 == 2) {
                
                if(randomOperator2 == 0){
                rightAnswer = (random1 * random2 + random3);
                }else if(randomOperator2 == 1){
                rightAnswer = (random1 * random2 - random3);
                }else if(randomOperator2 == 2){
                rightAnswer = (random1 * random2 * random3);
                }else if(randomOperator2 == 3){
                rightAnswer = (random1 * random2 / random3);
                }
                else{
                System.out.println("YANLISLIK VAR3.");
                }
                
            } else if (randomOperator1 == 3) {
                if(randomOperator2 == 0){
                rightAnswer = (random1 / random2 + random3);
                }else if(randomOperator2 == 1){
                rightAnswer = (random1 / random2 - random3);
                }else if(randomOperator2 == 2){
                rightAnswer = (random1 / random2 * random3);
                }else if(randomOperator2 == 3){
                rightAnswer = (random1 / random2 / random3);
                }
                else{
                System.out.println("YANLISLIK VAR3.");
                }
            } else {
                System.out.println("YANLISLIK VAR2.");
            }

            if (UsersAnswer == rightAnswer) {
                System.out.println("Correct");
                System.out.println();
                correct++;
                ard_correct++;
            } else {
                System.out.println("Wrong");
                System.out.println();
                wrong++;
                ard_correct = 0;
            }

            if (correct == 3) {
                System.out.println(" * * *  good   * * *");
                System.out.println(" * * *  * * *  * * *");
                System.out.println("  * *    * *    * *");
                System.out.println("   *      *      *");
            }

            if (correct == 6) {
                System.out.println("* * * * * *      verygood        * * * * * *");
                System.out.println("* * * * * *     * * * * * *      * * * * * *");
                System.out.println(" * * * * *       * * * * *        * * * * *");
                System.out.println("  * * * *         * * * *          * * * *");
                System.out.println("   * * *           * * *            * * *");
                System.out.println("    * *             * *              * *");
                System.out.println("     *               *                *");
            }

            if (ard_correct == 3) {
                System.out.println("5 saniye kazandiniz.");
                ard_correct = 0;
            }

            soruSayisi--;
            total++;
        }
        
        System.out.println("Correct Answers: " + correct);
        System.out.println("Wrong Answers: " + wrong);
        System.out.println("Total Answers: " + (total - 1));
    }
}
