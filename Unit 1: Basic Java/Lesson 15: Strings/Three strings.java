public class ThreeStrings extends ConsoleProgram
{
    public void run()
    {
        // Ask the user for three strings.
        // remember to use the readLine() method.
        String __var1, __var2, __var3;
        __var1 = readLine("First string? ");
        __var2 = readLine("Second string? ");
        __var3 = readLine("Third string? ");
        if((__var1 + __var2).equals(__var3)){
            System.out.println(__var1 + " + " + __var2 + " is equal to " + __var3 + "!");
        }else{
            System.out.println(__var1 + " + " + __var2 + " is not equal to " + __var3 + "!");
        }
    }
}
