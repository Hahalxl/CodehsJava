public class TripleDouble extends ConsoleProgram
{
    public void run()
    {
        int points = readInt("How many points did you score? ");
        int rebounds = readInt("How many rebounds did you get? ");
        int assists = readInt("How many assists did you have? ");
        
        // Create a boolean called `tripleDouble`
        // that is true if
        // you had at least 10 in each category
        boolean tripleDouble = points >= 10 && rebounds >= 10 && assists >= 10; // replace this
        
        System.out.println("Got a Triple Double?: " + tripleDouble);
    }
}
