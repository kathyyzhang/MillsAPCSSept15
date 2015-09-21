/**
 * prints a fabulous hourglass.
 * 
 * @author Kathy Zhang
 * @date 9.17.15
 */
public class Hourglass
{
    public static void main(String[] args)
    {
        top();        
        for (int i=1; i<=4; i++)
        {
            for (int k=0; k<i; k++)
            {
                System.out.print(" ");
            }
            beg();   
            for (int j=0; j<10-2*i; j++)
            {
                System.out.print(":");
            }
            end();
            System.out.println();
        }  
        middle();
        for (int i=4; i>=1; i--)
        {
            for (int k=0; k<i; k++)
            {
                System.out.print(" ");
            }
            end();   
            for (int j=0; j<10-2*i; j++)
            {
                System.out.print(":");
            }
            beg();
            System.out.println();
        }  
        top();

    }

    public static void top()
    //prints the top and bottom bar of the hourglass
    {
        System.out.println("|\"\"\"\"\"\"\"\"\"\"|");
    }

    public static void middle()
    //prints the middle of the hourglass
    {
        System.out.println("     ||");
    }

    public static void beg()
    //prints the first slash on the left side
    {
        System.out.print("\\");
    }

    public static void end()
    //prints the end slash on the right side
    {
        System.out.print("/");
    }
}
