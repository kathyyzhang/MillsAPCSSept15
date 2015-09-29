/**
 * Prints out Christmas trees given height and segment number.
 * 
 * @author Kathy Zhang
 * 9.29.15
 */
public class ChristmasTrees
{
    public static void main(String[] args)
    {
        int height = 5;
        int segment = 3; 
        printTop(height);
        printTree(segment);
    }

    public static void printTop(int number)
    {
        for (int i=1; i<=number; i++)
        {
            for (int j=number; j>=i; j--)
            {
                System.out.print(" ");
            }
            for (int k=1; k<=3*i-(i+1); k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printTree(int number)
    {
        for (int l=1; l<=number; l++)
        {
            for (int i=1; i<=number; i++)
            {
                for (int j=number; j>=i; j--)
                {
                    System.out.print(" ");
                }
                for (int k=1; k<=3*i-(i+1); k++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
