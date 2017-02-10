package exercise2Skeleton;

import java.text.DecimalFormat;
import java.util.ArrayList;


public class TestPolymorphism {

    public static void main(String[] args) {
        DecimalFormat f = new DecimalFormat("#,###.##");
        ArrayList<Material> materials = new ArrayList<>();

         
       

        Surface aSurface = new Surface("testSurface", 5.7, 5.7);

        for (int i = 0; i < materials.size(); i++) {
            String name = materials.get(i).getName();
            double req = materials.get(i).getMaterialReq(aSurface);
            double price = materials.get(i).calcTotalPrice(aSurface);
            System.out.println("Name: " + name + ", Requirement: "
                    + f.format(req) + " units, Price €" + f.format(price));
            System.out.println();
        }
        
  
        
    }
}
