package chapter17;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class AI_DataOutputStream_09 {
	
	public static void main(String[] args) {
		
		String filePath = "datastream_output.dat";
		
		// DataOutputStream을 사용하여 기본형 데이터를 파일에 저장
		// Output = Writer
		try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(filePath)))
		{
			dos.writeUTF("Hello, DataOutputStream!"); // String
			dos.writeInt(123);
			dos.writeDouble(45.67);
			System.out.println("데이터가 파일에 성공적으로 저장되었습니다.");
		} 
		
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	
		// DataInputStream을 사용하여 기본형 데이터를 읽기
		// Input = read
		try (DataInputStream dis = new DataInputStream(new FileInputStream(filePath)))
		{
			String message = dis.readUTF(); // String
			int number = dis.readInt(); // int
			double decimal = dis.readDouble(); // double
			
			System.out.println("파일에서 읽은 데이터: ");
			System.out.println("Message: " + message);
			System.out.println("Number: " + number);
			System.out.println("Decimal: " + decimal);
		} 
		
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
	}

}
