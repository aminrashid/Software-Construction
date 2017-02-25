package lab2;


import java.util.Scanner;

public class Lab2 {

    public static void main(String[] args) {
    
        int x [][]={{3,2},{2,3}};
        int y[][]= {{4,4},{3,7}};
      
        Matrix m1=new Matrix(2,2,2,2,x,y);
        int product[][]=m1.Multiplication();
       
        
    }
}
