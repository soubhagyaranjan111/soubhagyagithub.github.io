import java.util.Scanner;

class myname{
    public static void main(String[] args) {
        int a,b,sum;

       try (/* int a=5;
                float f=3.5f;
                double d=35.50390*/
        Scanner sc = new Scanner(System.in); {
            System.out.println("Enter first number");
                 int a=sc.nextInt();
      System.out.println("Enter second number");
                  int b=sc.nextInt();
        }
        sum=a-b;
            System.out.println("sub of two numbers ="+sum);

    }
        
    }
