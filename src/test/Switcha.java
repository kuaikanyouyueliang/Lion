
public class Switcha {
	public static void main(String[] args) {
		int i = 1, j = -1;
		switch (i) {
		case 0:
			j = 1;
			break;
		case 1:
			j = 2;
			break;
		}
		System.out.print("j=" + j);
	}
}
