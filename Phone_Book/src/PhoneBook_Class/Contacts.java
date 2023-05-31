package PhoneBook_Class;
import java.util.Scanner;

public class Contacts {
    Scanner input =new Scanner(System.in);
    String option;
    static String name,number;
    contactsList contactsList =new contactsList(name,number);

    public void Addcontacts(){
        System.out.print("Enter New Contacts Name => "); name =input.next();
        System.out.print("Enter New Contacts Phone Number => "); number =input.next();
        contactsList.setName(name); contactsList.setNumber(number);
        System.out.println("\nSaving Contact...................\nDone\n");

        boolean x=false;
        while (!x){
            System.out.print("Continue Searching  Contact y/n => ");
            String adContact =input.next();

            if(adContact.equalsIgnoreCase("y")){
                System.out.println();
                WelcomePage();
                Comput();
                break;
            } else if (adContact.equalsIgnoreCase("n")) {
                System.out.println("\nClosing Phonebook................\nDone");
                x=false; break;
            }
        }
    }

    public void Comput(){
        Userinput();
        switch (option){
            case "1":
                Addcontacts();
                break;
            case "2":
                if(contactsList.getName() == null)
                    System.out.println("Phone Book Is Empty\n");
                else
                    System.out.println("\n"+"Name: "+contactsList.getName()+"\n"+"Phone: "+contactsList.getNumber()+"\n");
                Comput();
                break;
            case "3":
                System.out.println("\nClosing Phone Book................\nGood Bey");
                break;
            default:
                System.out.println("Invalid Option");
                break;
        }
    }

    public void Userinput(){
        System.out.println("""
                1 => Add Contacts
                2 => Get Contacts
                3 => Close Phone Book""");
        option =input.next();
    }

    public void WelcomePage(){
        System.out.println("Welcome To Your PhoneBook");
    }

    public static void main(String[] args) {
        Contacts contacts =new Contacts();
        contacts.WelcomePage();
        contacts.Comput();
    }
}
