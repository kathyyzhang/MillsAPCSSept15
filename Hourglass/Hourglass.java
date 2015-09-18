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
        for (int i=2; i<=5; i++)
        {
            for (int k=1; k<i; k++)
            {
                System.out.print(" ");
            }
            beg();   
            for (int j=0; j<12-2*i; j++)
            {
                System.out.print(":");
            }
            end();
            System.out.println();
        }  
        middle();
         for (int i=5; i>=2; i--)
        {
            for (int k=1; k<i; k++)
            {
                System.out.print(" ");
            }
            end();   
            for (int j=0; j<12-2*i; j++)
            {
                System.out.print(":");
            }
            beg();
            System.out.println();
        }  
        top();
        
    }

    public static void top()
    {
        System.out.println("|\"\"\"\"\"\"\"\"\"\"|");
    }

    public static void middle()
    {
        System.out.println("     ||");
    }

    public static void beg()
    {
        System.out.print("\\");
    }

    public static void end()
    {
        System.out.print("/");
    }
}
