package wrappers;

public class LeafTapWrappers extends GenericWrappers{
	
	public void Login () throws Exception {
	invokeApp("chrome", "http://leaftaps.com");
	enterById("username", "DemoSalesManager");
	enterById("password", "crmsfa");
	clickByClassName("decorativeSubmit");
	}
}
