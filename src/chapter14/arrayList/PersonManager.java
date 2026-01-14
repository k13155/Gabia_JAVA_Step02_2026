package chapter14.arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class PersonManager {

	public void personMgr() {

		int select;
		Person p;

		// Person객체들만 저장할 ArraryList생성(personarr)
		// Person에 있는 객체를 나열해 저장하고 personarr이라는 객체에 정보를 넣는다? (heap메모리)
		// index접근 속도가 빠르다
		ArrayList<Person> personarr = new ArrayList<Person>();

		while (true) {
			System.out.print("(1)회원가입, (2)정보삭제,(3)정보검색,(4)종료:");

			Scanner scan = new Scanner(System.in);
			select = scan.nextInt();
			
			switch(select){
			case 1:{
				p = new Person();
				
				System.out.println("---정보를 추가합니다.---");
				
				System.out.print("이름: ");
				//String name = scan.nextLine();
				//p.setName(name);
				p.setName(scan.next());
				
				System.out.print("나이: ");
				//int age = scan.nextInt();
				//p.setAge(age);
				p.setAge(scan.nextInt());
				
				System.out.print("전화번호: ");
				//String tel = scan.nextLine();
				//p.setTel(tel);
				p.setTel(scan.next());
				
				// ArrayList에 추가
				personarr.add(p); // -> p는 객체가 아니라 오류뜸
				System.out.println("회원가입완료");
				break;
			}
			
			case 2:{
				
				System.out.println("---정보를 삭제합니다--");
				System.out.print("탈퇴회원 이름: ");
				String name = scan.next();
				
				for(int i = 0; i < personarr.size(); i++) 
				{
					if(personarr.get(i).getName().equals(name))
					{
						personarr.remove(i);
						System.out.println(name + "님의 정보가 삭제되었습니다.");
						break;
					}
					
					else
					{
						if(i +1 == personarr.size())
						{
							System.out.println(name + "님의 정보는 존재하지 않습니다.");
						}// if
					}//if
				}//for
				
				break;
			}
			
			case 3:{
				
				for(Person p1 : personarr)
				{
					System.out.println(p1); 
					// -> Person(class)에서 toString해주지 않으면 결과값이 나오는게 아니라 주소값이 나옴
				}
				
				/*
				Iterator<Person> it = personarr.iterator();
				
				while (it.hasNext()) 
				{
					p = it.next();
					System.out.println("이름: " + p.getName());
					System.out.println("나이: " + p.getAge());
					System.out.println("전화번호: " + p.getTel());
					System.out.println("------------------");
				}// while*/
				
				break;
				
			}
			
			default:
				System.out.println("프로그램 종료");
				return;
			}// switch

		} // while

	}// personMgr
}// class