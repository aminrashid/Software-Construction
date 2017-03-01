package lab3;

public class Customer {
    String Fname;
    String Lname;
    String Phone_no;
    String email;
    //Parameterized Constructor
    public Customer(String Fn,String Ln,String Pno,String em){            
        this.Fname=Fn;
        this.Lname=Ln;
        this.Phone_no=Pno;
        this.email=em;
    }
    //Function to get all the details of a customer
    public void get_details(){
        System.out.println("Name of the Customer is: " + Fname + " " + Lname);
        System.out.println("Phone number of the Customer is: " + Phone_no);
        System.out.println("Email of the Customer is: " + email);
    }
}
