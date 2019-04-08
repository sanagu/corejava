package basicassignment;

public class ArmstrongRange {
	public static void main(String[] args) {
		
		for (int a = 100; a <= 999; a++) {
			int s = 0, b;
			b = a;
          int a1=a;
			while (a1 != 0) {
				int v = a1 % 10;
				s = s +( v * v * v);
				a1 = a1 / 10;
			}
			if (s == b)
				System.out.println("armstrong number"+s);

		}

	}
}
