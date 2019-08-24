package TAD_Pile;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Test_PileChainee {

	PileChainee p;

	@BeforeEach
	void setUp() throws Exception {
		this.p = new PileChainee();
	}

	@AfterEach
	void tearDown() throws Exception {}

	@Test
	void test1() {
		assertEquals(p.est_vide(),true);
	}
	
	@Test
	void test2() throws Exception {
		p.empiler('a');
		assertEquals(p.est_vide(),false);
	}
	
	@Test
	void test3() throws Exception {
		p.empiler('a');
		assertEquals(p.sommet(),'a');
	}
	
	@Test
	void test4() throws Exception {
		p.empiler('a');
		p.depiler();
		assertEquals(p.est_vide(),true);
	}

}
