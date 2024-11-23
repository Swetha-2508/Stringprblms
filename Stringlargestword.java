import java.util.Scanner;
class Word
{
    static String findlongest(String text)
    {
        String longest="";
        String a[]=text.split(" ");
        for(String as : a)
        {
            if(as.length()>=longest.length())
            {
                longest=as;
            }
        }
        return longest;
    }
}
public class Stringlargestword extends Word {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String text=sc.next();
        System.out.println(findlongest(text));
    }   
}
