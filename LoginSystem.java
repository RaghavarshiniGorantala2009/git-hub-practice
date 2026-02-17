import java.util.Scanner;
public class LoginSystem{
   public static void main(String[] args) {
    String Username="@Raghavarshini";
    String Password="12345";
    int Attempts=3;
    String EnteredUsername;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter username:");
    EnteredUsername=s.nextLine();
    String EnteredPassword;
    System.out.println("Enter password:");
    EnteredPassword=s.nextLine();
    while(Attempts>0){
        if((Username.equals(EnteredUsername))&&(Password.equals(EnteredPassword))){
    System.out.println("login Successfully"); 
    break;
        }
        else{
            Attempts--;
            System.out.println("Incorrect Username or Password");
            System.out.println("try again");
            
    }
   } 
   if(Attempts==0){
    System.out.println("Account Blocked");
   }
   s.close();
}
}

