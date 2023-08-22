import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter 0 for Normal mode OR 1 for Opposite mode :");
        int mode=scanner.nextInt();
        boolean isOppositeMode=(mode==1);
        SpecialCalculator specialCalculator=new SpecialCalculator(isOppositeMode);
        System.out.println("Enter the Choice:");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction:");
        int choice=scanner.nextInt();
        if (choice==1)
        {
            System.out.println("Enter the First Number:");
            int num1=scanner.nextInt();
            System.out.println("Enter the Second Number:");
            int num2=scanner.nextInt();
            System.out.println("Enter the Thid Number:");
            int num3=scanner.nextInt();
            int result=specialCalculator.add(num1,num2,num3);
            System.out.println("Result : "+result);
        }
        else if(choice==2)
        {
            System.out.println("Enter the First Number:");
            int num1=scanner.nextInt();
            System.out.println("Enter the Second Number:");
            int num2=scanner.nextInt();
            System.out.println("Enter the Thid Number:");
            int num3=scanner.nextInt();
            int result=specialCalculator.sub(num1,num2,num3);
            System.out.println("Result : "+result);
        }
        else{
            System.out.println("Invalid Operation.");
        }
    }
}
class  SpecialCalculator
{
    boolean isOppositeMode;

    public SpecialCalculator(boolean isOppositeMode) {
        this.isOppositeMode=isOppositeMode;
    }
    public int add(int a,int b,int c)
    {
        return isOppositeMode?a-b-c:a+b+c;
    }
    public int sub(int a,int b,int c)
    {
        return isOppositeMode?a+b+c:a-b-c;
    }
}