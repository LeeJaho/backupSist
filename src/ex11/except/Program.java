package ex11.except;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Program {

	public static void main(String[] args) throws Exception {
		saveExamFile();
		System.out.println("program end");

	}

	private static void saveExamFile(){
		// FileInputStream fis = new FileInputStream("res/test1.txt");
		int x = 3;
		int y = -1;

		//FileInputStream fos = null;

		int z = Calculator.add(x, y);
	/*	fos = new FileInputStream("res/test1.txt");

		fos.close();*/
	}
}
