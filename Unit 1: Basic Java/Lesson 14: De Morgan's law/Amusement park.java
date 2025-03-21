public class AmusementPark extends ConsoleProgram
{
    int AGE_LIMIT = 12;
    int HEIGHT_LIMIT = 48;
    
    public void run()
    {
        int age = readInt("Enter your age: ");
        int height = readInt("Enter your height in inches: ");
        
        boolean oldEnough = age >= AGE_LIMIT;
        boolean tallEnough = height >= HEIGHT_LIMIT;
        
        // CHANGE THIS LINE
        // Convert this boolean expression into its De Morgan equivalent
        boolean cannotRide = !(oldEnough) || !(tallEnough);
        
        if(cannotRide)
        {
            System.out.println("You may not ride the rollercoasters.");
        }
        else
        {
            System.out.println("You may ride the rollercoasters!");
        }
        
        boolean canSwim = readBoolean("Can you swim? ");
        boolean hasLifeJacket = readBoolean("Do you have a life jacket? ");
        
        // CHANGE THIS LINE
        // Convert this boolean expression into its De Morgan equivalent
        boolean cannotSwim = !(canSwim) && !(hasLifeJacket);
        
        if(cannotSwim)
        {
            System.out.println("You may not swim in the pool.");
        }
        else
        {
            System.out.println("You may swim in the pool!");
        }
    }
}
