import java.util.Scanner;

public class EvenandOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is even or odd: ");
        int num = sc.nextInt();
        String ans = checkEvenOrOdd(num);
        System.out.println(ans);
    }

    static String checkEvenOrOdd(int num){
        String ans;
        if(num % 2 == 0)
            ans = "The number " + num + " is Even.";
        else
            ans = "The number " + num + " is Odd.";
        return ans;
    }
}

