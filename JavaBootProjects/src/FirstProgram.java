import java.util.Scanner;

public class FirstProgram {


    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int num = 0;
        
        for (int i=1;i<=n;i++) {
        	for(int j=1;j<=i;j++) {
        		if(num == n) {
        			break;
        		}
        		num++;
        		System.out.print(i+" ");
        		
        	}
        }
    }
}
