package ie.atuTest;

import java.util.Scanner;

public class Employee {
    Name =
    PPS_ID =
    String Type = Full_time, Part_time, Contract;

    public static void main(String[] args) {
        try {
            System.out.println("Enter Employee name");
            Scanner input = new Scanner(System.in);
            String name = input.nextLine();
            Employee EINFO = new Employee();
            EINFO.setname(name);
            System.out.println("you entered :" + EINFO.getname());
        }
        catch (IllegalArgumentException e) {
            System.out.println("Invalid Name");
        }
        try {
            System.out.println("Enter Employee PPS ID");
            String name = input.nextLine();
            Employee EINFO = new Employee();
            EINFO.setPPS_ID(PPS_ID);
            System.out.println("you entered :" + EINFO.getPPS_ID());
        }
        catch (IllegalArgumentException e) {
            System.out.println("Invalid PPS ID");
        }
        try {
            System.out.println("Enter Employee Type");
            String name = input.nextLine();
            Employee EINFO = new Employee();
            EINFO.setType(Type);
            System.out.println("you entered :" + EINFO.getType());
        }
        catch (IllegalArgumentException e) {
            System.out.println("Invalid Employment Type");


        }
    }
}



