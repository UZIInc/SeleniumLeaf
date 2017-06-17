package day1;

public class MyLoop {
	public static void main(String[] args) {
		String[] sa = { "tom ", "jerry " };
		for (int x = 0; x < 3; x++) {
			System.out.println(">>>>" +x );
			for (String s : sa) {
				System.out.print(x + " " + s);
				if (x == 1) {
					break;
				}
			}
		}
	}
}