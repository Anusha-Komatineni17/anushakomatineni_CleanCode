package Calculate;
import java.util.Scanner;

public class HighStandard implements ConstructionCost {

    public float getCost(float area){
        Scanner sc=new Scanner(System.in);
        System.out.append(""+"\nDo you want your house to be fully automated");
        String automated=sc.next();
        float cost;
        if (automated.equals("yes")){
            cost= 2500 * area;
        }
        else
            cost= 1800 * area;
        return cost;
    }
}
