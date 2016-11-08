package Week2;

/**
 * Weekly_Questions
 * @author Winnie Nov 2, 2016
 * Week2Hard2.java
 * Question: The problem is #7 from Project Euler: By listing the 
 * first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that 
 * the 6th prime is 13. What is the 10001st prime number?
 * Can I use a library function to check if a number is prime? 
 * You should be able to do this relatively efficiently 
 * (at least for the test case of the 10001st prime number) 
 * without using a library function.
 */
public class Week2Hard2 {

	public static void main(String[] args){
		//System.out.println(nthPrimeNumber(10001));
		System.out.println(prime(10001));
	}
	
	public static int prime(int n){
		int counter = 0; 
		int ans = 0;
		for(int i = 1; ; i++){
			if(isPrime(i)){
				counter++;
			}
			if(counter == n){
				ans = i;
				break;
			}
		}
		return ans; 
	}
	
	public static boolean isPrime(int n){
		if(n < 2) return false;
		for(int i = 2; i * i <= n; i++){
			if(n % i == 0) return false;
		}
		return true;
		
	}
//
//	public static int prime(int n){
//		int counter = 0;
//		int ans = 0;
//		for(int i = 1; ; i++) {
//		    if(isPrime(i))
//		        counter++;
//
//		    if(counter == n) {
//		       ans = i;
//		        break;
//		    }
//		}
//		return ans;
//	}
//
//	private static boolean isPrime(int n) {
//		if(n < 2) return false;
//		for(int i = 2; i*i <= n; i++){
//			if(n % i == 0) return false;
//		}
//		return true;
//	}
	
//	public static int nthPrimeNumber(int num){
//		ArrayList<Integer> list = new ArrayList<Integer>();
//		list.add(2);
//		list.add(3);
//		int counter = 4;
//		while(list.size() < num){
//			if(counter%2 != 0 && counter%3 != 0){   //if number is not multiple of 2 nor 3
//				int temp = 4;
//				while(temp*temp <= counter){   
//					if(counter%temp == 0) break;
//					temp++;
//				}
//				if(temp*temp > counter){   //checks if temp^2 is greater than the counter
//					list.add(counter);
//				}
//			}
//			counter++;
//		}
//		return list.get(num-1);
//	}
}
