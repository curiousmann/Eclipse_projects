package assignments.lab3;

import java.io.FileReader;
import java.io.IOException;

public class FileDetails3 {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("C:\\Users\\Mann\\Desktop\\JAVA\\DEMO\\ex3.txt");
		int i = fr.read(),char_num=1,line_num=1,wrd_num=1;
		while(i!=-1) {
			if((char)i=='\n')
				line_num++;
			if((char)i==' ')
				wrd_num++;
			char_num++;
			i = fr.read();
		}
		fr.close();
		System.out.println("File contain "+char_num+" characters, "+wrd_num+" words and "+line_num+" lines.");
	}
}
