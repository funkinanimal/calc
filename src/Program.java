import java.util.Scanner;


public class Program {
	
	Program(){}
	
	Calculator calc = new Calculator();
	
	Scanner sc = new Scanner(System.in);
	
	void run(){
		while(true){
			
			int a = 0, b = 0;
			String sign;
			System.out.print("Enter numbers:\n a:");
			a = sc.nextInt();
			System.out.print("\n b:");
			b = sc.nextInt();
			System.out.print("Choose operation( + - * / ) or 0 to break:");
			sign = sc.nextLine();
			
			if(sign == "+")
				calc.plus(a, b);
			if(sign == "-")
				calc.minus(a, b);
			if(sign == "*")
				calc.mult(a, b);
			if(sign == "/")
				calc.divide(a, b);
			if(sign == "0")
				break;
		}
		
		sc.close();
	}
}

