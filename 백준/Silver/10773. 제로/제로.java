import java.io.*;
import java.util.Stack;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int repeat = Integer.parseInt(br.readLine());
        int result = 0;
        Stack<Integer> a = new  Stack<>();

        for (int i = 0; i < repeat; i++) {
            int input =  Integer.parseInt(br.readLine());

            if (input != 0){
                a.push(input);
            } else {
                a.pop();
            }
        }

        for (int i = 0 ; i < a.size(); i++) {
            result += a.get(i);
        }

        bw.write(result+"");
        bw.flush();
        bw.close();
    }
}