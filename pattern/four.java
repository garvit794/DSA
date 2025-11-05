/* 
Question 2. print the pattern

* * * * 
* * *
* *
*

*/
import java.util.*;
public class four
{
    public static void main (String args[])
    {
        int i;
       for(i=4;i>=1;i--)
       {
        for(int j=1;j<=i;j++)
        {
            System.out.print("*");
        }
        System.out.println();
       }
    }
}
