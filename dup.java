import java.io.*;
import java.util.*;
class dup
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String a=s.next();
        int f=0;
       // Set st=new LinkedHashSet();
        for(int i=0;i<a.length()-1;i++)
        {f=0;
            for(int j=i+1;j<a.length();j++)
            {if(a.charAt(i)==a.charAt(j))
            f=1;
            }if(f==0)
        System.out.print(a.charAt(i));
            
            
        }
                  }
}





