package chapter19;

public class AF_ThreadMulti_06 {

	public static void main(String[] args) {

		// Multi Thread
		AE_ThreadMulti_05 t1 = new AE_ThreadMulti_05();
		AE_ThreadMulti_05 t2 = new AE_ThreadMulti_05();

		t1.start();
		t2.start();

	}

}
