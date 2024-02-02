package models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import utilities.GenderType;

import java.time.LocalDate;

public class LoanTest {

	//VG
	@Test
	public void testDueDate() {
		Customer customer1 = new Customer("Mr", "Adam", "Johansson", "Kungsgatan 4", "0706352464", "adam@mail.se", 1, GenderType.MALE);
		Book book1 = new Book(1, "Learning Rust", "Johan Johansson", "3253857649387", "Non Fiction", 645);
		Loan loan1 = new Loan(1, customer1, book1);
		assertEquals(LocalDate.now().plusDays(14), loan1.getDueDate());
		assertNotEquals(LocalDate.now().plusDays(13), loan1.getDueDate());
   }
}