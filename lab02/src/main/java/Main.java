
public class Main {

    public static void main(String[] args) {
/*
	System.out.println(toThePower(3,2));
	System.out.println(toThePower(2,8));
	System.out.println(toThePower(2,-1));
	System.out.println(willItSplitFairly(4,0));
	System.out.println(willItSplitFairly(0,3));
	System.out.println(willItSplitFairly(3,9));
	System.out.println(willItSplitFairly(4,2));
	System.out.println(howManyOnes(1));
	System.out.println(howManyOnes(2));
	System.out.println(howManyOnes(3));
	System.out.println(howManyOnes(4));
	System.out.println(howManyOnes(11));
	int[] testarray = {6,8,20,2};
	System.out.println(greatestDifference(testarray));
	System.out.println(toDayOfWeek(3));
	System.out.println(isLetter('a'));
	System.out.println(isLetter('Z'));
	System.out.println(isLetter('8'));
	System.out.println(toLowerCase('D'));
	System.out.println(toLowerCase('d'));
	System.out.println(toLowerCase('2'));
	System.out.println(isPalindromeSimple("mom".toCharArray()));
	System.out.println(isPalindromeSimple("bubble".toCharArray()));
*/
//	System.out.println(isPalindromeComplex("mom".toCharArray()));
//	System.out.println(isPalindromeComplex("Race car".toCharArray()));
//	System.out.println(isPalindromeComplex("#-mom-#".toCharArray()));
//	System.out.println(isPalindromeComplex("food".toCharArray()));
//	System.out.println(isPalindromeComplex("Was it a car or a cat I saw?".toCharArray()));
    }

    /**
     * @param base
     * @param power
     * @return base ^ power
     */
    public static double toThePower(double base, double power) {
	if(power == 0){
		return 1;
	}
	if(power > 1){
		double value = 1;
		for(int i=0; i < power; i++){
			value = value * base;
		}
		return value;
	}
	else{
		double value = 1;
		for(int i=0; i < ((double)0 - power); i++){
			value = value * base;
		}
		return (double)1 / value;
	}
    }

    /**
     * @param pieces Number of pieces to split
     * @param people Number of people to split pieces beteween
     * @return true if the specified value will split evenly among the provided number of people, with
     *         each person getting at least 1 piece
     */
    public static boolean willItSplitFairly(int pieces, int people) {
	if(pieces != 0 && people != 0){
		if((pieces / people >= 1) && (pieces % people == 0)){
			return true;
		}
	}
        return false;
    }

    /**
     * Return the number of '1's represented in the binary form of the provided number
     * @param num
     * @return
     */
    public static int howManyOnes(int num) {
	int count = 0;
	while (num >= 1){
		if((num & 1) == 1){
			count++;
		}
		num = num >>> 1;
	}
        return count;
    }


    /**
     * Return the greatest difference between numbers in the provided array
     * @param numbers
     * @return
     */
    public static int greatestDifference(int[] numbers){
	if(numbers.length > 0){
		int lowest = numbers[0];
		int highest = numbers[0];
		for(int i = 1; i < numbers.length; i++){
			if(numbers[i] < lowest){
				lowest = numbers[i];
			}
			if(numbers[i] > highest){
				highest = numbers[i];
			}
		}
		return highest - lowest;
	}
	return -1;
    }
    /**
     *
     * @param day
     * @return English representation of the provided day
     */
    public static String toDayOfWeek(int day) {
	String dayname = "";
	switch(day){
		case 1:
			dayname = "Sunday";
			break;
		case 2:
			dayname = "Monday";
			break;
		case 3:
			dayname = "Tuesday";
			break;
		case 4:
			dayname = "Wednesday";
			break;
		case 5:
			dayname = "Thursday";
			break;
		case 6:
			dayname = "Friday";
			break;
		case 7:
			dayname = "Saturday";
			break;
		default:
			dayname = "Invalid";
	}
        return dayname;
    }



    /**
     *
     * @param c - An ASCII character
     * @return If an uppercase character was passed in, returns the corresponding lowercase characters (a-z)
     *      If a non-uppercase character was passed in, that value is returned unmodified
     */
    public static char toLowerCase(char c) {
	if(c > 64 && c < 91){
		return (char)(c + 32);
	}
	else if(c > 96 && c < 123){
		return c;
	}
        return '!';
    }

    /**
     *
     * @param c
     * @return true if the character is a letter, false otherwise
     */
    public static boolean isLetter(char c) {
	if((c > 64 && c < 91) || (c > 96 && c < 123)){
		return true;
	}
        return false;
    }

    /**
     * Palindrome: https://en.wikipedia.org/wiki/Palindrome
     * @param characters A char[] containing only lowercase characters
     * @return true if the provided word is a palindrome.
     */
    public static boolean isPalindromeSimple(char[] characters) {
	if(characters.length < 1){
		return false;
	}
	int i = 0;
	int j = characters.length - 1;
	boolean check = true;
	while(i < characters.length)
	{
		if(characters[i] != characters[j]){
			check = false;
			break;
		}
		i++;
		j--;
	}
	return check;
    }



    /**
     * Palindrome: https://en.wikipedia.org/wiki/Palindrome
     * @param characters A char[] containing uppercase, lowercase, and punctuation
     * @return true if the provided word is a palindrome.
     */
    public static boolean isPalindromeComplex(char[] characters) {
	if(characters.length < 1){
		return false;
	}
	int i = 0;
	int j = characters.length - 1;
	boolean check = true;

	while(i < characters.length)
	{
		System.out.println("Top of outerloop");
		System.out.println("i: " + i);
		System.out.println("j: " + j);
		for(int iloop = i; iloop < characters.length; iloop++){
			if(isLetter(characters[i]) == false){
				i++;
			}
			else{
				break;
			}
		}
		for(int jloop = j; jloop > 0; jloop--){
			if(isLetter(characters[j]) == false){
				j--;
			}
			else{
				break;
			}
		}
		if(toLowerCase(characters[i]) != toLowerCase(characters[j])){
			check = false;
			break;
		}
		i++;
		j--;
		System.out.println("Bottom of outerloop");
		System.out.println("i: " + i);
		System.out.println("j: " + j);
	}
        return check;
    }

}
