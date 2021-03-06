package business;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;

import business.Book;
import dataaccess.DataAccess;
import dataaccess.DataAccessFacade;

public interface ControllerInterface {
	public void login(String id, String password) throws LoginException;
	public List<String> allMemberIds();
	public List<String> allBookIds();
	public List<Book> allBooks();
	public List<LibraryMember> allLibraryMembers();
	public void saveNewMembercontroller(LibraryMember member);
	public void saveNewBookcontroller(Book member);
	public void saveNewCheckOutRecordcontroller(CheckOutRecord checkoutrecord);
	public void updateBookcontroller(Book book);
	public HashMap<String,Book> allBooksHashmap();
	public HashMap<String,CheckOutRecord> allCheckOutRecordsHashmap();
	public HashMap<String,LibraryMember> allLibraryMembersHashmap();
	
	
}
