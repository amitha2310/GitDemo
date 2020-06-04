
public class SalesMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SetAndLogin a1=new SetAndLogin();
		//a.dologin();
		System.out.println("I am in Main Method");
		System.out.println(a1.ClientName);
		a1.DoLogin();
		a1.DoLogout();
		a1.DoLogin();
		
	}

}
