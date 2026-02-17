import java.util.Scanner;
public class ATM_Machine {
    public static void main(String[] args) {
        int CorrectPin=12345;
        int EnteredPin;
        Double Balance=10000000.567;
        int Attempts=3;
        int choice;
        Scanner s=new Scanner(System.in);
        EnteredPin=s.nextInt();
        if((EnteredPin==CorrectPin)&&(Attempts<=3)){
            while(true){
                System.out.println("ATM MENU");
                System.out.println("1.Check Balance");
                System.out.println("2.Withdraw");
                System.out.println("3.Deposit");
                System.out.println("4.exit");
                System.out.println("Enter ur choice:");
                choice=s.nextInt();
                switch (choice) {
                    case 1:
                    System.out.println("your account balance is:"+Balance);    
                        break;
                    case 2:
                        System.out.println("enter withdrawl amount:");
                        Double Withdraw=s.nextDouble();
                        System.out.println(+(Balance-Withdraw));
                        System.out.println("Successfully withdrawed");
                        break;
                    case 3:
                        System.out.println("enter deposit amount:");
                        Double Deposit=s.nextDouble();
                        System.out.println(Balance+Deposit);
                        System.out.println("Successfully deposited");        
                    break;
                    case 4:
                        System.out.println("thanks for sparing time and visit again");
                        System.exit(0);
                        break;
                                    default:
                                        System.out.println("invalid choice");
                        break;
                }
            }
        }
        else{
            System.out.println("Incorrect pin,try again");
        }
    }
}
