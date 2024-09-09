package patterns;

public class Pattern1 {

	public static void main(String[] args) {
		int n=4;
		
		for(int i = 0; i< n*n; i++){
            System.out.print("*");

            //If n, prints new line
            if((i+1) % n ==0){
                System.out.println();
            }
        }

	}

}
