package in.kkw.library;
import in.bkcmet.library.*;

public class LibraryExecuter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Library l=new Library();
    l.LibraryName="MET-Library";
    l.displayPublic();
    
    /*userId and displayPrivate() method is private , so we cannot access it. */
    // l.userId=4687;
    //displayprivate()
    
    /* bookname and displaydefault is default ,so we cannot 
      access it we can only access it in same package.
     */
    //l.bookName="jhk";
    //displaydefault()
	}

}
