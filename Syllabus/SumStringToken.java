import java.io.*;
import java.util.*;
public class SumStringToken
{
    public static void main(String args[])throws IOException
    {
        String s;
        int sum=0;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Integer with one space gap");
        s = sc.nextLine();
        StringTokenizer st = new StringTokenizer(s," ");
        
        while(st.hasMoreTokens())
        {
            String temp = st.nextToken();
            int n = Integer.parseInt(temp);
            System.out.println(n);
            sum = sum + n;
        }
        System.out.println("Sum of Integers = "+sum);
    }
}