package package2;

public class MainApp {
	public static void main(String[] args) {
		System.out.print("2st Version1 ");//我是組員
		Math cMath=new Math();
		System.out.print(cMath.add(10, 5));//
	}
}
class Math{
	int add(int a,int b) {
		return a+b;
	}
}


