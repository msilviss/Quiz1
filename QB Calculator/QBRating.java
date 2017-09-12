import java.util.Scanner;

public class QBRating {
	Scanner input = new Scanner(System.in); {
		
		System.out.println("Enter number of TDs.");
		int touchdowns = input.nextInt();
		
		System.out.println("Enter number of Yards");
		int yards = input.nextInt();
		
		System.out.println("Enter number of Interceptions.");
		int interceptions = input.nextInt();
		
		System.out.println("Enter number of Completions.");
		int completions = input.nextInt();
		
		System.out.println("Enter number of attempts");
		int completions = input.nextInt();	
		
		double a = (((double)completions / attempts) - .3) * 5;
		
		double b = (((double)yards / attempts)- 3) * .25;
		
		double c = (((double)touchdowns / attempts) * 20);
		
		double d = 2.375 - (((double)interceptions / attempts) * 25);
		
		double rating = ((a+b+c+d)/6) * 100;
		if (attempts == 0) {
			return 0;
		}
		
		if (a > 2.375) {
			a = 2.375;
		}
		if (b > 2.375) {
			b = 2.375;
		}
		if (c > 2.375) {
			c = 2.375;
		}
		if (d > 2.375) {
			d = 2.375;
		}
		if (a < 0) {
			a = 0;
		}
		if (b < 0) {
			b = 0;
		}
		if (c < 0) {
			c = 0;
		}
		if (d > 0) {
			d = 0;
		}
	}
	double QB_Rating = ((a+b+c+d)/6)*100;
	
	System.out.println(QB_Rating);
			
		
}
