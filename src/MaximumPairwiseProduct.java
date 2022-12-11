import java.math.BigInteger;
import java.util.*;

public class MaximumPairwiseProduct {

    public BigInteger getMaxPairProduct(ArrayList<BigInteger> numbers){
        BigInteger product;
        Set<BigInteger> set = new LinkedHashSet<BigInteger>();
        set.addAll(numbers);
        numbers.clear();
        numbers.addAll(set);
        Collections.sort(numbers);
        System.out.println(numbers);
        product = numbers.get(numbers.size()- 1).multiply(numbers.get(numbers.size() - 2));
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
            product = mpp.getMaxPairProduct(sequence);
            System.out.println(product);
        }

    }
}
