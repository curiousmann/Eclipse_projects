package assignments.lab3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadAndLineNumber2 {
	public static void main(String[] args) throws IOException {
		int num=1;
		FileReader fr = new FileReader("C:\\Users\\Mann\\Desktop\\JAVA\\DEMO\\ex2.txt");
		BufferedReader br = new BufferedReader(fr);
		String s = br.readLine();
		while(s!=null) {
			System.out.println(num+++". "+s);
			s=br.readLine();
		}
		System.out.println(" ");
		br.close();
	}
}
