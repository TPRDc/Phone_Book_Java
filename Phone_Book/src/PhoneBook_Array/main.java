package PhoneBook_Array;
import java.util.Scanner;
import java.util.ArrayList;
public class main {
    Scanner input =new Scanner(System.in);
    ArrayList<String>  Contactname =new ArrayList<>();
    ArrayList<String> Contactnumber =new ArrayList<>();
    String option,name,number;

    public void Addcontacts(){
        System.out.print("Enter New Contacts Name => "); name =input.next();
        System.out.print("Enter New Contacts Phone Number => "); number =input.next();

        Contactname.add(name); Contactnumber.add(number);
        System.out.println("\nSaving Contact**********************\nDone\n");

        boolean x=false;
        while (!x){
            System.out.print("Continue to main menu y/n => ");
            String adContact =input.next();

            if(adContact.equalsIgnoreCase("y")){
                System.out.println();
                WelcomePage();
                Comput();
                break;
            } else if (adContact.equalsIgnoreCase("n")) {
                System.out.println("\nClosing Phonebook_______________________\nDone");
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
                if(Contactname.isEmpty() && Contactnumber.isEmpty())
                    System.out.println("Phone Book Is Empty\n");
                else
                    for(int i=0; i<Contactname.size(); i++)
                        System.out.println("\t("+i+") "+Contactname.get(i)+" - "+Contactnumber.get(i));
                        System.out.println();
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
    main m =new main();
    m.WelcomePage();
    m.Comput();
    }
}
