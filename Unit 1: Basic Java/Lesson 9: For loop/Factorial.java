public class Factorial extends ConsoleProgram
{
    public int factorial(int __num){
        int total = __num;
        for(int i=__num-1;i>0;i--){
            total *= i;
        }
        return total;
    }
    public void run()
    {
        int target = readInt("What number would you like to compute the factorial for? ");
        System.out.println(factorial(target));
    }
}
