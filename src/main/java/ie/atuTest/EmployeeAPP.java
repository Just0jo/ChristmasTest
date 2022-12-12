package ie.atuTest;

import java.util.Scanner;

public class EmployeeAPP extends Employee{
    public static void main(String[] args) {

        try {
            System.out.println("Enter Employee name");
            String name = input.nextLine();
            EmployeeAPP EAPP = new EmployeeAPP();
            EAPP.setname(name);
            System.out.println("you entered :" + EAPP.getname());
        }
        catch (IllegalArgumentException e) {
            System.out.println("Invalid Name");
        }
        try {
            System.out.println("Enter Employee PPS ID");
            String name = input.nextLine();
            EmployeeAPP EAPP = new EmployeeAPP();
            EAPP.setPPS_ID(PPS_ID);
            System.out.println("you entered :" + EAPP.getPPS_ID());
        }
        catch (IllegalArgumentException e) {
            System.out.println("Invalid PPS ID");
        }
        try {
            System.out.println("Enter Employee Type");
            String name = input.nextLine();
            EmployeeAPP EAPP = new EmployeeAPP();
            EAPP.setType(Type);
            System.out.println("you entered :" + EAPP.getType());
        }
        catch (IllegalArgumentException e) {
            System.out.println("Invalid Employment Type");
        }
        EmployeeAPP EAPP = new EmployeeAPP(toString());
    }

}
