import java.util.*;
class fact
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int s1=s.nextInt();
        int tem=1;
        for(int i=s1;i>0;i--)
        {
            tem=tem*i;
        }
        System.out.print(tem);
    }
}
