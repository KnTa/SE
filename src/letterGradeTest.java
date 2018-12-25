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
		Assert.assertEquals('A', lg.main(95));
		Assert.assertEquals('B', lg.main(85));
		Assert.assertEquals('C', lg.main(75));
		Assert.assertEquals('D', lg.main(65));
		Assert.assertEquals('F', lg.main(30));	
		Assert.assertEquals('X', lg.main(101));
		Assert.assertEquals('X', lg.main(-1));
	}
	
	@Test
	public void bva_test() {
		Assert.assertEquals('A', lg.main(100));
		Assert.assertEquals('A', lg.main(90));
		Assert.assertEquals('B', lg.main(89));
		Assert.assertEquals('B', lg.main(80));
		Assert.assertEquals('C', lg.main(79));
		Assert.assertEquals('C', lg.main(70));
		Assert.assertEquals('D', lg.main(69));
		Assert.assertEquals('D', lg.main(60));
		Assert.assertEquals('F', lg.main(59));
		Assert.assertEquals('F', lg.main(0));
		Assert.assertEquals('X', lg.main(101));
		Assert.assertEquals('X', lg.main(-1));
	}
	
}
