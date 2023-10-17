import java.util.*;
public class largest_num {
    public static void main(String[] args)
    {
        int num1,num2,num3;
        Scanner sc=new Scanner(System.in);
                num1=sc.nextInt();
                num2=sc.nextInt();
                num3=sc.nextInt();
                if(num1>=num2 && num1>=num3)
                    System.out.println("largnum "+num1);
                else if(num2>=num3 && num2>=num1)
                    System.out.println("largnum "+num2);
                else
                    System.out.println("largnum "+num3);
    }

}
