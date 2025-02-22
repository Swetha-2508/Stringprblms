import java.util.*;
public class Stringfunction
{

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        int a=A.length();
        int b=B.length();
        int c=a+b;
        System.out.println(c);
        if(A.compareTo(B)<0) //compareTo function returns 0 if it is equal negative number - lexicographical order (lexicographical order - dict order) 
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
        if(A.compareTo(B)==0)
        {
            System.out.println("Equal string");
        }
        String first1=A.substring(0,1).toUpperCase();
        String first2=B.substring(0,1).toLowerCase();
        String remain1=A.substring(1,a);
        String remain2=B.substring(1,b);
        System.out.println(first1+remain1+" "+first2+remain2);
        
    }
}


