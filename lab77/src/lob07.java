import java.util.Scanner;
public class lob07 
{
	public static void main(String args[]){}
    static int fact(int num) {
	int factorial;

	for(factorial = 1; num > 1; num--){
		factorial *= num;
	}
	return factorial;
    }
    static int ncr(int n,int r) {
	return fact(n) / ( fact(n-r) * fact(r) );
    }
    
	int rows, i, j;

	//getting number of rows from user
	System.out.println("Enter number:");
	Scanner scanner = new Scanner(System.in);
	rows = scanner.nextInt();
	scanner.close();

	System.out.println("The triangular shaped figure for an input of" + rows + "is:");
	for(i = 0; i < rows; i++) {
		for(j = 0; j < rows-i; j++){
			System.out.print(" ");
		}
		for(j = 0; j <= i; j++){
			System.out.print(" "+ncr(i, j));
		}
		System.out.println();
 	}
    }
}