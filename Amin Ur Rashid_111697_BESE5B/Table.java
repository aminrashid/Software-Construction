package lab3;

public class Table {
    int capacity;                                                       //Amount of people per table
    String type;                                                        //Specify type of table
   //Parameterized Constructor
    public Table(){
        this.capacity=0;
        this.type=null;
    }
    //Set values for the table
    public void set_table(int cap,String ty){
        capacity=cap;
        type=ty;
    }
    //get values of the table
    public void get_table(){
        System.out.println("Capacity of table: " + capacity);
        System.out.println("Table type is: "+ type);
    }
}
