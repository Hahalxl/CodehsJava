public class GuessTheNumber extends ConsoleProgram
{
    public void run()
    {
        int secretNumber = 6;
        
        // Allow the user to keep guessing numbers between
        // 1 and 10 until they guess the correct number
        
        // Write your code here!
        System.out.println("I'm thinking of a number between 1 and 10.\nSee if you can guess the number!");
        boolean guessed = false;
        while(!guessed){
            int guessing = readInt("Enter your guess: ");
            if(guessing == (secretNumber)){
                guessed = true;
                System.out.println("Correct!");
            }else{
                System.out.println("Try again!");
            }
        }
    }
}
