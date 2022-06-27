class FizzBuzz{
	public static void main(String args[]){
		for (int num = 1; num <= 100; num++) {
			if (num % 3 == 0){
				if (num % 5 == 0){
					System.out.println("FizzBuzz");
				}
				else{
					System.out.println("Fizz");
				}
			}
			else if (num % 5 == 0){
				System.out.println("Buzz");
			}
			else {
				System.out.println(num);
			}
		}
	}
}
