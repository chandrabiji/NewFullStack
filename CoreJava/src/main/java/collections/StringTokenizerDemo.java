package collections;

import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String[] args) {
		String str = "This is sample message to test string tokenizer";
		StringTokenizer st = new StringTokenizer(str," ");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

	}

}
