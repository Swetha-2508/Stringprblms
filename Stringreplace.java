import java.util.Scanner;
public class Stringreplace {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=sc.nextLine();
        String output=str.replace('a','@').replace('b','$');
        System.out.println(output);
        String wordreplace=str.replace("World","Java");
        System.out.println(wordreplace);
    }
}
