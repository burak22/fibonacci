import java.util.Scanner;

public class HelloWorld{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int loop = sc.nextInt();

        int x = 0;
        int y = 1;
        int sum = x+y;
        System.out.print("0 1");
        do{
            System.out.print(" " + sum);
            x = y;
            y = sum;
            sum = x+y;
            loop--;
        }
        while(loop>2);
        sc.close();
    }            
}