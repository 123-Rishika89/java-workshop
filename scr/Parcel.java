import java.util.Arrays;

public class Parcel {
    public static void main(String[] args) {
        double[] prices ={19.00,38.90,89.70,23.67,14.67,2.56};

        Arrays.sort(prices);


        System.out.println("price list in ascending order:");
        for (double price :prices){
            System.out.println(price);
        }
    }
    
}
