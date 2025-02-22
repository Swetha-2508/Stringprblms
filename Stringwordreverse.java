import java.util.Scanner;
class Stringwordreverse {
    public static void main(String agrs[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String words[]=str.split(" ");
        String reversestring="";
        for(String word:words)
        {
            String reverseword="";
            for(int i=word.length()-1;i>=0;i--)
            {
                reverseword+=word.charAt(i);
            }
            reversestring=reverseword+" ";
            System.out.print(reversestring);
        }   
    }
}
