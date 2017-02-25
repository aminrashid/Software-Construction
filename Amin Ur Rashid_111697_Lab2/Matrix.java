
package lab2;


public class Matrix {
    
      int firstrow;                            //Row for the first matrix
      int firstcol;                            //Column for the first matrix
      int secondrow;                           //Row for the second matrix
      int secondcol;                           //Column for the second matrix
        
      int first[][];                           //Array for the first matrix
      int second[][];                          //Array for the second matrix
      int prod[][];                            //Array for the product
      
      Matrix(int w,int x, int y, int z, int f[][],int s[][]){                                    //Parameterized Constructor
          this.firstrow=w;
          this.firstcol=x;
          this.secondrow=y;
          this.secondcol=z;
          
          first=new int[firstrow][firstcol];                                 //Giving the first matrix the rows and columns required
          first=f;                                                  
          second=new int[secondrow][secondcol];                              //Giving the second matrix the rows and columns required
          second=s;
      }
    
    public int[][] Multiplication(){
 
        int i,j,k;                                                          //variables for iteration
        int sum=0;                                                            //variable for the sum
        int prod[][]=new int[firstrow][secondcol];
        
        for (  i= 0 ; i < firstrow ; i++ )
         {
            for ( j = 0 ; j < secondcol ; j++ )
            {   
               for ( k = 0 ; k < secondrow ; k++ )
               {
                  sum = sum + first[i][k]*second[k][j];
               }
 
               prod[i][j] = sum;
               sum = 0;
            }
         }
        return prod;
      }
    
    public void print(){
         int i,j;
        System.out.println("Product Matrix:-");
         
         for ( i = 0 ; i < 2 ; i++ )
         {
            for ( j = 0 ; j < 2 ; j++ )
               System.out.print(prod[i][j]+"\t");
            
            System.out.print("\n");
         }
    }
}
