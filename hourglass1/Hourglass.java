public class Hourglass
{
    public static void main(String[] args)
    {
        top();
        for (int i=4; i>0; i--)
        {
            for (int j=i; j<4; j--)
            {
                System.out.print(" ");
            }
            beg();
            for (int k=0; k<10-2*i; k++)
            {
                System.out.print(":");
            }
            end();
            System.out.println();
        }
        mid();
        /*for (int i=4; i>0; i--)
        {
            for (int j=i; j>0; j--)
            {
                System.out.print(" ");
            }
            end();
            for (int k=4; k>10-2*i; k++)
            {
                System.out.print(":");
            }
            beg();
            System.out.println();
        }
        top();	*/
    }
        public static void beg()
        {
            System.out.print("\\");
        }
        public static void mid()
        {
            System.out.print("      ||");
        }
        public static void end()
        {
            System.out.print("/");
        }
        public static void top()
        {
            System.out.println("|\"\"\"\"\"\"\"\"\"\"|");
        }

    }
