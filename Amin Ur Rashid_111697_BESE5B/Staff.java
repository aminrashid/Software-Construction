package lab3;

public class Staff {
    String[] chef=new String[4];
    String[] server=new String[6];
    String[] manager=new String[1];
    String[] support=new String[1];
    
    public Staff(String c[],String s[],String m[],String s1[]){
       this.chef=c;
       this.server=s;
       this.manager=m;
       this.support=s1;
    }
    public void get_staff(){
        System.out.println("Staff Members available are: ");
        System.out.println("Name of the Chefs are: " + chef);
        System.out.println("Name of the Servers are: "+ server);
        System.out.println("Name of the Manager is: " + manager);
        System.out.println("Names of the Support Staff are: " + support);
    }
}
