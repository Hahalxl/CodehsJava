public class AddFractions extends ConsoleProgram
{
    public void run()
    {
    int a,b,c,d;
    a = readInt("What is the numerator of the first fraction? "); 
    b = readInt("What is the denominator of the first fraction? ");
    c = readInt("What is the numerator of the second fraction? ");
    d = readInt("What is the denominator of the second fraction? ");
    
    System.out.println( "The sum of " +a + "/" + b + " + " + c + "/" + d + " = " + ((a * d) + ( b * c)) + "/" + (b * d) );
    }
}
