//program to demonstrate access specifiers.
package in.bkcmet.library;

public class Library {

	public String LibraryName;
	private long userId;
	String bookName;
	
	public void displayPublic()
	{
		System.out.println("Library Name"+LibraryName);
	}
	
	private void displayprivate()
	{
		System.out.println("User Id: "+userId);
	}
	
	void displaydefault()
	{
		System.out.println("Book Nmae: "+bookName);
	}
	
	
}
