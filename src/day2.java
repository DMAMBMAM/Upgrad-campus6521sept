import java.util.*;
public class day2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
         float a=sc.nextFloat();
        float b=sc.nextFloat();
        float c=sc.nextFloat();
        float d=sc.nextFloat();
        float e=sc.nextFloat();
        float avg=(a+b+c+d+e)/500;
        float per=avg*100;
        System.out.println(per);
    }
}
