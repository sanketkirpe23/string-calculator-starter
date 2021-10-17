package calculator;

class StringCalculator {

	public int add(String input) {

		if (input.isEmpty()) {
			return 0;
		}
		if (input.length() == 1) {
			return Integer.parseInt(input.substring(0,1));
		}
		String delimiter = ",";
		if (input.substring(0, 3).contains("//")) {
			delimiter = input.substring(2, 3);
			input = input.substring(4);
		}
		if (input.contains("\n")) {
			String temp = input.replaceAll("\\n", delimiter);
			return getSum(temp, delimiter);
		} else
			return getSum(input, delimiter);
	}

	public int getSum(String input, String delimiter) {
		String[] numbers = input.split(delimiter);
		int sum = 0;
		for (String string : numbers) {
			sum = sum + Integer.parseInt(string);
		}
		return sum;

	}

}