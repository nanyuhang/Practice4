package practice4;

public class operator {
	public operator() {
		
	}
	public  int add(int a, int b) {
		return a + b;
	}
	public  int min(int a, int b) {
		return a - b;
	}
	public  int multiply(int a, int b) {
	
		return a * b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y;
		x = 2;
		y = 4;
		operator operator1=new operator();
		System.out.println(operator1.multiply(x, y));
	}

}
