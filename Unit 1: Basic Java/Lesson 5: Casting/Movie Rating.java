public class MovieRatings extends ConsoleProgram
{
    public void run()
    {
        double movieRating = readDouble("Please enter a movie rating: ");
        int rounded = (int)(movieRating + 0.5);
        System.out.println(rounded);
        
    }
}
