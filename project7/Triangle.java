package project7;

public class Triangle {
  
    public static void main(String[] args) {  
    	Triangle(10);
    }  
      
    public static void Triangle(int i){  
    	for (int row = 1; row <= i; row++) {
    		//print out space
    		for (int space = 0; space < i-row; space++) {
    			System.out.print(" ");
			}
    		//print triangle
    		for (int col = 1; col<=row;col++) {
    			System.out.print(pascalTriangle(row,col)+" ");
			}
    		System.out.println("");
    		
		}
    } 
    
    public static int pascalTriangle(int row,int col){
        if(col==1||col==row){    //first row and the first element for each line
             return 1;
        }else{
             return pascalTriangle(row-1,col-1)+pascalTriangle(row-1,col); //each value equals to sum on last level
        }
    }
}  