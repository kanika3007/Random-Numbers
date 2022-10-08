import java.util.Scanner;

public class MiniProject {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int myNumber=(int)(Math.random()*100);
        int userNumber = 0;      
        do{
            System.out.println("Guess any number:");
            userNumber=sc.nextInt();
            if(userNumber==myNumber)
            {
                System.out.println("*****CORRECT NUMBER*****");
                break;
            }
            else if(userNumber > myNumber)
            {
                System.out.println("YOUR NUMBER IS GREATER THAN THE EXPECTED ONE");
            }
            else if(userNumber<myNumber)
            {
                System.out.println("YOUR NUMBER IS TOO SMALL");
            }
        }while(userNumber >=0);
        System.out.println("My number was:");
        System.out.println(myNumber);
        sc.close();
    }
}
