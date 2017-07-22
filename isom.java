import java.util.*;
class isom
{
    public static void main(String args[])
    {
        char c= ' ';
        char d=' ';
        char e=' ';
        char f=' ';
        int g=0,h=0,k=0,l=0;
        Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
        String s2=s.nextLine();
        char a[]=s1.toCharArray();
        char b[]=s2.toCharArray();
        for(int i=0;i<s1.length();i++)
        {
            for(int j=i+1;j<s1.length();j++)
            {
              if(a[i]==a[j])
              {
                c=a[i];
                d=a[j];
               }
            }
        }
        for(int i=0;i<s2.length();i++)
        {
            for(int j=i+1;j<s2.length();j++)
            {
               if(b[i]==b[j])
              {
                e=b[i];
                f=b[j];
            }
            }
        }
         g=s1.indexOf(c);
         h=s1.indexOf(d);
         k=s2.indexOf(e);
         l=s2.indexOf(f);
        if((g==k)&&(h==l))
        System.out.print("true");
        else
        System.out.print("false");
        
        
    }
}

