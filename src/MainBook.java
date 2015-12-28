
import it.pcacademy.corsojava.classi.Book;
import it.pcacademy.corsojava.classi.Author;;
public class MainBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Creo gli Autori");
		Author author1 = new Author("Emanuele", "Cochi");
		Author author2 = new Author("Mario", "Rossi");
		
		System.out.println(author1.getName() + " " + author1.getLastName() +  " Numero di libri: " + author1.getNumberBooks());
		System.out.println(author2.getName() + " " + author2.getLastName() +  " Numero di libri: " + author2.getNumberBooks());
		
		System.out.println("Creo i libri");
		Book book1 = new Book("La storia", author1, "2015", "Ciao");
		Book book2 = new Book("La storia 2", author2, "2015", "Ciao");
		
		System.out.println("Il libro " + book1.getTitle() + " è di " + book1.getAuthor().getName());
		System.out.println("Il libro " + book2.getTitle() + " è di " + book2.getAuthor().getName());
		
		System.out.println(author1.getName() + " " + author1.getLastName() +  " Numero di libri: " + author1.getNumberBooks());
		System.out.println(author2.getName() + " " + author2.getLastName() +  " Numero di libri: " + author2.getNumberBooks());
		
		System.out.println("Cambio l'autore del libro " + book1.getTitle());
		book1.changeAuthor(author2);
		
		System.out.println(author1.getName() + " " + author1.getLastName() +  " Numero di libri: " + author1.getNumberBooks());
		System.out.println(author2.getName() + " " + author2.getLastName() +  " Numero di libri: " + author2.getNumberBooks());
		
		System.out.println("Il libro " + book1.getTitle() + " è di " + book1.getAuthor().getName());
		System.out.println("Il libro " + book2.getTitle() + " è di " + book2.getAuthor().getName());
	}

}
