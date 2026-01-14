package chapter08;

public class Example_CalPlus extends Example{
	
	int a;

	@Override
	public int getResult(int n1, int n2) {
		a = n1 + n2;
		return a;
	}

	
	
	/*
	@Override
	public int getResult(int n1, int n2) {
		return n1 + n2;
	}
	*/

}
