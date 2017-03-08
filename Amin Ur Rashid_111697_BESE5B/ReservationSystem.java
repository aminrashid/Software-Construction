package lab3;

import java.util.Scanner;
public class ReservationSystem {
    public void booking(Reservation R1,Table tab1){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter time for your Reservation: ");
        String T1 = scanner.next();
        System.out.println("Enter total number of people for your Reservation: ");
        int tot_p = scanner.nextInt();
        
        if(tot_p>=6 && tot_p<=12){
           System.out.println("Enter end time of your Reservation");                //Large party so they can choose their own end time
           String T2 = scanner.next();
           R1.set_time(T1,T2);                                                      //Start and end times set
        }
        else{
            String T3="8:30PM";
            R1.set_time(T1,T3);                                                     //Start and end times set
        }
      
        System.out.println("Enter Table Type");
        String ty = scanner.next();
        System.out.println("Enter Capacity of table: ");
        int cap = scanner.nextInt();
        
        R1.set_people(tot_p);                                                       //Total amount of people set
        tab1.set_table(cap,ty);                                                     //Table details set
    }
   
    public static void main(String[] args){
        ReservationSystem Rs=new ReservationSystem();
        Customer cust=new Customer("Amin","Rashid","03002345765","arashid@gmail.com");
        Reservation R1=new Reservation(1);
        Table tab1=new Table();
        
        String chef[]={"Ali","Saad","Bilal","Asad"};
        String server[]={"Khan","Alli","Dawn","John","Fam","Mike"};
        String manager[]={"Lad"};
        String support[]={"Amin"};
        
        Staff S1=new Staff(chef,server,manager,support);
        
        Rs.booking(R1,tab1);
        System.out.println("*************Customer Reservation Details**************");       //Print all the details related to the reservation
        R1.get_reservation();
        cust.get_details();
        tab1.get_table();
    }    
}
