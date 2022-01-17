import java.util.Scanner;

public class Rectangular_star {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		String k = "";

		for (int j = 0; j < a; j++) {
			k += "*";
		}
		for (int i = 0; i < b; i++) {
			System.out.println(k);
		}
	}
}
