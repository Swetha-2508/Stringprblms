import java.util.Scanner;
public class String_uppertolower_and_lowertoupper{
    public static void main(String args[])
    {
        Scanner sc =new Scanner (System.in);
        String str=sc.nextLine();
        char arr[]=str.toCharArray();
        for(int i=0;i<str.length();i++)
        {
            char ch=arr[i];
            if(Character.isLowerCase(ch))
            {
                arr[i]=Character.toUpperCase(ch);
            }
            else
            {
                arr[i]=Character.toLowerCase(ch);
            }
        }
        String convertedStr = new String(arr);
        System.out.println("Converted string: " + convertedStr);
    }
}
