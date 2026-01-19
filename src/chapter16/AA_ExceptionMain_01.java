package chapter16;

// Exception: 프로그램 실행중 발생할 수 있는 예외 상황(오류,에러 등)을 처리하기 위한 메커니즘
// 예외가 발생하면 프로그램의 정상적인 흐름을 중단하고 예외를 처리하거나 복구할 수 있도록 설계된 구조
public class AA_ExceptionMain_01 { 

	public static void main(String[] args) {
		
		String[] sarr = { "soldesk", "developer", "course" };
		
		for(int i = 0; i < sarr.length; i++)
		{
			try // -> 예외 발생 위험 존재 코드
			{
				System.out.println(sarr[i]);
			} 
			
			catch (Exception e)  // 에러를 잡아줌, 예외 발생했을 경우, 이를 처리하기 위한 코드
			{
				System.out.println("예외 발생");
				System.out.println(e.getMessage());
			}// try
		}

	}

}
