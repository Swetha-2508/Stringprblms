import java.util.Scanner;
public class Stringsplit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String new_1_str[]=str.split("\\s");
        String new_2_str[]=str.split(" ");
        String new_3_str[]=str.split("a",3);// split at a and limit is 3(split twice at a) and limit 1 prints the entire string
        for(int i=0;i<new_1_str.length;i++)
        {
            System.out.println(new_1_str[i]);
        }
        for(int i=0;i<new_2_str.length;i++)
        {
            System.out.println(new_2_str[i]);
        }
        for(int i=0;i<new_3_str.length;i++)
        {
            System.out.println(new_3_str[i]);
        }
    }
}
