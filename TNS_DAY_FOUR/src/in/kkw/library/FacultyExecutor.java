package in.kkw.library;
import in.bkcmet.library.*;

public class FacultyExecutor {

	public static void main(String[] args)
	{
		
		Library l = new Library();
		l.libraryName=("MET-Libary");
		l.displayPublic();
		
		
		/* userId and  DisplayPrivate() Method is private so we can't access into another package or class , only
		 * we can access inside the same class*/ 
		//l.userId=12344;
		//1.displayPrivate()
		
		
		/* Books name and displayDefulat is  Default we can't* access into Another package
		 *  only we can access in same package*/
		//l.booksName;
		//1.displayDefault
	}

}
