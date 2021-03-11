package FileInfo;

import java.io.FileNotFoundException;

public class FileInforDemo {
	public static void main(String [] args) throws FileNotFoundException {
		FileInfo.wordCounter("input.txt");
		FileInfo.wordOccurrences("input.txt");
	}
}
