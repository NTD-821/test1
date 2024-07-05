package CodePackage;


class Studentt{
	int i;
	String name;
	
	void insert(int a,String b) {
		i = a;
		name = b;
	}
	void display() {
		System.out.println(i + name);
		System.out.println("hello myJ abcdeDDDo code");
	}
}
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Studentt s1 = new Studentt();
        s1.insert(34, "Ajay");
        s1.display();
	}

}
