public class FindMinimum extends ConsoleProgram
{
    public void run()
    {
        int x, y, z;
        x = readInt("Enter first number: "); y =readInt("Enter second number: "); z=readInt("Enter third number: ");
        int[] nums = {x, y, z};
        int smallest = x;
        
        for(int current: nums){
            if(smallest > current){
                smallest = current;
            }
        }
        System.out.println(smallest);
    }
}
