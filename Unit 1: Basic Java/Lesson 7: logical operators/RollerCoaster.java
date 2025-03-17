public class RollerCoaster extends ConsoleProgram
{
    public void run()
    {
        boolean tallEnough, oldEnough;
        tallEnough = readBoolean("Are you tall enough? ");
        oldEnough = readBoolean("Are you old enough? ");
        System.out.println(tallEnough && oldEnough);
    }
}
