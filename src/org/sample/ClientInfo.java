package org.sample;
import org.base.CompanyInfo;
public class ClientInfo extends CompanyInfo {
	private void clientId() {
		System.out.println("client id is : 666");

	} private void clientName() {
		System.out.println("client name is : bala");
	} public static void main(String[] args) {
		 ClientInfo s = new ClientInfo();
		 s.clientId();
		 s.clientName();
		 s.empName();
		 s.empId();
		 s.compId();
		 s.compName();
		 System.out.println("babu");
		 System.out.println("raj");
		 
	}

}
