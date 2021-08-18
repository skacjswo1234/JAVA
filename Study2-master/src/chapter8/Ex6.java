package chapter8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex6 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		try {	
		fis = new FileInputStream( "C:\\Users\\ITPS\\Desktop");
		
			while(true) {
				int data = fis.read();
				if(data == -1) {
					break;
				}
					System.out.println((char) data);
			}
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}	finally {
				try {
					fis.close();
			} catch (IOException e) {
					e.printStackTrace();
			}
		}	
	}
}