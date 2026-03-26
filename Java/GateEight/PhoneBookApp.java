import java.util.Scanner;
import java.util.ArrayList;
public class PhoneBookApp{
     static Scanner input = new Scanner(System.in);
     static ArrayList<Contact> contacts = new ArrayList<>();
            String contactMenu;
            String firstName;
            String lastName;
            String phoneNumber;
public static void main(String[] args){
           
}
public static void ContactMenu() {
            System.out.println("\n1. Add Contact needs :");
            System.out.println("2. Remove Contact");
            System.out.println("3. Find Contact by Phone Number");
            System.out.println("4. Find Contact by First Name");
            System.out.println("5. Find Contact by Last Name");
            System.out.println("6. Edit Contact");
            System.out.print("Enter choice: ");
            int choice = input.nextInt();
          
}
public static void addContactNeeds(Scanner input){
            System.out.println("Enter First Name: ");
            String firstName = input.nextLine();
            System.out.println("Enter Last Name: ");
            String lastName = input.nextLine();
            System.out.println("Enter Phone Number: ");
            String phoneNumber = input.nextLine();
            System.out.println("First Name: " + firstName);
            System.out.println("Last Name: " + lastName);
            System.out.println("Phone Number: " + phoneNumber);
            System.out.println("contact added successfully");
}
public static void removeContact(Scanner input){
            System.out.println("Enter Phone Number to delete: ");
            String phoneNumber = input.nextLine();
            contacts.removeIf(contact -> contact.getPhoneNumber().equals(phoneNumber));
System.out.println("contact removed successfully");

}
}
