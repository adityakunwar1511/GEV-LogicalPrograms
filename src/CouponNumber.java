import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class CouponNumber {

    public static int generateRandomNumber(int range) {
        Random random = new Random();
        return random.nextInt(range) + 1; }
    
    public static int processDistinctCoupons(int n) {
        HashSet<Integer> collectedCoupons = new HashSet<>(); 
        int randomNumberCount = 0;

        while (collectedCoupons.size() < n) {
            int newCoupon = generateRandomNumber(n);
            randomNumberCount++;
            collectedCoupons.add(newCoupon); }

        return randomNumberCount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of distinct coupon numbers: ");
        int n = scanner.nextInt();

        int totalRandomNumbers = processDistinctCoupons(n);
        System.out.println("Total random numbers needed to generate all distinct coupons: " + totalRandomNumbers);

    }
}
