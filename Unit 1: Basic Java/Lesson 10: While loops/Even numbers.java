public class EvensWhile extends ConsoleProgram
{
    public void run()
    {
        int current = 0;
        while(current <= 500){
            if(current % 2 == 0){
                System.out.println(current);
            }
            current++;
        }
    }
}
