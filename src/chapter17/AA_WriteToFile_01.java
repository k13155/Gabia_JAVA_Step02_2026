package chapter17;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AA_WriteToFile_01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("파일에 저장할 내용을 입력하세요: ");
		String content = scan.nextLine();
		
		// BufferedWriter 파일에 바로 쓰지않고 임시 메모리에 한번 쓰고 출력될때 한번에 출력됨, writer: 텍스트만 만들 수 있음
		try(BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt")))
			{
				writer.write(content);
				System.out.println("내용일 파일에 저장되었습니다.");
			}
		
		catch (Exception e) 
		{
			e.printStackTrace();
			System.out.println("파일을 쓰는 도중 오류 발생" + e.getMessage());
		}
		
		finally
		{
			scan.close();
		}
		
		
		
	}

}
