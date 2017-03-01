package lab3;

public class Reservation {
    int Reserve_id;                              //Reservation ID
    String start_time;                           //Time when reservation starts
    String end_time;                             //Time when reservation ends
    int total_people;                            //Amount of people for the reservation
    //Parameterized Constructor
    public Reservation(int rid){
        this.Reserve_id=rid;
    }
    //Function to set time
    public void set_time(String ST,String ET){
        start_time=ST;
        end_time=ET;
    }
    //function to set amount of people
    public void set_people(int TP){
        total_people=TP;
    }       
    //function to give details related to reservation
    public void get_reservation(){
        System.out.println("Reservation ID is: " + Reserve_id);
        System.out.println("The Start time and End time are  " + start_time +" and " + end_time +" respectively");
        System.out.println("Total number of people are: "+ total_people);
    }
}
