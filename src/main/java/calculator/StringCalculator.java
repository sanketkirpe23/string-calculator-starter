package calculator;

class StringCalculator {

	public int add(String input) {

		
		if (input.isEmpty()) {
			return 0;
		}
		String[] numbers = input.split(",");
		if (numbers.length == 1) {
			return Integer.parseInt(numbers[0]);
		}
		int sum = 0;
		for (String string : numbers) {
			sum = sum + Integer.parseInt(string);
		}
		return sum;

		
	}

}