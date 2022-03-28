package view;

import model.Admin;

import java.util.Scanner;

public class Login {
    Scanner sc=new Scanner(System.in);
    public boolean Login(){
        String userName;
        String password;
        System.out.println("please enter username");
        userName=sc.nextLine();
        System.out.println("please enter password");
        password=sc.nextLine();

        return userName.compareTo(Admin.ADMINUSERNAME)==0 && password.compareTo(Admin.ADMINPASSWORD)==0;


    }
}
