package oops;

public class RunnnerClass {

	public static void main(String[] args) {
		BankClass B= new BankClass();
		B.DisplayBalance();
		int Bal=B.GeBalance();
		System.out.println(B.GeBalance());
		System.out.println(Bal);

		Chrome ch=new Chrome();
		ch.OpenBrowser();
		ch.CloseBrowser();
		ch.show();
		
		Browser br=new Chrome();
		br.OpenBrowser();
		br.CloseBrowser();
		br.displayname();
		
		EncapsulationExample En=new EncapsulationExample();
		En.setBalance(3000);
		System.out.println(En.getBalance());
	}
	
	

}
