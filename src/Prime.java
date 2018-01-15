public class Prime {
	public static void main(String[] args) {
		int input = 10;
		displaySeries(input);
	}
	public static boolean isPrime(int n) {
		if (n % 2 == 0) return false;
		for(int i = 3; i * i <= n; i += 2) {
			if(n % i== 0)
				return false;
		}
		return true;
	}
	public static void displaySeries(int input) {
		int current = 2;
		for(int i = 0; i < input; i++) {
			while(true) {
				if(isPrime(current)) {
					System.out.print(current + " ");
					current++;
					break;
				}
				current++;
			}
		}
	}
}