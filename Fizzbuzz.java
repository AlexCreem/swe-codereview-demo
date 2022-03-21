public class Fizzbuzz { 
    
    /**
	 * Process a number
	 * @param num a number
	 * @return a string corresponds to that number
	 */
	public static String processNumber(int num) {
		String result=Integer.toString(num);
		if (num %3 ==0 && num %5 ==0) {
			result = "Fizzbuzz";
		}
		else if (num%3 ==0) {
			result = "Fizz";
		}
		else if (num%5 ==0) {
			result = "Buzz";
		}
        return result;
    }
    
    /**
	 * Process numbers
	 * @param nums an array of numbers
	 * @return a string corresponds to that numbers array
	 */
	public static String processNumbers(int[] nums) {
        String result = "";
        
        for (int i= 0;i < nums.length; i++) {
        	if (i != nums.length -1) {
        		result += processNumber(nums[i]) + ", ";
        	}
        	else {
        		result += processNumber(nums[i]);
        	}
        	
        }
        return result;
    }
    
    /**
	 * Test processNumber
	 */
	private static void testProcessNumber() {
        System.out.println("Running processNumber test cases");
        // TODO: Write test cases for processNumber here using assertEqualsW
        // E.g., assertEquals(processNumber(1), "1");
      assertEquals(processNumber(1), "1");
      assertEquals(processNumber(3), "Fizz");
      assertEquals(processNumber(5), "Buzz");
      assertEquals(processNumber(15), "Fizzbuzz");
      assertEquals(processNumber(-3), "Fizz");
      assertEquals(processNumber(630), "Fizzbuzz");
      assertEquals(processNumber(-15), "Fizzbuzz");
    }
    
    /**
	 * Test processNumbers
	 */
    private static void testProcessNumbers() {
        System.out.println("Running processNumbers test cases");
        // TODO: Write test cases for processNumbers here using assertEquals
        // E.g., assertEquals(processNumbers(new int[] {1}), "1");
      assertEquals(processNumbers(new int[] {1}), "1");
      assertEquals(processNumbers(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 3, 11, 12, 13, 14, 15}), "1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, Fizz, 11, Fizz, 13, 14, Fizzbuzz");
    }

    /**
	 * Implement assertEquals, print out Pass if actual string equals to expected; fail otherwise
	 * @param actual actual string
	 * @param expected expected string     
	 */
    private static void assertEquals(String actual, String expected) {
        if (actual.equals(expected)) {
            System.out.println("Pass");
        }
        else {
            System.out.println(String.format("Fail: expected: %s, actual: %s", expected, actual));
        }
    }
    
    public static void main(String[] args) {
        testProcessNumber();
        testProcessNumbers();
    }
}