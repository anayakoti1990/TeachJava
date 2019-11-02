package bookstoreProject;

public class BookStoreApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book1=new Book("The Interpreter of Maldies","Jhumpa Lahiri",2019, 30);//Created an object
		Book book2=new Book("The Room on the Roof", "Ruskin Bond", 2019, 40);
		//Declaring the property values for one object or one book
		/*book1.author="Jhumpa Lahiri";
		book1.title="The Interpreter of Maldies";
		book1.publicationDate=2019;
		book1.price=29.17;
      Book book2 = new Book();//Created second object 
      //Declared the property values for second object or second book
      book2.author="Ruskin Bond";
      book2.title="A Room on the Roof";
      book2.publicationDate=2019;
      book2.price=33.17;
      book1.displayBookInformation();
      book2.displayBookInformation();
      */
		 book1.displayBookInformation();
	     book2.displayBookInformation();
	}

}
