import java.util.*;
class vowcon
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        char n = s.next().charAt(0);
         System.out.println(n);
        
        if((n=='a')||(n=='e')||(n=='i')||(n=='o')||(n=='u')||(n=='A')||(n=='E')||(n=='I')||(n=='O')||(n=='U'))
        {
            System.out.println("vowvel");
        }
        else 
        {
            System.out.println("consonant");
        }
        
    }
}
