package practice;
public class Arrays {

public static void main(String[] args) {

//single-dimensional array
int y[]= {100,50,40,30,15,20};
for(int i=0;i<5;i++) {
System.out.println("Elements of array y: "+y[i]);
}
//multidimensional array
int[][] z = {
            {5, 8, 2, 3}, 
            {12, 20, } };
      
      System.out.println("\nLength of row 1: " + z[0].length);
      }
}