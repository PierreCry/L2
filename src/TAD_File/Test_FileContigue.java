package TAD_File;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Test_FileContigue {
	
	FileContigue f;

	@BeforeEach
	void setUp() throws Exception {
		this.f = new FileContigue();
	}

	@AfterEach
	void tearDown() throws Exception {}

	@Test
	void test1() throws ExceptionFileVide {
		assertEquals(f.est_vide(),true);
		f.enfiler('b');
		assertEquals(f.est_vide(),false);
		f.defiler();
		assertEquals(f.est_vide(),true);
	}
	
	@Test
	void test2() throws ExceptionFileVide {
		f.premier();
	}
	
	@Test
	void test3() throws ExceptionFileVide {
		f.defiler();
	}
	
	@Test
	void test4() throws ExceptionFileVide {
		f.enfiler('a'); f.enfiler('b'); f.enfiler('c');
		assertEquals(f.premier(),'a'); f.defiler();
		assertEquals(f.premier(),'b'); f.defiler();
		assertEquals(f.premier(),'c'); f.defiler();
	}

}
