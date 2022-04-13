package assignments.lab3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MoveFile {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("C:\\Users\\Mann\\Desktop\\JAVA\\DEMO\\Data.txt");
		BufferedReader br =new BufferedReader(fr);
		FileWriter fw = new FileWriter("C:\\Users\\Mann\\Desktop\\JAVA\\DEMO\\Data_Out.txt");
		PrintWriter pw  = new PrintWriter(fw); 
		String s = br.readLine();

		while (s!=null) {
			pw.write(s+"\n");
			s=br.readLine();
		}

		System.out.println("Successfully copied the contents of Data.txt to Data_Out.txt");

		fr.close();
		br.close();
		pw.flush();
		pw.close();
	}
}