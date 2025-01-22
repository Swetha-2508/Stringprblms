import java.util.Scanner;
public class Stringformat {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int cupcake=sc.nextInt();
        Double mycupcake=Double.valueOf(cupcake); //Or double mycupcake=cupcake - automatic conversion is also possible
        double flour=(2.5*mycupcake)/12;
        double butter=(0.5*mycupcake)/12;
        double sugar=(1*mycupcake)/12;
        String totalflour=String.format("%.2f",flour); //roundof to two decimals
        String totalsugar=String.format("%.2f",sugar);
        String totalbutter=String.format("%.2f",butter);
        System.out.println("Flour: "+totalflour+" cups");
        System.out.println("Sugar: "+totalsugar+" cups");
        System.out.println("Butter: "+totalbutter+" cups");
    }
}
