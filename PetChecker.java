import java.util.Scanner;

import javax.print.DocFlavor.STRING;

import java.util.ArrayList;
public class PetChecker {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("##*******************************************##");
            System.out.println("##           WELCOME TO WANDERPETS           ##");
            System.out.println("##             I am Doctor Tin               ##");
            System.out.println("##     DO YOU HAVE PROBLEM WITH YOUR PET?    ##");
            System.out.println("##-------------------------------------------##");
            System.out.println("##              Press 1 : YES                ##");
            System.out.println("##              Press 2 : NO                 ##");
            System.out.println("##===========================================##");
            System.out.print("Enter your choice: ");
            int answer = s.nextInt();

            if (answer == 1) {
                System.out.print("Owner's name: ");
                String Oname = s.next();

                System.out.print("Address: ");
                String address = s.next();

                System.out.println(" =========   WELCOME TO WANDERPETS ==========");
                System.out.println("                 Owner's name: " + Oname);
                System.out.println("                 Owner's address: " + address );
                while (true) {
                    ArrayList<Pet> pets = new ArrayList<Pet>();
                    System.out.print("How many Pets would you like to add?");
                    int petss = s.nextInt();
                    for (int i = 0; i < petss; i++) {
                        System.out.println("Enter Pet's name: ");
                        String name = s.next();
                        System.out.println("Pet is a (dog,cat,etc.)?: ");
                        String kind = s.next();
                        System.out.println("Enter Pet  color: ");
                        String color = s.next();
                        System.out.println("Enter Pet concern (eyes, nose, arm..): ");
                        String concern = s.next();
                        Pet animal = new Pet(name, kind, color, concern);
                        pets.add(animal);
                        System.out.println("Your Pets: " + petss + "\n" + animal);
                    }

                    System.out.println("##*******************************************##");
                    System.out.println("##     Would you wanT to be directed in      ##");
                    System.out.println("##          your WANDERPET PORTAL?           ##");
                    System.out.println("##===========================================##");
                    System.out.println("##              Press 1 : YES                ##");
                    System.out.println("##              Press 2 : NO                 ##");
                    System.out.println("##===========================================##");
                    System.out.println("Enter you choice: ");
                    int choice = s.nextInt();
                    if (choice == 1) {
                        while (true) {
                            System.out.println("##*******************************************##");
                            System.out.println("##                PET CHECKER                ##");
                            System.out.println("##===========================================##");
                            System.out.println("##                                           ##");
                            System.out.println("##          Press 1 : To Add  Pet            ##");
                            System.out.println("##          Press 2 : To Remove Pet          ##");
                            System.out.println("##          Press 3 : To Display Pet         ##");
                            System.out.println("##          Press 4 : To Exit portal         ##");
                            System.out.println("##                                           ##");
                            System.out.println("##===========================================##");
                            System.out.print("\n Input Action to take: ");
                            char ch = s.next().toLowerCase().charAt(0);
                            switch (ch) {
                                case '1':
                                    System.out.println("Enter Pet's name: ");
                                    String name = s.next();
                                    System.out.println("Pet is a (dog,cat,etc.)?: ");
                                    String kind = s.next();
                                    System.out.println("Enter Pet  color: ");
                                    String color = s.next();
                                    System.out.println("Enter Pet concern (eyes, nose, arm..): ");
                                    String concern = s.next();
                                    Pet animal = new Pet(name, kind, color, concern);
                                    pets.add(animal);
                                    System.out.println("\nWelcome to Pet's Haven " + name+ ". A cute " +kind+". with a "+color+ " colored fur!. Let's check your " +concern+ "!");
                                    break;
                                case '2':
                                    System.out.println("Enter pet's name you want to remove: ");
                                    String remove = s.next().toUpperCase();
                                    if (!pets.contains(remove)) {
                                        System.out.println("Sorry " +remove+ " doesn't exist!");
                                        break;
                                    }
                                    int index = pets.indexOf(remove);
                                    System.out.println( "Goodbye! " +remove+ " Hope you are finally cured!");
                                    pets.remove(index + 1);
                                    System.out.println( "Goodbye! " +remove+ " Hope you are finally cured!");
                                    break;
                                case '3':
                                    for (Pet element : pets) {
                                        System.out.println(element);
                                    }

                                    break;
                                case '4':
                                    System.out.println("##*******************************************##");
                                    System.out.println("##           THANK YOU FOR USING             ##");
                                    System.out.println("##              PET CHECKER                  ##");
                                    System.out.println("##===========================================##");
                                    System.exit(0);
                                    break;
                                default:
                                    System.out.println("##*******************************************##");
                                    System.out.println("##               INVALID CHOICE              ##");
                                    System.out.println("##===========================================##");
                                continue;
                            }
                        }
                    }

                }
            }
            if (answer == 2) {
                System.out.println("##*******************************************##");
                System.out.println("##           THANKS FOR STOPPING BY          ##");
                System.out.println("##===========================================##");
                System.exit(0);
            }

            s.close();
        }
    }
}
