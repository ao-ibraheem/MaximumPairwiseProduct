import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MaximumPairwiseProduct {

    public BigInteger getMaxPairProduct(ArrayList<BigInteger> numbers, int arraySize){
        int i = 2;
        BigInteger product,n1,n2;

        n1 = Collections.max(numbers,null);
       // System.out.println(numbers);
        while(Collections.max(numbers,null)==n1){
            numbers.remove(n1);
        }
       //System.out.println(numbers);

        n2 = Collections.max(numbers,null);
        product = n1.multiply(n2);
        return product;
    }

    public static void main(String[] args) {
        int n,i=0;
        BigInteger product;
        MaximumPairwiseProduct mpp = new MaximumPairwiseProduct();
        ArrayList<BigInteger> sequence = new ArrayList<BigInteger>();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        while(i<n){
            sequence.add(BigInteger.valueOf(sc.nextInt()));
            i++;
        }
        sc.close();

        if(n>1){
            product = mpp.getMaxPairProduct(sequence,n);
            System.out.println(product);
        }

    }
}
