/**
 * This is the method class of all logic practice2 in codingbat
 * 
 * @author clarence
 *
 */
public class logic2 {
	public static boolean makeBricks(int small, int big, int goal) {
		if ((small + big * 5) < goal)
			return false;

		if (small < (goal % 5))
			return false;

		return true;
	}

	public static int loneSum(int a, int b, int c) {
		if (a == b) {
			if (b == c) {
				return 0;
			} else
				return c;
		}
		if (b == c) {
			return a;
		}
		if (a == c) {
			return b;
		} else
			return a + b + c;
	}
	
	public static int luckySum(int a, int b, int c) {
		if (a == 13) {
			return 0;
		} else if (a != 13 && b == 13) {
			return a;
		} else if (c == 13) {
			return a + b;
		} else
			return a + b + c;
	}

}
