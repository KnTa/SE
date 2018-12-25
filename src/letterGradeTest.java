import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class letterGradeTest {

	letterGrade lg;
	@Before
	public void setUp() throws Exception {
		lg = new letterGrade();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void ep_test() {
		Assert.assertEquals('A', lg.letterGrade(95));
		Assert.assertEquals('B', lg.letterGrade(85));
		Assert.assertEquals('C', lg.letterGrade(75));
		Assert.assertEquals('D', lg.letterGrade(65));
		Assert.assertEquals('F', lg.letterGrade(30));	
		Assert.assertEquals('X', lg.letterGrade(101));
		Assert.assertEquals('X', lg.letterGrade(-1));
	}
	
	@Test
	public void bva_test() {
		Assert.assertEquals('A', lg.letterGrade(100));
		Assert.assertEquals('A', lg.letterGrade(90));
		Assert.assertEquals('B', lg.letterGrade(89));
		Assert.assertEquals('B', lg.letterGrade(80));
		Assert.assertEquals('C', lg.letterGrade(79));
		Assert.assertEquals('C', lg.letterGrade(70));
		Assert.assertEquals('D', lg.letterGrade(69));
		Assert.assertEquals('D', lg.letterGrade(60));
		Assert.assertEquals('F', lg.letterGrade(59));
		Assert.assertEquals('F', lg.letterGrade(0));
		Assert.assertEquals('X', lg.letterGrade(101));
		Assert.assertEquals('X', lg.letterGrade(-1));
	}

}
