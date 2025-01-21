import java.util.Scanner;
public class Stringvowelsconsonantsnumberscount {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int vcount=0;
        int ccount=0;
        int ncount=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='a'|| str.charAt(i)=='e'||str.charAt(i)=='i'|| str.charAt(i)=='o'||str.charAt(i)=='u')
            {
                vcount++;
            }
            else if(str.charAt(i)>='a'&&str.charAt(i)<='z')
            {
                ccount++;
            }
            else if(str.charAt(i)>='0'&&str.charAt(i)<='9')
            {
                ncount++;
            }
        }
        System.out.println("Vowels: "+vcount);
        System.out.println("Consonants: "+ccount);
        System.out.println("Numbers: "+ncount);
    }
}
