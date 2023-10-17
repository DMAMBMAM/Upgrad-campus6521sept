import java.util.*;
public class largnumto {
    public static void main(String[] args)
    {
        int num1,num2,num3,largnum;
        Scanner sc=new Scanner(System.in);
        num1=sc.nextInt();
        num2=sc.nextInt();
        num3=sc.nextInt();
        largnum=(num1>num2)?(num1>num3?num1:num3):(num2>num3?num2:num3);
        System.out.println("largest no: "+largnum);
    }
}
