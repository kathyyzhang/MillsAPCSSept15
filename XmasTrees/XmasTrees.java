/**
 * Prints Christmas trees.
 * 
 * @author Kathy Zhang
 * 9.29.15
 */
public class XmasTrees
{
    public static void main(String[] args)
    {
        PrintTree(4,3);

    }
    public static void OneRow(int spaces, int stars)
    {
        for (int i=0; i<spaces; i++)
        {
            System.out.print(" ");
        }
        for (int j=0; j<stars; j++)
        {
            System.out.print("*");
        }
        System.out.println();
    }
    public static void TreePart(int startNum, int height, int segment)
    {
        for (int i=0; i<height; i++)
        {
            OneRow(height-(i+1)+(segment-(startNum-1)/2), startNum+(i*2));
        }
    }
    public static void PrintTree(int height, int segment)
    {
        for (int i=0; i<segment; i++)
        {
            TreePart(2*i+1, height, segment);
        }
         OneRow(height+segment-1, 1);
         OneRow(height+segment-1, 1);
         OneRow(height+segment-4, 7);
    }
}