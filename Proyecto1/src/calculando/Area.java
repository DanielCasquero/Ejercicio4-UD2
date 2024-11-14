package calculando;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Introduce un radio");
		double radio = input.nextInt();
		double area = radio* radio * Math.PI;
		System.out.println("Area: " + area);
		
		
		
		input.close();
	}

}
