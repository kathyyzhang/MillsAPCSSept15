/**
 * Programming Project #1. Prints out a cool design. :)
 * 
 * @author Kathy Zhang
 * 9.21.15
 */
public class PProject1
{
   public static void main(String[] args)
   {
       for (int i=0; i<7; i++)
       {
           for (int j=6; j>i; j--)
           //prints left asterisks
           {
               System.out.print("*");
            }
           for (int k=0; k<=i; k++)
           //prints left spaces
           {
               System.out.print(" ");
            }
           for (int l=0; l<12-2*i; l++)
           //prints forward slashes
           {
               System.out.print("/");
            }
           for (int m=0; m<2*i; m++)
           //prints back slashes
           {
               System.out.print("\\");
            }
           for (int n=0; n<=i; n++)
           //prints right spaces
           {
               System.out.print(" ");
            }
           for (int o=6; o>i; o--)
           //prints right asterisks
           {
               System.out.print("*");
            }
            System.out.println();
        }
    }
}

