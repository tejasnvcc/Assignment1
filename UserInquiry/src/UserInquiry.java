import java.util.Scanner;
public class UserInquiry{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

System.out.println("Enter your username.");
String username = scanner.nextLine();

System.out.println("Enter your password.");
String password = scanner.nextLine();

System.out.println("Hello, " + username + "! Welcome to CSC 200! Your password is " + password); 
scanner.close();
}
}