import java.util.*;
class Target
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String ss[]=s.nextLine().split(" ");
        int n[]=new int[ss.length];
        int a=s.nextInt();
        for(int i=0;i<ss.length;i++)
        {
            n[i]=Integer.parseInt(ss[i]);
        }
        for(int i=0;i<ss.length-1;i++)
        {
            for(int j=i+1;j<ss.length;j++)
            {if(n[i]+n[j]==a)
            System.out.print(n[i]+" "+n[j]);
            break;
            }
            
        }
    }
}
