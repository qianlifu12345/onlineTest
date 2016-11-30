package project4;

public class Matrix {
	
	public static int[][]  multiply(int[][] a, int[][] b) {
		if (a[0].length!=b.length) {
			System.out.println("Two matrix cannot multiply");
			return null;
		}
		int[][] result = new int[a.length][b[0].length];  
        for(int i=0; i<a.length; i++) {  
            for(int j=0; j<b[0].length; j++) {  
            	
            	int sum=0;
            	for (int k = 0; k < a[0].length; k++) {
					sum=sum+a[i][k]*b[k][j];
					
				}
                result[i][j] = sum;   
            }  
        }  
        return result;  
		
	}

	public static void main(String[] args) {
		//two matrix have same col and row
        int[][] a = new int[][]{{1,2},{3,4}};  
        int[][] b = new int[][]{{5,6},{7,8}}; 
        int[][] result=multiply(a,b);
        
        for(int i=0; i<result.length; i++) {  
            for(int j=0; j<result[0].length; j++) {  
                System.out.print(" " + result[i][j]);  
            }  
            System.out.println();  
        }  
        System.out.println();
        
        //two matrix have different col and row
        int[][] c = new int[][]{{1,2,3},{5,6,7}};  
        int[][] d = new int[][]{{8,11},{9,12},{10,13}}; 
        result=multiply(c,d);
        
        for(int i=0; i<result.length; i++) {  
            for(int j=0; j<result[0].length; j++) {  
                System.out.print(" " + result[i][j]);  
            }  
            System.out.println();  
        }  
        
        System.out.println();  
        
        
        //two matrix have different col and row,and handle the exception
        int[][] e = new int[][]{{1,2,3},{5,6,7}};  
        int[][] f = new int[][]{{1,2,3},{5,6,7}};
        result=multiply(e,f);
        
	        if (result!=null) {
				for (int i = 0; i < result.length; i++) {
					for (int j = 0; j < result[0].length; j++) {
						System.out.print(" " + result[i][j]);
					}
					System.out.println();
				}
				// TODO Auto-generated method stub
			}

	}

}
