package assignments.lab3;

import java.io.File;
import java.util.Scanner;

public class FileInfo {

	public static void main(String[] args) {
		System.out.println("enter the path");
		Scanner sc = new Scanner(System.in);
		String fi = sc.next();
		File f1 = new File(fi);
		System.out.println(f1.getName());
		System.out.println(f1.exists() ? "exist" : "does not exist");
		System.out.println(f1.canWrite() ? "is Writable " : "is not writable");
		System.out.println(f1.canRead() ? "is readable " : "is not readable");

		String extension = " ";
		int i = fi.lastIndexOf('.');
		if (i > 0) {

			extension = fi.substring(i + 1);

		}
		System.out.println("extension: " + extension);
		System.out.println("FileSize: " + f1.length() + "bytes");
		sc.close();
	}

}
