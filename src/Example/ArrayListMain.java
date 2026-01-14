package Example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListMain {

	public static void main(String[] args) {

		ArrayList<Axample> arr = new ArrayList<Axample>();

		Axample d = new Axample();

		while (true) 
		{
		    Scanner scan = new Scanner(System.in);

		    System.out.print("아이디 생성(exit 입력시 종료): ");
		    //String id = scan.next();
		    //String d = scan.next();
		    d.setId(scan.next());

		    // exit 입력 시 종료
		    if (d.equals("exit")) {	
		    	// -> d.setId(scan.next()))를 사용하게 된다면 id에서 오류뜸, scan을 사용시 객체와 String을 비교하게 되므로 오류뜸
		        System.out.println("프로그램을 종료합니다.");
		        break;
		        
		    }

		    System.out.print("패스워드 입력: ");
		    //int pwd = scan.nextInt();
		    d.setPwd(scan.nextInt());

		    //Axample d = new Axample();  // ★ 여기서 새 객체 생성
		    //d.setId(id);
		    //d.setPwd(pwd);

		    arr.add(d);

		    System.out.println(d.getId());
		    System.out.println(d.getPwd());
		}

	}

}