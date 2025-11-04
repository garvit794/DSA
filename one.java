/*
Question 1. print the pattern

* * * * *
* * * * *
* * * * *
* * * * *

*/
import java.util.*;
public class one
{
    public static void main(String args[])
    {
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=5;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
