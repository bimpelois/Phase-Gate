import java.util.Scanner;
import java.util.ArrayList;

public class ContactApp {
    static Scanner input = new Scanner(System.in);
    static ArrayList<Contact> contacts = new ArrayList<>();

    public static void main(String[] args){
        while (true) {
            ContactMenu();
        }
    }

    public static void ContactMenu() {
        System.out.println("\n1. Add Contact");
        System.out.println("2. Remove Contact");
        System.out.println("3. Find Contact by Phone Number");
        System.out.println("4. Find Contact by First Name");
        System.out.println("5. Find Contact by Last Name");
        System.out.println("6. Edit Contact");
        System.out.print("Enter choice: ");

        int choice = input.nextInt();
        input.nextLine();

        if (choice == 1) {
            addContactNeeds(input);
        } 
        else if (choice == 2) {
            removeContact(input);
        } 
        else if (choice == 3) {
            contactByPhoneNumber(input);
        } 
        else if (choice == 4) {
            contactByFirstName(input);
        } 
        else if (choice == 5) {
            contactByLastName(input);
        } 
        else if (choice == 6) {
            System.out.println("Goodbye");
            System.exit(0);
        }
    }

    public static void addContactNeeds(Scanner input){
        System.out.print("Enter First Name: ");
        String firstName = input.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = input.nextLine();

        System.out.print("Enter Phone Number: ");
        String phoneNumber = input.nextLine();

        Contact newContact = new Contact(firstName, lastName, phoneNumber);
        contacts.add(newContact);

        System.out.println("Contact added successfully");
    }

    public static void removeContact(Scanner input){
        System.out.print("Enter Phone Number to delete: ");
        String phoneNumber = input.nextLine();

        contacts.removeIf(contact -> contact.getPhoneNumber().equals(phoneNumber));

        System.out.println("Contact removed successfully");
    }

public static void contactByPhoneNumber(Scanner input){
        System.out.print("Enter Phone Number: ");
        String phoneNumber = input.nextLine();
         System.out.print("Enter First Name: ");
        String firstName = input.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = input.nextLine();
        Contact newContact = new Contact(firstName, lastName, phoneNumber);
        contacts.add(newContact);
        System.out.println("Contact");
    }
    }
}

class Contact {
    String firstName;
    String lastName;
    String phoneNumber;

    public Contact(String firstName, String lastName, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
