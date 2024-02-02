package models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BookTest {

	//G
	@Test
	public void test2EqualBooks() {
		Book book1 = new Book(1,"Harry Potter och De Vises Sten", "J.K. ROWLING", "5392759873029", "Fantasy", 367);
		Book book2 = new Book(1,"Harry Potter och De Vises Sten", "J.K. ROWLING", "5392759873029", "Fantasy", 367);
		assertEquals(book1, book2);
	}


	//G
	@Test
	public void test2NonEqualBooks() {
		Book book3 = new Book(1,"Harry Potter och De Vises Sten", "J.K. ROWLING", "5392759873029", "Fantasy", 367);
		Book book4 = new Book(2,"Harry Potter och Hemligheternas Kammare", "J.K. ROWLING", "5392759873029", "Fantasy", 367);
		assertNotEquals(book3, book4);

	}

}
