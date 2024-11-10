import java.util.Scanner;

public class Stringadjust {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                System.out.printf("%-15s%03d%n",s1,x); //-15 string adjusted leftside within 15 character and 03 pads zero if it for two,one digit numbers [04-pads zero if it is for three,two,one digit number]
            }
            System.out.println("================================");

    }
}
