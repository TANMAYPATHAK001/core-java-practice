package basics;

import java.util.Scanner;
public class Sub_string {
    public static void main(String[] args) {

        // .substring() = A method used to extract portion of a string
        //                .substring(start, end)

        Scanner scanner = new Scanner(System.in);

        String email;
        String username;
        String domain;

        System.out.print("Enter your E-mail: ");
        email = scanner.nextLine();

        if(email.contains("@")){
            username = email.substring(0, email.indexOf("@"));
            domain = email.substring(email.indexOf("@"));

            System.out.println("Your E-mail is: " + email);
            System.out.println("Your Username is: " +username);
            System.out.println("Your domain is: " + domain);
        }
        else{
            System.out.println("Enter a valid E-mail!");
        }




        scanner.close();

//        String email = "Jojo69kriq@gmail.com";
//
//        String username = email.substring(0,email.indexOf("@"));
//        String domain = email.substring(email.indexOf("@") + 1);

    }
}