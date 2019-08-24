package TAD_Liste;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Test_ListeContigue {
	
	Liste l;

	@BeforeEach
	void setUp() throws Exception {
		l = new ListeContigue();
	}

	@AfterEach
	void tearDown() throws Exception {}

	@Test
	void test1() {
		assertEquals(l.longueur(),0);
	}
	
	@Test
	void test2() throws ExceptionIndiceHorsLimites {
		l.inserer(0,'b');
		assertEquals(l.ieme(0),'b');
	}
	
	@Test
	void test3() throws ExceptionIndiceHorsLimites {
		l.inserer(0,'b');
		assertEquals(l.longueur(),1);
	}
	
	@Test
	void test4() throws ExceptionIndiceHorsLimites {
		l.inserer(0,'b');
		l.supprimer(0);
		assertEquals(l.longueur(),0);
	}
	
	@Test
	void test5() throws ExceptionIndiceHorsLimites {
		l.inserer(0,'b');
		l.inserer(0,'c');
		l.inserer(0,'d');
		l.inserer(0,'e');
		assertEquals(l.toString(),"[ b c d e ]");
	}
	
}
