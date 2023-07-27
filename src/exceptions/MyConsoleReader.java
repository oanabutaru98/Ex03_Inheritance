package exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyConsoleReader {
    public void readInputPrint() {
        StringBuffer sb = new StringBuffer();

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("enter a line of text or 'stop'");
            String line = br.readLine();
            while(!line.equals("stop")) {
                if (line.equals("exception")) {
                    throw new IOException("will throw exception");
                }
                sb.append(line + "\n");
                System.out.println("enter a line of text or 'stop'");
                line = br.readLine();
            }
            System.out.println(sb);
        } catch (IOException e) {
            System.out.println("Error on console input: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        MyConsoleReader reader = new MyConsoleReader();
        reader.readInputPrint();
    }
}
