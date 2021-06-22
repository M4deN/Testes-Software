package Pack1;

public class Util {
	public int fatorial(int num) {
		if(num==0)
			return 1;
		var sum = 1;
		for(int i = 1; i <= num; i++)
			sum = sum*i;
		return sum;
	}
}
