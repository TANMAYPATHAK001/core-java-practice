package basics;

public class nested_if {
    public static void main(String[] args) {

        boolean isStudent = false;
        boolean isSenior = true;
        double ticketPrice = 80;

        if(isStudent){
            if(isSenior) {
                System.out.println("You get a Senior and Student combined discount of 30%!🎊");
                ticketPrice *= 0.7;
            }
            else{
                System.out.println("You get a student discount of 10%🎉");
                ticketPrice *= 0.9;
            }
        }
        else{
            if(isSenior){
                System.out.println("You get a Senior discount of 20%!🥳");
                ticketPrice *= 0.8;
            }
            else{
                ticketPrice *= 1;
            }
        }

        System.out.printf("The price of the ticket is: Rs%.2f", ticketPrice);
    }
}
