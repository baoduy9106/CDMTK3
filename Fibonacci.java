package algorithm;

public class FibonacciNumber {
public static void main(String[] args) {
	int num = 10; // test from số 3 trở lên
	//fibo 0 = 0 -> default
	//fibo 1 = 1 -> default
	//fibo 2 = 1 -> = fibo(x-1) + fibo(x-2)
	//fibo 3 = 2 -> = fibo(2) + fibo(1)
	//fibo 4 = 3 -> = fibo(3) + fibo(2)
	//fibo 5 = 5 -> = fibo(4) + fibo(3)
	int fibo = fibonacci(num);
	System.out.println("fibo of " + num + " = " + fibo);
}
public static int fibonacci(int num) {
//01
//    if (num <= 1) {
//        return num;
//    }
//    return fibonacci(num - 1) + fibonacci(num - 2);
//    //O(2^n)
	
//02
	 if (num <= 1) {
         return num;
     }

     int current = 0;
     int pref1 = 1;
     int pref2 = 0;

     for (int i = 2; i <= num; i++) {
         current = pref1 + pref2;
         pref2 = pref1;
         pref1 = current;
     }
     return current;
}
}
