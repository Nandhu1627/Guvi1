import java.util.*;
class swap1
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
        char a[]=s1.toCharArray();
        char b=' ';
        char c=' ';
        if(s1.length()%2==0)
        {
        for(int i=0;i<s1.length();i=i+2)
        {
            b=a[i];
            c=a[i+1];
            System.out.print(c);
        System.out.print(b);
        }
        }
        else
        {
            for(int i=0;i<s1.length()-1;i=i+2)
        {
            b=a[i];
            c=a[i+1];
            System.out.print(c);
        System.out.print(b);
        }
        System.out.print(s1.charAt(s1.length()-1));
        }
        
        
    }
}

