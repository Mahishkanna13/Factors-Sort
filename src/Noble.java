import java.util.Arrays;
import java.util.Scanner;

public class Noble {
    public static int NobleCount(int [] Array)
    {
        Arrays.sort(Array);
        int PreviousCount=0;
        for (int i=Array.length-1;i>=0;i--)
        {
            if(Array[i]==PreviousCount)
            {
                return 1;
            }
            PreviousCount++;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int Size= scanner.nextInt();
        int [] Array=new int[Size];
        for (int i=0;i<Size;i++)
        {
            Array[i]=scanner.nextInt();
        }
        System.out.println(NobleCount(Array));
    }
}
