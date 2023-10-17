import java.util.*;
public class weekday {
    public static void main(String[] args){
        int num;
        System.out.println("Enter day no: ");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        switch(num) {
            case 1:
                System.out.println("sun");
                break;
            case 2:
                System.out.println("mon");
                break;
            case 3:
                System.out.println("tue");
                break;
            case 4:
                System.out.println("wed");
                break;
            case 5:
                System.out.println("thu");
                break;
            case 6:
                System.out.println("fri");
                break;
            case 7:
                System.out.println("sat");
                break;
        }
        System.out.println();
    }
}
