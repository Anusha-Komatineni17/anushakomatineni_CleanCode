import java.util.Scanner;
public class Main {
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.append("Enter components to calculate simple interest and compound interest (In order >>> Principle amount, Time Period and Rate of Interest in new lines)");
         double p= Double.parseDouble(sc.next());
         float t= Float.parseFloat((sc.next()));
         float r=Float.parseFloat(sc.next());
         SimpleInterest s=new SimpleInterest();
         CompoundInterest c=new CompoundInterest();
         System.out.append("Simple Interest is ").append(String.valueOf(s.calculate(p, t, r)));
         System.out.append("\nCompound Interest is ").append(String.valueOf(c.calculate(p, t, r)));
         System.out.append("\n1)highstandard\n2)abovestandard\n3)standard\n**VALUES ARE CASE SENSITIVE with no spaces**");
         System.out.append("\nEnter material required and area to build your house from here");
         String st=sc.next();
         float area= Float.parseFloat(sc.next());
         Compute cost=new Compute();
         cost.getValue(st,area);
       // System.out.append("Cost to build your house is").append(String.valueOf(result));
     }
}


