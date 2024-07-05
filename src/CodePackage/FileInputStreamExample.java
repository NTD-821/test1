package CodePackage;

import java.io.FileInputStream;
public class FileInputStreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		FileInputStream fout = new FileInputStream("C:\\java_file\\javainputread.txt");
	    int a = 0;
	    while((a=fout.read())!=-1) {
	    System.out.print((char)a);
	    }
	    fout.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
