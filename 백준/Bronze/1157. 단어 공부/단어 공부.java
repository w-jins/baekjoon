
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.InterruptedIOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));		
	
		String st = br.readLine();
		int[] a = new int[26];
		Arrays.fill(a, 0);
		int max = -1;
		for(int j = 0 ; j < a.length; j++) {
			for(int i = 0; i < st.length(); i++) {
				if(st.charAt(i) == (char)(97+j) || st.charAt(i) == (char)(65+j) ) {
					a[j]++;
				}
			}
		}
		char ch = '?';
		for(int i = 0 ; i< a.length; i++) {
			if(max < a[i]) {
				max = a[i];
				ch = (char)(65+i);
			}
			else if(max == a[i]) { 
				ch = '?';
			}
		}
		bw.write(ch+"");
		bw.flush();
		bw.close();
	}
}
