package chapter09;

public class AC_HttpServletMain_03 {

	public static void main(String[] args) {
		
		method(new LoginService());
		method(new FileDownloadService());

	}
	
	public static void method(HttpServlet a) {
		a.service();
	}

}
