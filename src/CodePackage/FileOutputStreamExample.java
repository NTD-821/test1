package CodePackage;
import java.io.FileOutputStream;

public class FileOutputStreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream fout = new FileOutputStream("C:\\java_file\\javacode.txt");
			String s ="Shubham";
			byte b[] = s.getBytes();
			fout.write(b);
			fout.close();
			System.out.println("success");
		}
		catch(Exception e){
			System.out.println(e);
			
		}

	}

}
