import Calculate.AboveStandard;
import Calculate.ConstructionCost;
import Calculate.HighStandard;
import Calculate.Standard;
public class Compute {
    public void getValue(String material, float area){
        String[] l1= {"high standard", "above standard", "standard"};
        ConstructionCost[] C ={new HighStandard(),new AboveStandard(),new Standard()};
        int r=0;
        for (int i=0;i<3;i++)
        {
            if (material.equals(l1[i])) {
                r = i;
                break;
            }
        }
        System.out.append("").append(String.valueOf(C[r].getCost(area)));
    }
}
