package bookstoreProject;

public class Book {
//These are the properties inside the class.
	String title;
	String author;
	int publicationDate;
	double price;
	//Lets create a constructor
	
	  Book(String title, String author, int publicationDate, double price){
	  this.author=author; this.price=price; this.title=title;
	  this.publicationDate=publicationDate; }
	 
	
	public void displayBookInformation() {
		 System.out.println("-------------------------- ");
		System.out.println("Title: "+title+"\n Author name:"+author+"\n Published in Year:"+publicationDate+ "\n Cost:"+price);
	   
	}
	
}
